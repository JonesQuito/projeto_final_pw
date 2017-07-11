package br.com.labpw.model.matricula;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MatriculaDao {
	
	private Connection connection;
	
	public MatriculaDao(Connection connection){
		this.connection = connection;
	}
	
	
	public void registrar(Matricula matricula) throws SQLException{	
		String sql = "insert into matricula (Aluno, Disciplina, Status, DataMatricula) values (?, ?, ?, ?)";
		PreparedStatement pst = this.connection.prepareStatement(sql);
		// Converte a data de Calendar para Date(java.sql)
		Date dataMatricula = new Date(matricula.getDataMatricula().getTimeInMillis());
		pst.setInt(1, matricula.getCodAluno());
		pst.setInt(2, matricula.getCodDisciplina());
		pst.setInt(3, matricula.getStatus());
		pst.setDate(4, dataMatricula);
		
		pst.execute();
	}
	
	public List<Matricula2> listar() throws SQLException{
		List<Matricula2> matriculas = new ArrayList<Matricula2>();
		String sql;
		sql = "select aluno.Nome, disciplina.Nome, matricula.Status, matricula.DataMatricula from aluno inner join matricula on (matricula.Aluno = aluno.MatrAluno) inner join disciplina on(disciplina.CodDisciplina= matricula.Disciplina)";
		
		PreparedStatement stmt = this.connection.prepareStatement(sql);
		
		ResultSet rs = stmt.executeQuery();
		while(rs.next()){
			Matricula2 matricula = new Matricula2();
			matricula.setNomeAluno(rs.getString(1));
			matricula.setNomeDisciplina(rs.getString(2));
			matricula.setStatus(rs.getInt(3));
			
			//Converte data de matrícula
			Calendar dataMatricula = Calendar.getInstance();
			dataMatricula.setTime(rs.getDate(4));
			
			matricula.setDataMatricula(dataMatricula);
			
			matriculas.add(matricula);
		}
		return matriculas;
	}

	public List<Matricula2> listarComParametro(String parametro) throws SQLException{
		List<Matricula2> matriculas = new ArrayList<Matricula2>();
		String sql;
		sql = "select aluno.Nome, disciplina.Nome, matricula.Status, matricula.DataMatricula from aluno inner join matricula on (matricula.Aluno = aluno.MatrAluno) inner join disciplina on(disciplina.CodDisciplina= matricula.Disciplina and disciplina.Nome like ? '%')";
		
		PreparedStatement stmt = this.connection.prepareStatement(sql);
		stmt.setString(1, parametro);
		ResultSet rs = stmt.executeQuery();
		while(rs.next()){
			Matricula2 matricula = new Matricula2();
			matricula.setNomeAluno(rs.getString(1));
			matricula.setNomeDisciplina(rs.getString(2));
			matricula.setStatus(rs.getInt(3));
			
			//Converte data de matrícula
			Calendar dataMatricula = Calendar.getInstance();
			dataMatricula.setTime(rs.getDate(4));
			
			matricula.setDataMatricula(dataMatricula);
			
			matriculas.add(matricula);
		}
		return matriculas;
	}
}
