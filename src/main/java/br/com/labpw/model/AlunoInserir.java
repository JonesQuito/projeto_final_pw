package br.com.labpw.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.labpw.connection.ConnectionFactory;

public class AlunoInserir implements LogicaAluno {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// Recupera os parâmetros da requisição
		String NomeStr = request.getParameter("nome");
		String NomeMaeStr = request.getParameter("nomeMae");
		String DataNascimentoStr = request.getParameter("dataNascimento");
		String RgStr = request.getParameter("rg");
		String CpfStr = request.getParameter("cpf");
		String CidadeStr = request.getParameter("cidade");
		String BairroStr = request.getParameter("bairro");
		String LogradouroStr = request.getParameter("logradouro");
		String CepStr = request.getParameter("cep");
		String NumeroStr = request.getParameter("numero");
		Calendar dataNascimento;

		// Verifica se os parâmetros foram passados na requisição
		if (NomeStr == null || NomeMaeStr == null || DataNascimentoStr == null) {
			
			return "aluno_cadastrar.jsp";
						
		} else {
			
			//Instancia um aluno e seta um novo endereço como atributo de aluno
			Aluno aluno = new Aluno();
			aluno.setEndereco(new Endereco());
			
			try {
				
				// Instancia um endereço e seta seus atributos
				Endereco endereco = new Endereco();
				endereco.setCidade(CidadeStr);
				endereco.setBairro(BairroStr);
				endereco.setLogradouro(LogradouroStr);
				endereco.setCep(CepStr);
				endereco.setNumero(NumeroStr);

				// Seta os atributos de aluno
				aluno.setNome(NomeStr);
				aluno.setNomeMae(NomeMaeStr);	
				aluno.setRg(RgStr);
				aluno.setCpf(CpfStr);
				aluno.setEndereco(endereco);
				
				// Faz a conversão da data de nascimento e seta como atributo de aluno
				Date data = new SimpleDateFormat("dd/MM/yyyy").parse(DataNascimentoStr);
				dataNascimento = Calendar.getInstance();
				dataNascimento.setTime(data);
				aluno.setDataNascimento(dataNascimento);
				
				// Solicita uma conexão para a ConnectionFactory
				Connection connection = new ConnectionFactory().getConnection();

				// Instancia um AlunoDao e executa o método de inserir
				AlunoDao dao = new AlunoDao(connection);
				dao.inserir(aluno);
				connection.close();
				
				//captura uma ParseException, se ocorrer e retorna para a página de cadastro
			} catch (ParseException pe) {
				request.setAttribute("erro", "Erro de conversão de data!!" + pe);
				request.setAttribute("nextPage", "aluno_cadastrar.jsp");
				request.setAttribute("messageLink", "Tentar Novamente...");
				request.setAttribute("aluno", aluno);
				return "aluno_cadastrar.jsp";
				
				//captura uma SQLException, se ocorrer e retorna para a página de cadastro
			}catch(SQLException sqle){
				request.setAttribute("erro", "Erro ao inserir registro no banco: " + sqle);
				request.setAttribute("nextPage", "aluno_cadastrar.jsp");
				request.setAttribute("messageLink", "Tentar Novamente...");
				request.setAttribute("aluno", aluno);
				return "aluno_cadastrar.jsp";
			}

		}
		//Em caso de sucesso no cadastro, a servletaluno é invocada para selecionar e exibir o registro
		return "servletaluno?logica=AlunoPesquisar";
	}

}
