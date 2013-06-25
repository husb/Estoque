package swing.estoque.action;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import javax.swing.*;


@SuppressWarnings("serial")
public class JOkInsereProduto extends AbstractAction {
	public static final String INSERE = "INSERE";
	private JPanel principal;
	private CardLayout cards;
	private JTextField cod;
	private JTextField nome;

	//private JTextField valor;

	public JOkInsereProduto(JPanel principal, CardLayout cards, JTextField cod, JTextField nome) {
		super("Inserir");

		this.principal = principal;
		this.cards = cards;
		this.cod = cod;
		this.nome = nome;
		putValue(SHORT_DESCRIPTION, "Insira um produto atraves de um nome e quantidade.");
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	/*	System.out.println("=> " + e);
		EstoqueDAO d = new EstoqueDAO();
		d.conectar();
		Usuario c = d.encontraUsuario(1);
		if (c == null) {
			System.out.println("Conta não encontrada!");
			JOptionPane.showMessageDialog(principal.getRootPane(),
					"Conta não encontrada!", "Operação cancelada",
					JOptionPane.ERROR_MESSAGE);

		} else {

			try {
				//v = Integer.parseInt(valor.getText());

				//d.encontraUsuario(v);
			} catch (Exception e1) {
				e1.printStackTrace();
			/*	JOptionPane.showMessageDialog(
						(principal == null? null : principal.getRootPane()),
						String.format("Valor inválido [R$ %s]!",
								valor.getText()), "Operação cancelada",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		if (principal != null) {   */
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
					if(n!=null){
				
					 JOptionPane.showMessageDialog(principal.getRootPane(),
								"Inserido com sucesso.\n" + "Quantidade: " + c + "\nNome: " + n , "Insere Produto",
								JOptionPane.PLAIN_MESSAGE);
					}
					if(n==null){
						JOptionPane.showMessageDialog(principal.getRootPane(),
								"Digite um nome", "Insere Produto",
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

		
	
	
	

	


