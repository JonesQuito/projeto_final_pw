package br.com.labpw.model.matricula;

import java.sql.Connection;
import java.sql.SQLException;
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
		
		if(operacao==null){
			
			return "aluno_matricula.jsp";
			
		}
		if(operacao.equals("busca")){
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
				// setar atributos de erro no requeste e redirecionar para página de erro
				request.setAttribute("erro", "Erro de SQL em DisciplinaDao.listar(): "+ e.getMessage());
				request.setAttribute("nextPage", "aluno_matricula.jsp");
				request.setAttribute("messageLink", "Tentar Novamente...");	
				return "aluno_matricula.jsp";
			}
		}else if(operacao.equals("registrar")){
			//implemetar o registro na tabela de matrículas
		}
		return "aluno_matricula.jsp";
	}

}
