/* esse arquivo foi modificado e criado 2, swingUsuario e swingProduto, este aqui não existe mais e eu não sei excluir ele daqui */


/* package swingLP2;

import javax.swing.*;  

import projetoLP2.*;

import java.awt.*;  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


	public class Swing extends JFrame implements ActionListener  
	{  
	    
		private static final long serialVersionUID = -6784375067619890013L;
		JButton botao;  
	    JPanel panel;  
	    static JTextField texto;  
	    static JTextField texto2; 
	    JLabel label;
	    JLabel label2;
	    JLabel label3;
		String b;
	      
	    public Swing(String t)  
	    {  
	        super("Estoque");  
	    }  
	      
	    public void criaJanela()  
	    {         
	    	
	        texto = new JTextField();  
	        texto2 = new JTextField();  
	          
	        panel = new JPanel();  
	        label = new JLabel();  
	        label2 = new JLabel("Digite um c�digo de um cliente a procurar.");  
	        label3 = new JLabel("Digite uma senha.");  
	                  
	        botao = new JButton("OK");  
	        botao.addActionListener(this);  
	         
	        panel.add(label2);
	        panel.add(texto);  
	        panel.add(label3);
	        panel.add(texto2); 
	        panel.add(botao);  
	        panel.add(label); 
	      
	          
	        getContentPane().add(panel, BorderLayout.CENTER);  
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	          
	        pack();  
	        setVisible(true);         
	        setSize(400,400);    
	        panel.setLayout(new GridLayout(12, 1)); 
	    }  
	      
	    public void actionPerformed(ActionEvent event)  
	    {  
	    	EstoqueDAO dao = new EstoqueDAO();
	    	dao.conectar();
	    	int cod = (Integer.parseInt(texto.getText()));
	    	String senha = texto2.getText();
	    	Usuario retorno = dao.encontraUsuario(cod, senha);
	    	try{
	        label.setText(retorno.getNome());
	    	} catch(Exception ex) {
	    		
	    		label.setText("Nao cadastrado");
	    	}
	               
	    	
	        
	    }  
	      
	    public static void main(String args[]) 
	    {    
	    
	        Swing ex2 = new Swing("teste");  
	        ex2.criaJanela();  
	     
		   
	        
	    }  
	} */
