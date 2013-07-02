package swing.estoque;

import java.awt.*;

import javax.swing.*;

import swing.estoque.action.*;


public class Container {
	public static final String PRINCIPAL = "PRINCIPAL";

	private static void createAndShowGUI() {
		JFrame frame = new JFrame("Estoque");
		CardLayout cards = new CardLayout();
		JPanel principal = new JPanel(cards);
		JPanel vazio = new JPanel();
		JPanel procurar = new ProcuraPanel(principal, cards);
		JPanel inserir = new InserePanel(principal, cards);
		JLabel label = new JLabel("Bem-Vindo ao controle de estoque.");
		vazio.add(label);

		principal.add(vazio,  PRINCIPAL);
		principal.add(procurar, JOkProcuraUsuario.PROCURA);
		principal.add(inserir, JOkInsereProduto.INSERE);
	


		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(new ImageIcon("LogoEstoque.png").getImage());

		frame.getContentPane().add(principal);

		JMenuBar menubar = new JMenuBar();
		JMenu file = new JMenu("Menu");
		menubar.add(file);
		JMenu users= new JMenu("Usuarios");
		JMenu product = new JMenu("Produtos");
		menubar.add(users);
		menubar.add(product);
		frame.setJMenuBar(menubar);

		frame.setMinimumSize(new Dimension(500,300));
		Action menu = new MenuSair(frame);
		Action JUsuario = new JOkProcuraUsuario(principal,cards, null);
		Action JProduto = new JOkInsereProduto(principal,cards, null, null);
		file.add(menu);
		users.add(JUsuario);
		product.add(JProduto);
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
