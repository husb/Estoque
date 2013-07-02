package swing.estoque.action;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import javax.swing.*;

import projetoLP2.*;


public class JOkProcuraUsuario extends AbstractAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8573003694119966178L;
	public static final String PROCURA = "PROCURA";
	private JPanel principal;
	private CardLayout cards;
	private JTextField valor;
	
	public JOkProcuraUsuario(JPanel principal, CardLayout cards, JTextField valor) {
		super("Procurar");
		this.principal = principal;
		this.cards = cards;
		this.valor = valor;

		
		putValue(SHORT_DESCRIPTION, "Utilize o código do usuário para achá-lo");
	}

	

	public void actionPerformed(ActionEvent e) {
		
		System.out.println("OI");
	
		EstoqueDAO d = new EstoqueDAO();
		d.conectar();
		
		cards.show(principal, PROCURA);
		int v;
		if(valor == null){
			System.out.println("null");
			
		}
		else{
			
	    
	     try{
	    	 v = Integer.parseInt(valor.getText());
	     Usuario c = d.encontraUsuario(v);
	     System.out.println(c);
	     JOptionPane.showMessageDialog(principal.getRootPane(),
					"Usuário: " + c.getNome(), "Procura Usuário",
					JOptionPane.PLAIN_MESSAGE);
	     
	      System.out.println("teste");
	     }catch(Exception e1){
	    	 JOptionPane.showMessageDialog(principal.getRootPane(),
						"Não encontrado.", "Procura Usuário",
						JOptionPane.ERROR_MESSAGE);
	     }

		}
		}

	}
//}

