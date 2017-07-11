package br.com.labpw.model.matricula;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import apiRest.conexao.ConnectionFactory;

public class MatriculaPesquisar implements LogicaMatricula {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {

		String parametroStr = request.getParameter("parametro");

		if (parametroStr == null || parametroStr.isEmpty()) {
			// lista todos
			Connection connection = new ConnectionFactory().getConnection();
			MatriculaDao dao = new MatriculaDao(connection);
			try {
				List<Matricula2> matriculas = dao.listar();
				request.setAttribute("matriculas", matriculas);
				response.getWriter().println("passou aqui");
			} catch (SQLException e) {
				request.setAttribute("erro", "Erro ao listar matrículas: " + e.getMessage());
				request.setAttribute("nextPage", "home.jsp");
				request.setAttribute("messageLink", "Home Page");
				return "erroPage.jsp";
			}
		} else {
			// Realiza consulta com base no parâmetro passado
			Connection connection = new ConnectionFactory().getConnection();
			MatriculaDao dao = new MatriculaDao(connection);
			try {
				List<Matricula2> matriculas = dao.listarComParametro(parametroStr);
				request.setAttribute("matriculas", matriculas);
			} catch (SQLException e) {
				request.setAttribute("erro", "Erro ao listar matrículas: " + e.getMessage());
				request.setAttribute("nextPage", "home.jsp");
				request.setAttribute("messageLink", "Home Page");
				return "erroPage.jsp";
			}

		}
		return "matricula_listar.jsp";
	}

}
