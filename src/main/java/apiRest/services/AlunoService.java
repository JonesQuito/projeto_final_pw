package apiRest.services;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.google.gson.Gson;

import apiRest.conexao.ConnectionFactory;
import apiRest.modelo.aluno.Aluno;
import apiRest.modelo.aluno.AlunoDao;
import br.com.labpw.model.matricula.Matricula;
import br.com.labpw.model.matricula.MatriculaDao;

@Path("/aluno")
public class AlunoService {

	// M�TODO QUE RETORNA A LISTA DE TODOS OS ALUNOS
	@GET
	@Path("list")
	@Produces("application/json")
	public String getList() {
		Connection connection = new ConnectionFactory().getConnection();
		List<Aluno> alunos = new AlunoDao(connection).getLista();

		Gson g = new Gson();

		return g.toJson(alunos);
	}

	// M�TODO QUE RETORNA A LISTA DE ALUNOS MATICULADOS EM UMA DISCIPLINA
	@GET
	@Path("listForDiscipline")
	@Produces("application/json")
	public String getListForDiscipline(@QueryParam("codDisciplina") int codDisciplina) {
		Connection connection = new ConnectionFactory().getConnection();
		List<Aluno> alunos = new ArrayList<Aluno>();
		Gson g = new Gson();
		try {
			alunos = new AlunoDao(connection).getListaPorDisciplina(codDisciplina);
		} catch (SQLException e) {
			System.out.println("Erro na consulta de alunos: " + e.getMessage());
		}

		return g.toJson(alunos);
	}
	
	/**
	 * Fornece servi�o de contagem de alunos matriculados em uma disciplina espec�fica
	 * @param codDisciplina
	 * @return total de alunos matriculados na disciplina informada no par�metro de entrada.
	 */
	@GET
	@Path("countForDiscipline/{codDisciplina}")
	@Produces("application/json")
	public String getCountForDiscipline(@PathParam("codDisciplina") int codDisciplina){
		int total = 0;
		Connection connection = new ConnectionFactory().getConnection();
		AlunoDao dao = new AlunoDao(connection);
		try {
			total = dao.getListaPorDisciplina(codDisciplina).size();
		} catch (SQLException e) {
			System.out.println("Erro na contagem de alunos: " + e.getMessage());
		}

		Gson g = new Gson();
		
		return g.toJson(total);
	}

	// M�TODO DE TESTE QUE RETORNA O PRIMEIRO ALUNO DA LISTA DE ALUNOS
	@GET
	@Path("aluno")
	@Produces("application/json")
	public String getAluno() {
		Connection connection = new ConnectionFactory().getConnection();
		List<Aluno> alunos = new AlunoDao(connection).getLista();
		Aluno al = alunos.get(1);
		Gson g = new Gson();
		return g.toJson(al);
	}

	// M�TODO QUE RECEBE O CODIGO DE UMA DISCIPLINA E O C�DIGO DE UM ALUNO E
	// REGISTRA A MATR�CULA
	@GET
	@Path("matricula")
	@Produces("application/json")
	public String matriculaAluno(@QueryParam("codAluno") int codAluno, @QueryParam("codDisciplina") int codDisciplina) {
		// Obt�m a data atual e seta em uma inst�ncia de Calendar
		Date dataAtual = new Date(System.currentTimeMillis());
		Calendar dataMatricula = Calendar.getInstance();
		dataMatricula.setTime(dataAtual);

		// Instancia um objeto Matr�cula e seta seus atributos
		Matricula matricula = new Matricula();
		matricula.setCodAluno(codAluno);
		matricula.setCodDisciplina(codDisciplina);
		matricula.setStatus(Matricula.STATUS_ABERTO);
		matricula.setDataMatricula(dataMatricula);

		// Obt�m uma conex�o com o banco de dados
		Connection connection = new ConnectionFactory().getConnection();

		// Instancia um MatriculaDao e invoca o m�todo de registrar
		// matr�cula
		MatriculaDao dao = new MatriculaDao(connection);
		try {

			dao.registrar(matricula);

		} catch (SQLException e) {
			System.out.println("Erro no registrar() do Dao de disciplina");
		}

		Gson g = new Gson();
		return g.toJson(matricula);
	}

}
