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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Aluno
 */
public class timeJogadores extends JFrame {
    JLabel lblTitulo1        = new JLabel ("Times e Jogadores");
    JTextField txbPesquisar     = new JTextField(50);
    JButton btnPesquisar         = new JButton("Pesquisar"),
 
    btnFechar  = new JButton("Fechar");
    JPanel Painel1,
            Painel2;
   
    ImageIcon IconT = new ImageIcon("bar1.png");
    ImageIcon IconJ = new ImageIcon("ney.png");
    

    JButton btnTime = new JButton("",IconT);
    JButton btnJogador = new JButton("",IconJ);
    
    JLabel lblT = new JLabel("Criar Time");
    JLabel lblJ = new JLabel("Criar Jogador");
    
     
 

    
    
//_________Instanciando tabela__________________________________________________________________________________________________________
    JTable TabelaRanking;
    String[] coluna = {"Posição","Time","Pontos"};
    String[][] data = new String[][]{
    {"1º","Santos","43"}

};
 
   


    public timeJogadores(){
 
        super("FIFAtec");
        Container Tela = getContentPane();
        setLayout(null);
        //Tela.setBackground(Color.LIGHT_GRAY);     
        
        
        
        
   
//CONFIGURANDO TITULO E CAIXA DE TEXTO___________________________________________________________________
        lblTitulo1.setFont(new Font("EA Font v1.5 by Ghettoshark", Font.BOLD, 60));
        lblTitulo1.setForeground(Color.white);
        lblTitulo1.setBounds(200,0,600,200);
        txbPesquisar.setBounds(180,640,400,30);
        
      
//CONFIGURANDO O PAINEL1_________________________________________________________________________________
        Painel1 = new JPanel ();
        Painel1.setBackground(new Color(0,0,0,150));
        Painel1.setOpaque(true);
        Painel1.setBounds(0,0,1024,768);

        Painel1.add(btnFechar);
        Painel1.add(btnPesquisar);
       
//_________________________________________________________________________________________________________    
//CONFIGURANDO PAINEL 2____________________________________________________________________________________
        Painel2 = new JPanel ();//    azul,Verde,Vermelho
        Painel2.setBackground(new Color(0,   0,     0,180));
        Painel2.setOpaque(true);
        Painel2.setBounds(0,0,1024,768);
//_________________________________________________________________________________________________________
//INSTANCIANDO A TABELA____________________________________________________________________________________

        TabelaRanking = new JTable(data,coluna);
        JScrollPane jps = new JScrollPane(TabelaRanking);
        TabelaRanking.setForeground(Color.white);
        TabelaRanking.setBackground(Color.darkGray);
        jps.setBounds(180,400, 700, 200);
        Tela.add(jps);
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
//BOTÃO PESQUISAR______________________________________________________________________________________________
        btnPesquisar.setBounds(620,640,100,30);
        btnPesquisar.setBorder(null); 
        btnPesquisar.setBackground(Color.DARK_GRAY);
        btnPesquisar.setForeground(Color.white);
//_____________________________________________________________________________________________________________
//BOTÃO CRIARTIME______________________________________________________________________________________________
         btnTime.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        
            criartime app = new criartime();
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        }
        );
//_____________________________________________________________________________________________________________
//BOTÃO CRIARJOGADOR___________________________________________________________________________________________
btnJogador.addActionListener(
        new ActionListener(){
        public void actionPerformed(ActionEvent e){
        
            criarJogador app = new criarJogador();
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        }
        );


//_____________________Botão criar Jogador e time Configuração ______________________________________________________________________     
     btnTime.setBackground(Color.red);
     btnTime.setBackground(new Color(0,0,0,0));
     btnTime.setOpaque(false);
     
     btnJogador.setBackground(Color.red);
     btnJogador.setBackground(new Color(0,0,0,0));
     btnJogador.setOpaque(false);
     
     lblT.setForeground(Color.white);
     lblJ.setForeground(Color.white);
     
     lblT.setFont(new Font("EA Font v1.5 by Ghettoshark", Font.BOLD, 30));
     lblJ.setFont(new Font("EA Font v1.5 by Ghettoshark", Font.BOLD, 30));
     
    btnJogador.setBounds(460,140,220,150);
    btnTime.setBounds(200,140,220,150);
    lblT.setBounds(220,300,220,40);
    lblJ.setBounds(480,300,220,40);
        
        
   
    



        Tela.add(lblTitulo1);
        Tela.add(btnFechar);
        Tela.add(btnTime);
        Tela.add(btnJogador);
        Tela.add(lblT);
        Tela.add(lblJ);
        Tela.add(Painel1);
        Tela.add(txbPesquisar);
        Tela.add(btnPesquisar);
        Tela.add(Painel2);
       

        
        setUndecorated(true);
        setBackground(new Color(0f, 0f, 0f, 0f));
        setSize(1024,768);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    

    
}