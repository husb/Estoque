package swingLP2;

import javax.swing.*;  

import projetoLP2.*;

import java.awt.*;  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


	public class swingUsuario extends JFrame implements ActionListener  
	{  
	    /**
		 * 
		 */
		private static final long serialVersionUID = -6784375067619890013L;
		JButton botao; 
		JButton botao2; 
	    JPanel panel;  
	    static JTextField texto;  
	    static JTextField texto2; 
	    JLabel label;
	    JLabel label2;
	    JLabel label3;
		String b;
	      
	    public swingUsuario()  
	    {  
	        super("Estoque");  
	    }  
	      
	    public void criaJanela()  
	    {         
	    	
	        texto = new JTextField();  
	        texto2 = new JTextField();  
	          
	        panel = new JPanel();  
	        label = new JLabel();  
	        label2 = new JLabel("Digite um código de um cliente a procurar.");  
	        label3 = new JLabel("Digite uma senha.");  
	                  
	        botao = new JButton("OK");  
	        botao.addActionListener(this);  
	        botao2 = new JButton("GO");  
	        botao2.addActionListener(this);  
	         
	        panel.add(label2);
	        panel.add(texto);  
	        panel.add(label3);
	        panel.add(texto2); 
	        panel.add(botao);  
	        panel.add(label); 
	        panel.add(botao2); 
	      
	          
	        getContentPane().add(panel, BorderLayout.CENTER);  
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	          
	        pack();  
	        setVisible(true);         
	        setSize(400,400);    
	        panel.setLayout(new GridLayout(12, 1)); 
	    }  
	      
	    @SuppressWarnings("deprecation")
		public void actionPerformed(ActionEvent event)  
	    {  
	    	Object src = event.getSource();
	    	
	    	try{

	    	EstoqueDAO dao = new EstoqueDAO();
	    	dao.conectar();
	    	 if (src == botao) {
	    	int cod = (Integer.parseInt(texto.getText()));
	    	String senha = texto2.getText();
	    		    	
	 	
	    	Usuario retorno = dao.encontraUsuario(cod, senha);
	    	    	
	    	
	        label.setText(retorno.getNome());
	    	 }
	    	} catch(Exception ex) {
	    		
	    		label.setText("Nao cadastrado");
	  	    	
	    	 }
	    	 if (src == botao2){
	    		 
	    		 this.hide();
	    		 swingProduto t = new swingProduto(); 
	    	     t.criaJanela();  
	    	 }
	               
	     
	        
	    }  
	    
	      
	  
	} 