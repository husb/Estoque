package swing.estoque.action;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import javax.swing.*;

import projetoLP2.*;


public class JOkInsereProduto extends AbstractAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7674250667109467196L;
	public static final String INSERE = "INSERE";
	private JPanel principal;
	private CardLayout cards;
	private JTextField cod;
	private JTextField nome;


	public JOkInsereProduto(JPanel principal, CardLayout cards, JTextField cod, JTextField nome) {
		super("Inserir");

		this.principal = principal;
		this.cards = cards;
		this.cod = cod;
		this.nome = nome;
		putValue(SHORT_DESCRIPTION, "Insira um produto atraves de um nome e quantidade.");
	}
	
	public void actionPerformed(ActionEvent e) {
		 System.out.println("testejokinsere");
	
		EstoqueDAO d = new EstoqueDAO();
		d.conectar();
		
		
		cards.show(principal, INSERE);
		System.out.println("Oi");
	System.out.println(cod);
			if(cod==null || nome==null){
				
				System.out.println("nao entrou");
			}else{
				try{
					System.out.println(cod);
					int c; 
					c = Integer.parseInt(cod.getText());  
					System.out.println(c);
					
					String n; 
					n = (nome.getText());
					if(n==""){
						System.out.println("VAZIO");
					}
					d.insertProduto(n, c);
					if(n!=null){
				
					 JOptionPane.showMessageDialog(principal.getRootPane(),
								"Inserido com sucesso.\n" + "Quantidade: " + c + "\nNome: " + n , "Insere Produto",
								JOptionPane.PLAIN_MESSAGE);
					}
					
				}catch(Exception e2){
					 JOptionPane.showMessageDialog(principal.getRootPane(),
								"Digite uma Quantidade e um Nome ", "Insere Produto",
								JOptionPane.PLAIN_MESSAGE);
				}
				
	
				}
			}
			
			
		}

		
	
	
	

	


