package projetoLP2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EstoqueDAO {

	private static final String selectUsuario = "select * from usuario where cod = ?";
	private static final String insertProduto = "insert into produtos (nome, quantidade) values (?, ?)";
	private static final String FindUsuarios = "select * from usuario";
	

	Connection con = null;

	public void conectar() {

		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Estoque", "postgres", "senacrs");
		} catch (SQLException e) {
			System.out.println("Erro ao estabelecer conexão.");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Não encontrada. " + e);
		}
	}
	
	public Usuario encontraUsuario(int cod) {

		if (cod == 0) {
			throw new IllegalArgumentException(
					"O número não pode ser null.");
		}
		
		Usuario c = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {		
			stmt = con.prepareStatement(selectUsuario);
			stmt.setInt(1, cod);
			rs = stmt.executeQuery();

			if (rs.next()) {
				int codi = rs.getInt("cod");
				String nome = rs.getString("nome");
				String pass = rs.getString("senha");
				c = new Usuario(codi, nome, pass);
			}

		} catch (Exception e) {

			System.out.println("Informações não encontradas.");

		} finally {

		}

		return c;
	}


	public boolean insertProduto(String nome, float quantidade) {

		boolean result = false;

		if (nome == null) {
			throw new IllegalArgumentException(
					"O número não pode ser null.");
		}
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement(insertProduto);
			stmt.setString(1, nome);
			stmt.setFloat(2, quantidade);

			if(stmt.executeUpdate() == 1)
				result = true;

		} catch(Exception e) {
			e.printStackTrace();
		} finally {			

		}

		return result;
	}
	
	public Usuario Usuario() throws SQLException{
		Usuario c = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
			stmt = con.prepareStatement(FindUsuarios);
			rs = stmt.executeQuery();
			
			List<Usuario> lista = new ArrayList<Usuario>();
			
			while (rs.next()) {
				int codi = rs.getInt("cod");
				String nome = rs.getString("nome");
				String pass = rs.getString("senha");
				c = new Usuario(codi, nome, pass);			
				lista.add(c);
			}
			int count = 1;
			for (Usuario a : lista) {
				System.out.printf("Lista Numero" + count + " >" + "\n  Cod: " + a.getCod() + "\n  Nome: " + a.getNome() + "\n  Senha: " + a.getSenha() + "\n");
				count = count +1;
			}			
			return c;			
  }
}
