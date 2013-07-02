package swing.estoque;

import java.awt.*;

import javax.swing.*;



import swing.estoque.action.JOkProcuraUsuario;
import swing.estoque.action.JVoltar;


public class ProcuraPanel extends JPanel {
  
	/**
	 * 
	 */
	private static final long serialVersionUID = 6787845525820323643L;
	private JTextField valor;
	private JLabel codLabel;
	
	


	public ProcuraPanel(JPanel principal, CardLayout cards) {
		codLabel = new JLabel("Digite um Cod.:");
		valor = new JTextField(8);
		add(new JButton(new JVoltar(principal, cards)));
		add(codLabel);
		add(valor);
		add(new JButton(new JOkProcuraUsuario(principal, cards, valor)));


	
	}


	public ProcuraPanel() {
		this(null, null);
	}

	private static void createAndShowGUI() {
		JFrame frame = new JFrame("Procurar Usuário");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel painel = new ProcuraPanel();
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
