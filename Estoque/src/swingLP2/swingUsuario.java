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
	    JLabel aux;
	    JLabel label;
	    JLabel label2;
		String b;
	      
	    public swingUsuario()  
	    {  
	        super("Estoque/Usuarios");  
	    }  
	      
	    public void criaJanela()  
	    {         
	    	
	        texto = new JTextField();  
	        aux = new JLabel();  
	          
	        panel = new JPanel();  
	        label = new JLabel();  
	        label2 = new JLabel("Digite um código de um cliente a procurar:");  
	                  
	        botao = new JButton("OK");  
	        botao.addActionListener(this);  
	        botao2 = new JButton("Ir para produtos");  
	        botao2.addActionListener(this);  
	         
	        panel.add(label2);
	        panel.add(texto);  
	        panel.add(aux); 	  
	        panel.add(label); 
	        panel.add(botao);  
	        panel.add(aux); 
	        panel.add(botao2); 
	      
	          
	        getContentPane().add(panel, BorderLayout.CENTER);  
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	          
	        pack();  
	        setVisible(true);         
	        setSize(250,400);    
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
	    		    	
	 	
	    	Usuario retorno = dao.encontraUsuario(cod);
	    	    	
	    	
	        label.setText(retorno.getNome());
	    	 }
	    	} catch(Exception ex) {
	    		
	    		label.setText("Nao cadastrado.");
	  	    	
	    	 }
	    	 if (src == botao2){
	    		 
	    		 this.hide();
	    		 swingProduto t = new swingProduto(); 
	    	     t.criaJanela();  
	    	 }
	               
	     
	        
	    }  
	    
	      
	  
	} 