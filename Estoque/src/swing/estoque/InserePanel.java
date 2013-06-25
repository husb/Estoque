package swing.estoque;

import java.awt.*;
import javax.swing.*;


import swing.estoque.action.*;


public class InserePanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1245574637496342576L;
	private JTextField cod, nome;
	private JLabel codLabel, nomeLabel;

	
	public InserePanel(JPanel principal, CardLayout cards) {
		cod = new JTextField(3);	
		nome = new JTextField(15);
		codLabel = new JLabel("Qntd.:");
		nomeLabel = new JLabel("Nome:");
		add(new JButton(new JVoltar(principal, cards)));
		add(codLabel);
		add(cod);
		add(nomeLabel);
		add(nome);
		add(new JButton(new JOkInsereProduto(principal, cards, cod, nome)));
		System.out.println("teste");
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
