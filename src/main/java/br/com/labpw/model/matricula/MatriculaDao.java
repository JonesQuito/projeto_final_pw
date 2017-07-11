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
	
	public List<Matricula> listar() throws SQLException{
		List<Matricula> matriculas = new ArrayList<Matricula>();
		String sql = "select * from matricula";
		PreparedStatement stmt = this.connection.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		while(rs.next()){
			Matricula matricula = new Matricula();
			matricula.setCodAluno(rs.getInt(1));
			matricula.setCodDisciplina(rs.getInt(2));
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
