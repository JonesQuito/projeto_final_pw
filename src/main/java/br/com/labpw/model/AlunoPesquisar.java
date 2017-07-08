package br.com.labpw.model;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.labpw.connection.ConnectionFactory;

public class AlunoPesquisar implements LogicaAluno {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
				
		String nome = request.getParameter("nome");
		
		if(nome==null){		
			Connection connection = new ConnectionFactory().getConnection();			
			List<Aluno> lista = new AlunoDao(connection).getLista();			
			connection.close();			
			request.setAttribute("lista", lista);			
			return "aluno_listar.jsp";

		}else{
			Connection connection = new ConnectionFactory().getConnection();
			AlunoDao dao = new AlunoDao(connection);
			List<Aluno> lista = dao.pesquisarPorNome(nome);			
			connection.close();
			request.setAttribute("lista", lista);
			
			return "aluno_listar.jsp";
		}
	}

}
