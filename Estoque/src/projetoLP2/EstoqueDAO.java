package projetoLP2;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * 
 * @author husbeh@gmail.com
 * 
 */
public class EstoqueDAO {

	private static final String selectUsuario = "select * from usuario where cod = ?";
	private static final String insertProduto = "insert into produtos (nome, quantidade) values (?, ?)";
	private static final String FindUsuarios = "select * from usuario";

	private Connection con = null;

	public void conectar() {

		try {
			Properties p = new Properties();
			p.load(new FileInputStream("estoque.properties"));
			String url = p.getProperty("url");

			con = DriverManager.getConnection(url, p);
		} catch (Exception e) {
			System.out.println("Erro ao estabelecer conexão.");
			e.printStackTrace();
		}

	}

	/**
	 * Encontra o usuário dado o código. Retorna null se o código não for
	 * encontrado.
	 * 
	 * @param cod
	 *            é o código do usuário
	 * @return é null caso não encontrado.
	 * 
	 */
	public Usuario encontraUsuario(int cod) {

		// System.out.println("cod = " + cod);

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
				// System.out.println("NOME: " + nome);
				// String pass = rs.getString("senha");
				String pass = null;
				c = new Usuario(codi, nome, pass);
			}

		} catch (Exception e) {

			System.out.println("Informações não encontradas.");
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return c;
	}

	public boolean insertProduto(String nome, float quantidade) {

		boolean result = false;

		if (nome == null) {
			throw new IllegalArgumentException("O número não pode ser null.");
		}
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement(insertProduto);
			stmt.setString(1, nome);
			stmt.setFloat(2, quantidade);

			if (stmt.executeUpdate() == 1)
				result = true;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return result;
	}

	public List<Usuario> getUsuarios() throws SQLException {
		Usuario c = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		stmt = con.prepareStatement(FindUsuarios);
		rs = stmt.executeQuery();

		List<Usuario> lista = new ArrayList<Usuario>();

		while (rs.next()) {
			int codi = rs.getInt("cod");
			String nome = rs.getString("nome");
			// String pass = rs.getString("senha");
			String pass = null;
			c = new Usuario(codi, nome, pass);
			lista.add(c);
		}
		// System.out.println(lista);
		return lista;
	}
}
