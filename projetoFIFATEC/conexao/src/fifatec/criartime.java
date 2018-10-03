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
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Aluno
 */
public class criartime extends JFrame{
   JLabel lblTitulo1        = new JLabel ("Criar Time");
    JButton btnFechar, cadastrar, limpar, add;
      
   JLabel nmTime, descTime, jogador1, jogador2, jogador3, jogador4, jogador5, goleiro;
   JTextField txb1, txb2, txb3, txb4, txb5, txb6, txb7, txb8;
   
   
 
    JPanel Painel1,
            Painel2;


    public criartime(){
 
        super("FIFAtec");
        Container Tela = getContentPane();
        setLayout(null);
        //Tela.setBackground(Color.LIGHT_GRAY);     
        
        

        btnFechar  = new JButton("Fechar"); 
        cadastrar  = new JButton("Criar Time"); 
        limpar  = new JButton("Limpar"); 
        add  = new JButton("Add Emblema 300x220"); 
        
        cadastrar.setBounds(200,680,120,20);
        limpar.setBounds(400,680,120,20);
        add.setBounds(380,200,200,20);
        
        cadastrar.setBorder(null); 
        cadastrar.setBackground(Color.red);
        cadastrar.setForeground(Color.white);
        
        limpar.setBorder(null); 
        limpar.setBackground(Color.red);
        limpar.setForeground(Color.white);
        
//CONFIGURAÇÃO DAS JLABEL E JTEXTFIELD________________________________________________________________________________       
        nmTime = new JLabel("Nome Do Time: ");
        descTime = new JLabel("Descrição do Time: ");
        jogador1 = new JLabel("Nome do 1º Jogador: ");
        jogador2 = new JLabel("Nome do 2º Jogador: ");
        jogador3 = new JLabel("Nome do 3º Jogador: ");
        jogador4 = new JLabel("Nome do 4º Jogador: ");
        jogador5 = new JLabel("Nome do 5º Jogador: ");
        goleiro  = new JLabel("Nome do Goleiro: ");
        
        txb1 = new JTextField(50);
        txb2 = new JTextField(50);
        txb3 = new JTextField(50);
        txb4 = new JTextField(50);
        txb5 = new JTextField(50);
        txb6 = new JTextField(50);
        txb7 = new JTextField(50);
        txb8 = new JTextField(50);
        
        
        nmTime.setBounds(120,400,140,20);
        descTime.setBounds(120,430,140,20);
        jogador1.setBounds(120,460,160,20);
        jogador2.setBounds(120,490,160,20);
        jogador3.setBounds(120,520,160,20);
        jogador4.setBounds(120,550,160,20);
        jogador5.setBounds(120,580,160,20);
        goleiro.setBounds(120,610,140,20);
        
        txb1.setBounds(280,400,500,20);
        txb2.setBounds(280,430,500,20);
        txb3.setBounds(280,460,500,20);
        txb4.setBounds(280,490,500,20);
        txb5.setBounds(280,520,500,20);
        txb6.setBounds(280,550,500,20);
        txb7.setBounds(280,580,500,20);
        txb8.setBounds(280,610,500,20);
        
     nmTime.setFont(new Font("EA Font v1.5 by Ghettoshark", Font.BOLD, 15));
     descTime.setFont(new Font("EA Font v1.5 by Ghettoshark", Font.BOLD, 15));
     jogador1.setFont(new Font("EA Font v1.5 by Ghettoshark", Font.BOLD, 15));
     jogador2.setFont(new Font("EA Font v1.5 by Ghettoshark", Font.BOLD, 15));
     jogador3.setFont(new Font("EA Font v1.5 by Ghettoshark", Font.BOLD, 15));
     jogador4.setFont(new Font("EA Font v1.5 by Ghettoshark", Font.BOLD, 15));
     jogador5.setFont(new Font("EA Font v1.5 by Ghettoshark", Font.BOLD, 15));
     goleiro.setFont(new Font("EA Font v1.5 by Ghettoshark", Font.BOLD, 15));
        
     nmTime.setForeground(Color.white);
     descTime.setForeground(Color.white);
     jogador1.setForeground(Color.white);
     jogador2.setForeground(Color.white);
     jogador3.setForeground(Color.white);
     jogador4.setForeground(Color.white);
     jogador5.setForeground(Color.white);
     goleiro.setForeground(Color.white);
     
     
     
        
        
   
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
                txb3.setText(null);
                txb4.setText(null);
                txb5.setText(null);
                txb6.setText(null);
                txb7.setText(null);
                txb8.setText(null);
                
        	txb1.requestFocus();
        				
        	}
       	}
      );   
 //________________________________________________________________________________________________________________
//BOTÃO ADD ________________________________________________________________________________________________________
add.addActionListener(new ActionListener() {    
 public void actionPerformed(ActionEvent arg0) { 
      JFileChooser jfilechooser = new JFileChooser();
        File file = new File("");
        

        int option = jfilechooser.showOpenDialog(null);

        if (option == JFileChooser.APPROVE_OPTION) {
            file = jfilechooser.getSelectedFile();

            ImageIcon image = new ImageIcon(file.getPath());

            int height = image.getIconHeight();
            int width = image.getIconWidth();

            add.setSize(width, height);
            add.setIcon(image);
            add.repaint();
            add.setBorder(BorderFactory.createLineBorder(Color.black));
            add.setHorizontalAlignment(SwingConstants.CENTER);
            add.setBounds(380,160,300,220);
           

        } else {
            JOptionPane.showMessageDialog(null, "Você selecionou nenhum diretorio.");
        }
}    });
 //____________________________________________________________________________________________________________________________    




        
   
    



        Tela.add(lblTitulo1); 
        Tela.add(btnFechar);
        Tela.add(nmTime);
        Tela.add(descTime);
        Tela.add(jogador1);
        Tela.add(jogador2);
        Tela.add(jogador3);
        Tela.add(jogador4);
        Tela.add(jogador5);
        Tela.add(goleiro);
        Tela.add(txb1);
        Tela.add(txb2);
        Tela.add(txb3);
        Tela.add(txb4);
        Tela.add(txb5);
        Tela.add(txb6);
        Tela.add(txb7);
        Tela.add(txb8);
        Tela.add(cadastrar);
        Tela.add(limpar);
        Tela.add(add);
        Tela.add(Painel1);
        Tela.add(Painel2);
       

        
        setUndecorated(true);
        setBackground(new Color(0f, 0f, 0f, 0f));
        setSize(1024,768);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    

    
}