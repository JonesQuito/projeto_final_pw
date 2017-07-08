package br.com.labpw.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
	
	private static Connection conexao = null;
	
	public static Connection getConexao() throws SQLException{
		String port = System.getProperty("mysqlport");
		port = (port==null? "3306": port);
		if(conexao==null){
		conexao = DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/banco1_ufg", "root","123456");
		}
		return conexao;
	}

}
