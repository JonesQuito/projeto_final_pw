package apiRest.services;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

import apiRest.conexao.ConnectionFactory;
import apiRest.modelo.disciplina.Disciplina;
import apiRest.modelo.disciplina.DisciplinaDao;

@Path("/disciplina")
public class DisciplinaService {
	
	@GET
	@Path("list")
	@Produces("application/json")
	public String getList(){
		List<Disciplina> disciplinas = new ArrayList<Disciplina>();
		Connection connection = new ConnectionFactory().getConnection();
		DisciplinaDao dao = new DisciplinaDao(connection);
		try{
			disciplinas = dao.listar();
		}catch(SQLException e){
			System.out.println("Erro ao listar disciplinas DisciplinaDao metodo listar(): " + e.getMessage());
		}
		
		Gson g = new Gson();
		return g.toJson(disciplinas);
	}

}
