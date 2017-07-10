package br.com.labpw.model.matricula;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.labpw.connection.ConnectionFactory;
import br.com.labpw.model.Aluno;
import br.com.labpw.model.AlunoDao;
import br.com.labpw.model.Disciplina;
import br.com.labpw.model.disciplina.DisciplinaDao;

public class MatriculaRegistrar implements LogicaMatricula {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {

		String operacao = request.getParameter("operacao");

		if (operacao == null) {

			return "aluno_matricula.jsp";

		}
		if (operacao.equals("busca")) {
			String matricula = request.getParameter("matricula");
			try {
				Connection connection = new ConnectionFactory().getConnection();
				List<Disciplina> disciplinas = new DisciplinaDao(connection).listar();
				Aluno aluno = new AlunoDao(connection).pesquisarPorMatricula(matricula);
				connection.close();

				request.setAttribute("aluno", aluno);
				request.setAttribute("disciplinas", disciplinas);

				return "aluno_matricula.jsp";
			} catch (SQLException e) {
				// setar atributos de erro no requeste e redirecionar para
				// página de erro
				request.setAttribute("erro", "Erro de SQL em DisciplinaDao.listar(): " + e.getMessage());
				request.setAttribute("nextPage", "aluno_matricula.jsp");
				request.setAttribute("messageLink", "Tentar Novamente...");
				return "aluno_matricula.jsp";
			}
		} else if (operacao.equals("registrar")) {
			
			// Captura os dados passados na requisição
			String codAlunoStr = request.getParameter("codAluno");
			String codDisciplinaStr = request.getParameter("codDisciplina");

			// Obtém a data atual e seta em uma instância de Calendar
			Date dataAtual = new Date(System.currentTimeMillis());
			Calendar dataMatricula = Calendar.getInstance();
			dataMatricula.setTime(dataAtual);

			// Instancia um objeto Matrícula e seta seus atributos
			Matricula matricula = new Matricula();
			matricula.setCodAluno(Integer.parseInt(codAlunoStr));
			matricula.setCodDisciplina(Integer.parseInt(codDisciplinaStr));
			matricula.setStatus(Matricula.STATUS_ABERTO);
			matricula.setDataMatricula(dataMatricula);

			// Obtém uma conexão com o banco de dados
			Connection connection = new ConnectionFactory().getConnection();

			// Instancia um MatriculaDao e invoca o método de registrar
			// matrícula
			MatriculaDao dao = new MatriculaDao(connection);
			try {
				dao.registrar(matricula);
				return "aluno_matricula.jsp";
			} catch (SQLException e) {
				request.setAttribute("erro", "Erro ao registra matrícula: " + e.getMessage());
				request.setAttribute("nextPage", "aluno_matricula.jsp");
				request.setAttribute("messageLink", "Tentar Novamente...");
				return "erroPage.jsp";
			}
		}
		return "aluno_matricula.jsp";
	}

}
