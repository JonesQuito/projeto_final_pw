package br.com.labpw.model.disciplina;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.labpw.connection.ConnectionFactory;
import br.com.labpw.model.Disciplina;

public class DisciplinaPesquisar implements LogicaDisciplina {
	
	public List<Disciplina> listaDisciplinas() throws SQLException{
		Connection connection = new ConnectionFactory().getConnection();
		List<Disciplina> disciplinas = new ArrayList<Disciplina>();
			disciplinas = new DisciplinaDao(connection).listar();
			connection.close();
		return disciplinas;
	}
	

	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String parametroBusca = request.getParameter("parametro");
		String paginaRetorno;
		
		if(parametroBusca==null){
			try{
				List<Disciplina> disciplinas = listaDisciplinas();
				request.setAttribute("disciplinas", disciplinas);
				paginaRetorno = "aluno_matricula.jsp";
				
			}catch(SQLException e){
				// setar atributos de erro no requeste e redirecionar para página de erro
				paginaRetorno = "erroPage.jsp";
				request.setAttribute("erro", "Erro de SQL em DisciplinaDao.listar(): "+ e.getMessage());
				request.setAttribute("nextPage", "aluno_matricula.jsp");
				request.setAttribute("messageLink", "Tentar Novamente...");	
			}
		}else{
			paginaRetorno = "aluno_matricula.jsp";
		}
		return paginaRetorno;
	}

}
