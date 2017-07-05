package br.com.labpw.model.disciplina;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.labpw.connection.ConnectionFactory;
import br.com.labpw.model.Disciplina;

public class DisciplinaInserir implements LogicaDisciplina {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String codigoStr = request.getParameter("codigo");
		String nome = request.getParameter("nome");
		String descricao = request.getParameter("descricao");
		String duracaoStr = request.getParameter("duracao");

		if (codigoStr.isEmpty() || nome.isEmpty() || duracaoStr.isEmpty()) {
			request.setAttribute("erro", "C�digo e dura��o s�o de preencimento obrigat�rio");
			request.setAttribute("nextPage", "disciplina_cadastrar.jsp");
			request.setAttribute("messageLink", "Tentar Novamente...");
			return "erroPage.jsp";
		}

		try {
			int codigo = Integer.parseInt(codigoStr);
			int duracao = Integer.parseInt(duracaoStr);
			Disciplina disciplina = new Disciplina();
			disciplina.setCodigo(codigo);
			disciplina.setNome(nome);
			disciplina.setDescricao(descricao);
			disciplina.setCargaHoraria(duracao);

			Connection conexao = new ConnectionFactory().getConnection();
			DisciplinaDao dao = new DisciplinaDao(conexao);
			dao.incluir(disciplina);
		} catch (NumberFormatException nfe) {
			request.setAttribute("erro", "Verifique se o c�digo e dura��o possuem formato v�lido: " + nfe);
			request.setAttribute("nextPage", "disciplina_cadastrar.jsp");
			request.setAttribute("messageLink", "Tentar Novamente...");
			return "erroPage.jsp";
		} catch (SQLException e) {
			request.setAttribute("erro", "N�o foi poss�vel inserir a disciplina: " + e.getMessage());
			request.setAttribute("nextPage", "disciplina_cadastrar.jsp");
			request.setAttribute("messageLink", "Tentar Novamente...");
			return "erroPage.jsp";
		}
		return "disciplina_cadastrar.jsp";
	}

}
