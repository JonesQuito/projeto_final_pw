package br.com.labpw.model.disciplina;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.labpw.model.Disciplina;

public class DisciplinaDao {

	private Connection connection;

	public DisciplinaDao(Connection conexao) {
		this.connection = conexao;
	}

	public void incluir(Disciplina disciplina) throws SQLException {
		String sql = "insert into disciplina (CodDisciplina, Nome, Descricao, CargaHoraria) values (?, ?, ?, ?)";

		PreparedStatement stmt = this.connection.prepareStatement(sql);
		stmt.setInt(1, disciplina.getCodigo());
		stmt.setString(2, disciplina.getNome());
		stmt.setString(3, disciplina.getDescricao());
		stmt.setInt(4, disciplina.getCargaHoraria());

		stmt.execute();
	}

	public Disciplina buscarPorId(int codigo) throws SQLException {

		Disciplina disciplina = null;
			
		//Comando para buscar no banco 
		String sql = "select * from disciplina where codigo=?";
		PreparedStatement stmt = this.connection.prepareStatement(sql);
		stmt.setString(1, Integer.toString(codigo));
		ResultSet rs = stmt.executeQuery();
		
		if (rs.next()){
			
			disciplina = new Disciplina();
			
			//Seta os valores dentro do obejeto.
			disciplina.setCodigo(rs.getInt("codigo"));
			disciplina.setNome(rs.getString("nome"));
			disciplina.setDescricao(rs.getString("descricao"));
			disciplina.setCargaHoraria(rs.getInt("cargaHoraria"));
		}

		return disciplina;
		
	}
	
	
	public void alterar(int codigo) throws SQLException {}

	public void excluir(int codigo) {}

	// Função que retorna todas tuplas de Disciplinas
	public List<Disciplina> listar() throws SQLException {
		
		List<Disciplina> disciplinas = new ArrayList<Disciplina>();

		// Comando de seleção ao banco de dados
		String sql = "select * from disciplina";
		PreparedStatement stmt = this.connection.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {

			Disciplina disciplina = new Disciplina();

			// Seta os valores retornados na pesquisa para os atributos de
			// disciplina
			disciplina.setCodigo(rs.getInt("CodDisciplina"));
			disciplina.setNome(rs.getString("Nome"));
			disciplina.setDescricao(rs.getString("Descricao"));
			disciplina.setCargaHoraria(rs.getInt("CargaHoraria"));

			disciplinas.add(disciplina);

		}

		return disciplinas;
	}

}
