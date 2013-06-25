package swing.estoque;

import java.awt.*;

import javax.swing.*;



import swing.estoque.action.JOkProcuraUsuario;


@SuppressWarnings("serial")
public class ProcuraPanel extends JPanel {
  
	private JTextField valor;
	
	


	public ProcuraPanel(JPanel principal, CardLayout cards) {
		
		valor = new JTextField(8);;
		add(new JButton(new JOkProcuraUsuario(principal, cards, valor)));
		add(valor);
	
	}


	public ProcuraPanel() {
		this(null, null);
	}

	private static void createAndShowGUI() {
		JFrame frame = new JFrame("Procura Usuário");
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
