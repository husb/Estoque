package swingLP2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import projetoLP2.*;




public class swingProduto extends JFrame implements ActionListener  
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 361872692459063111L;
	JButton botao, botao2;
    JPanel panel;  
    JTextField texto, texto2; 
    JLabel label1, label2, label3, aux;
	
    public swingProduto()  
    {  
        super("Produtos");  
    }  
	
	public void criaJanela(){
		
		 label1 = new JLabel("Digite o nome de um produto que deseja inserir:");
		 label2 = new JLabel("Insira uma quantidade:");
		 texto = new JTextField(); 
		 texto2 = new JTextField();
	     panel = new JPanel();  
	     botao = new JButton("OK");
	     label3 = new JLabel();
	     botao2 = new JButton("Voltar");
	     aux = new JLabel();

	     
	     
	     panel.add(label1);
	     panel.add(texto);  
	     panel.add(label2);
	     panel.add(texto2);  
	     panel.add(botao);
	     panel.add(label3);
	     panel.add(aux);
	     botao.addActionListener(this);  
	     panel.add(botao2);
	     botao2.addActionListener(this);  
	     
	     getContentPane().add(panel, BorderLayout.CENTER);  
	         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	          
	        pack();  
	        setVisible(true);         
	        setSize(250,400);    
	        panel.setLayout(new GridLayout(12, 1)); 
	        
	        
		
	}
    
    

		@SuppressWarnings("deprecation")
		public void actionPerformed(ActionEvent e)  
	    {  
			Object src = e.getSource();
			EstoqueDAO dao = new EstoqueDAO();
	    	dao.conectar();
		if(src == botao){
	    	try{
	    	float quantidade = (Integer.parseInt(texto2.getText()));	    	
	    	String nome = texto.getText();
		
		   if(dao.insertProduto(nome, quantidade)==true){
				label3.setText("Inserido com sucesso.");
				
			}
			else{
				
				label3.setText("N�o inserido com sucesso.");
			} 
	    	}catch(Exception e1){
	    		
	    		label3.setText("Insira algo para cadastrar.");
	    	
	    	}
		}
		if(src == botao2){
			this.hide();
			swingUsuario ex2 = new swingUsuario(); 
		    ex2.criaJanela(); 
		  
			
		}
			
						
	}

	 

	
	
	
	
	
}
