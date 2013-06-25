package swing.estoque;

import java.awt.*;
import javax.swing.*;


import swing.estoque.action.*;


@SuppressWarnings("serial")
public class InserePanel extends JPanel {
	private JTextField cod, nome;

	
	public InserePanel(JPanel principal, CardLayout cards) {
		cod = new JTextField(3);	
		nome = new JTextField(15);
		add(new JButton(new JOkInsereProduto(principal, cards, cod, nome)));
		add(new JButton(new JVoltar(principal, cards)));
		add(cod);
		add(nome);
		
	}

	public InserePanel() {
		this(null, null);
	}


	private static void createAndShowGUI() {
		JFrame frame = new JFrame("Inserir Produto");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel painel = new InserePanel();
		frame.getContentPane().add(painel);

		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
