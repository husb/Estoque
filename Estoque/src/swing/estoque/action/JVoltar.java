package swing.estoque.action;


import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JPanel;

import swing.estoque.Container;


@SuppressWarnings("serial")
public class JVoltar extends AbstractAction {
	private JPanel principal;
	private CardLayout cards;

	public JVoltar(JPanel principal, CardLayout cards) {
		super("Voltar");
		this.principal = principal;
		this.cards = cards;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (principal != null) {
			cards.show(principal, Container.PRINCIPAL);
		}

	}
}
