package swing.estoque.action;


import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JPanel;

import swing.estoque.Container;


public class JVoltar extends AbstractAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 137426618842189635L;
	private JPanel principal;
	private CardLayout cards;

	public JVoltar(JPanel principal, CardLayout cards) {
		super("Voltar");
		this.principal = principal;
		this.cards = cards;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
			 System.out.println("testevoltar");
			cards.show(principal, Container.PRINCIPAL);
	

	}
}
