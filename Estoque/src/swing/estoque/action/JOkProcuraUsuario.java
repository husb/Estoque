package swing.estoque.action;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import javax.swing.*;




@SuppressWarnings("serial")
public class JOkProcuraUsuario extends AbstractAction {
	public static final String PROCURA = "PROCURA";
	private JPanel principal;
	private CardLayout cards;
	private JTextField valor;
	
	public JOkProcuraUsuario(JPanel principal, CardLayout cards, JTextField valor) {
		super("Procura");
		this.principal = principal;
		this.cards = cards;
		this.valor = valor;

		
		putValue(SHORT_DESCRIPTION, "Utilize o c�digo do usu�rio para ach�-lo");
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println("OI");
	/*    System.out.println("=> " + e);
		EstoqueDAO d = new EstoqueDAO();
		d.conectar();

		int v = Integer.parseInt(valor.getText());
		System.out.println("====> " + this.valor.getText());
		System.out.println("ASDAS");
		Usuario c = d.encontraUsuario(v);
		if (c == null) {
			System.out.println("Conta n�o encontrada!");
			JOptionPane.showMessageDialog(principal.getRootPane(),
					"Conta n�o encontrada!", "Opera��o cancelada",
					JOptionPane.ERROR_MESSAGE);

		} else {
				System.out.println(c);

		}
		if (principal != null) { */

     
		cards.show(principal, PROCURA);
		String v;
		if(valor == null){
			System.out.println("null");
			
		}
		else{
			
	     v = valor.getText();
	     JOptionPane.showMessageDialog(principal.getRootPane(),
					"Usu�rio: " + v, "Procura Usu�rio",
					JOptionPane.PLAIN_MESSAGE);
	     
	      System.out.println(v);

		}
		}

	}
//}

