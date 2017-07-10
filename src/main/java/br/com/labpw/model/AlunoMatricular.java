package br.com.labpw.model;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.labpw.connection.ConnectionFactory;
import br.com.labpw.connection.FabricaConexao;
import br.com.labpw.model.matricula.Matricula;
import br.com.labpw.model.matricula.MatriculaDao;

public class AlunoMatricular implements LogicaAluno {
	
	public String executa(HttpServletRequest request, HttpServletResponse response)
	throws IOException{
		
		String operacao = request.getParameter("operacao");
		String paginaRetorno;
		
		if(operacao==null || operacao.isEmpty()){
			request.setAttribute("", "Não foi possível recuperar o parâmetro de entrada");
			request.setAttribute("nextPage", "aluno_matricula.jsp");
			request.setAttribute("messageLink", "Tentar novamente...");
			return "erroPage.jsp";
			
		}else if(operacao.equals("buscar")){
			try{
				String matricula = request.getParameter("matricula");
				
				Connection connection = new ConnectionFactory().getConnection();
				AlunoDao dao = new AlunoDao(connection);
				Aluno aluno = dao.pesquisarPorMatricula(matricula);
				connection.close();
				request.setAttribute("aluno", aluno);					
				return "aluno_matricula.jsp";
			}catch(SQLException e){
				request.setAttribute("erro", "Erro ao efetuar busca: "+e.getMessage());
				request.setAttribute("nextPage", "aluno_matricula.jsp");
				request.setAttribute("messageLink", "Tentar Novamente...");
				return "erroPage.jsp";
			}			
		}
		
		else if(operacao.equals("matricular")){
			
			//Implementar	
			return "aluno_matricula.jsp";
			
		}else{
			request.setAttribute("", "O parâmetro que especifica a operação a ser realizada não foi passado na requisição");
			request.setAttribute("nextPage", "aluno_matricular.jsp");
			request.setAttribute("messageLink", "Tentar novamente...");
			return "erroPage.jsp";
		}
		
	}

}
