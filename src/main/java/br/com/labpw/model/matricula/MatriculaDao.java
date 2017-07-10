package br.com.labpw.model.matricula;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

}
