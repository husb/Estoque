package projetoLP2;

import java.sql.SQLException;

/**
 * 
 * @author husbeh@gmail.com
 * 
 */

public class App {

	public static void main(String[] args) throws SQLException {

		EstoqueDAO e = new EstoqueDAO();

		// estabelece a conexão
		e.conectar();

     try {
			Usuario retorno = e.encontraUsuario("1", "teste123");
			System.out.println("Retorno: " + retorno);
			System.out.println("Nome: " + retorno.getNome());

	/*      String nome = "Toner Xerox 6000";
			float quantidade = 10;
			if(e.insertProduto(nome, quantidade)==true){
				System.out.println("Inserido com sucesso");
				
			}
			else{
				
				System.out.println("Não inserido com sucesso");
			} */


		} catch (Exception ex) {
			System.out.println("Informação não encontrada.");

		} 
		
		e.Usuario();
		
	}


}
