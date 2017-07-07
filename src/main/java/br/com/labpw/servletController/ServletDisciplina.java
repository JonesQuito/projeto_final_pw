package br.com.labpw.servletController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.labpw.model.disciplina.LogicaDisciplina;

@WebServlet("/servletdisciplina")
public class ServletDisciplina extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException{
		
		String classe ="br.com.labpw.model.disciplina."+ request.getParameter("logica");
		
		try{
			LogicaDisciplina disciplinaLogica = (LogicaDisciplina)Class.forName(classe).newInstance();
			String pagina = disciplinaLogica.executa(request, response);
					
			request.getRequestDispatcher(pagina).forward(request, response);
			
		}catch(Exception e){
			response.getWriter().println("Erro ao executar lógica da aplicação: " + e);
		}
	}

}
