/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifatec;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Aluno
 */
public class criarJogador extends JFrame{
  JLabel lblTitulo1        = new JLabel ("Criar Jogador");
    JButton btnFechar, cadastrar, limpar;
      
   JLabel nmJogador, camisaJogador, PosicaoJogador;
   JTextField txb1, txb2, txb3;
   
   
 
    JPanel Painel1,
            Painel2;


    public criarJogador(){
 
        super("FIFAtec");
        Container Tela = getContentPane();
        setLayout(null);
        //Tela.setBackground(Color.LIGHT_GRAY);     
        
        

        btnFechar  = new JButton("Fechar"); 
        cadastrar  = new JButton("Criar Jogador"); 
        limpar  = new JButton("Limpar"); 
       
        
        cadastrar.setBounds(200,500,120,20);
        limpar.setBounds(600,500,120,20);
     
        
        cadastrar.setBorder(null); 
        cadastrar.setBackground(Color.red);
        cadastrar.setForeground(Color.white);
        
        limpar.setBorder(null); 
        limpar.setBackground(Color.red);
        limpar.setForeground(Color.white);
        
//CONFIGURAÇÃO DAS JLABEL E JTEXTFIELD________________________________________________________________________________       
        nmJogador = new JLabel("Nome Do Jogador: ");
        camisaJogador = new JLabel("Camisa do Jogador: ");
        PosicaoJogador = new JLabel("Posição do Jogador: ");
        
     
        txb1 = new JTextField(50);
        txb2 = new JTextField(50);
        txb3 = new JTextField(50);
        
        
        
        nmJogador.setBounds(120,300,150,20);
        camisaJogador.setBounds(120,340,150,20);
        PosicaoJogador.setBounds(120,380,150,20);
        
        
        txb1.setBounds(300,300,500,20);
        txb2.setBounds(300,340,500,20);
        txb3.setBounds(300,380,500,20);
        
        
        
     nmJogador.setFont(new Font("EA Font v1.5 by Ghettoshark", Font.BOLD, 15));
     camisaJogador.setFont(new Font("EA Font v1.5 by Ghettoshark", Font.BOLD, 15));
     PosicaoJogador.setFont(new Font("EA Font v1.5 by Ghettoshark", Font.BOLD, 15));
   
     nmJogador.setForeground(Color.white);
     camisaJogador.setForeground(Color.white);
     PosicaoJogador.setForeground(Color.white);
     
     
     
     
        
        
   
//CONFIGURANDO TITULO E CAIXA DE TEXTO___________________________________________________________________
        lblTitulo1.setFont(new Font("EA Font v1.5 by Ghettoshark", Font.BOLD, 60));
        lblTitulo1.setForeground(Color.white);
        lblTitulo1.setBounds(340,0,600,200);
        
        
      
//CONFIGURANDO O PAINEL1_________________________________________________________________________________
        Painel1 = new JPanel ();
        Painel1.setBackground(new Color(0,0,0,150));
        Painel1.setOpaque(true);
        Painel1.setBounds(0,0,1024,768);

        Painel1.add(btnFechar);
       
       
//_________________________________________________________________________________________________________    
//CONFIGURANDO PAINEL 2____________________________________________________________________________________
        Painel2 = new JPanel ();//    azul,Verde,Vermelho
        Painel2.setBackground(new Color(0,   0,     0,180));
        Painel2.setOpaque(true);
        Painel2.setBounds(0,0,1024,768);
//_________________________________________________________________________________________________________

//*/ //BOTÃO FECHAR____________________________________________________________________________________________
        btnFechar.setBounds(900,20,80,25);
        btnFechar.setBorder(null); 
        btnFechar.setBackground(Color.red);
        btnFechar.setForeground(Color.white);
        btnFechar.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              int escolha;
                                Object[] botoes={"sim","não"};
                                escolha=JOptionPane.showOptionDialog
                                        (null,"Deseja fechar este aplicativo?",
                                        "Fechar o aplicativo",JOptionPane.
                                        YES_NO_OPTION,JOptionPane.
                                        QUESTION_MESSAGE,null,botoes,botoes[0]);
                                if(escolha==JOptionPane.YES_OPTION)
                                dispose();
        }});                           
//_____________________________________________________________________________________________________________


//BOTÃO LIMPAR ____________________________________________________________________________________________    
 limpar.addActionListener(
            new ActionListener() {
        	public void actionPerformed(ActionEvent e){
        	txb1.setText(null);
        	txb2.setText(null);
                
        	txb1.requestFocus();
        				
        	}
       	}
      );   
 //_______________________________________________________________________________________________________________________    




        
   
    



        Tela.add(lblTitulo1); 
        Tela.add(btnFechar);
        Tela.add(nmJogador);
        Tela.add(camisaJogador);
        Tela.add(PosicaoJogador);
        Tela.add(txb1);
        Tela.add(txb2);
        Tela.add(txb3);
        Tela.add(cadastrar);
        Tela.add(limpar);
        Tela.add(Painel1);
        Tela.add(Painel2);
       

        
        setUndecorated(true);
        setBackground(new Color(0f, 0f, 0f, 0f));
        setSize(1024,768);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    

    
}
    


  
 
        
