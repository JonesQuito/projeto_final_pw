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
		
		if(codigoStr==null || nome==null || duracaoStr==null){
			request.setAttribute("erro", "Parâmetros obrigatórios não foram passados na requisição");
			request.setAttribute("nextPage", "disciplina_cadastrar.jsp");
			request.setAttribute("messageLink", "Tentar Novamente...");
			return "erroPage.jsp";
		}

		if (codigoStr.isEmpty() || nome.isEmpty() || duracaoStr.isEmpty()) {
			request.setAttribute("erro", "Código, Nome e duração são de preencimento obrigatório");
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
			request.setAttribute("erro", "Verifique se o código e duração possuem formato válido: " + nfe);
			request.setAttribute("nextPage", "disciplina_cadastrar.jsp");
			request.setAttribute("messageLink", "Tentar Novamente...");
			return "erroPage.jsp";
		} catch (SQLException e) {
			request.setAttribute("erro", "Não foi possível inserir a disciplina: " + e);
			request.setAttribute("nextPage", "disciplina_cadastrar.jsp");
			request.setAttribute("messageLink", "Tentar Novamente...");
			return "erroPage.jsp";
		}
		return "disciplina_cadastrar.jsp";
	}

}
