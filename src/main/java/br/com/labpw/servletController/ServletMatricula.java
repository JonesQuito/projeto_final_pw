package br.com.labpw.servletController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.labpw.model.LogicaAluno;
import br.com.labpw.model.matricula.LogicaMatricula;

@WebServlet("/servletmatricula")
public class ServletMatricula extends HttpServlet{
	
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		String classe ="br.com.labpw.model.matricula."+ request.getParameter("logica");
			
		try{
			LogicaMatricula logicaMatricula = (LogicaMatricula)Class.forName(classe).newInstance();
			String pagina = logicaMatricula.executa(request, response);
			
			request.getRequestDispatcher(pagina).forward(request, response);
			
		}catch(Exception e){
			response.getWriter().println("Erro ao executar lógica da aplicação: " + e);
		}
	}

}
