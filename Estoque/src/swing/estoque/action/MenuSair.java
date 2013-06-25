package swing.estoque.action;

import java.awt.event.ActionEvent;

import javax.swing.*;

public class MenuSair extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5802036578286609238L;
	private JFrame frame;
	public MenuSair(JFrame frame) {
		super("Sair da Aplicação");
		this.frame = frame;
		putValue(SHORT_DESCRIPTION, "Sair?");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		    frame.pack();
		    frame.setSize(200, 200);
		    frame.setVisible(true);
		    System.exit(0);
	
		  }

	}

