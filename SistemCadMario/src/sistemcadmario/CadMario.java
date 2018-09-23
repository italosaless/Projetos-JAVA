/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemcadmario;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.util.*;
/**
 *
 * @author italo
 */
public class CadMario extends JFrame {
JButton cadCli, cadForn, cadUser, cadProd, btSair;
JLabel text1, rotulo, hr, lb1, lb2, lb3, lb4;
ImageIcon icone, icon2, icon3, icon4, icon5;
String nome;
Calendar hora;
int hh, mm, ss, h;
DecimalFormat formato;


 public void HORAS(){
        hora = Calendar.getInstance();
        hh = hora.get(Calendar.HOUR_OF_DAY);
        mm = hora.get(Calendar.MINUTE);
        ss = hora.get(Calendar.SECOND);
        
        formato = new DecimalFormat("00");
        hr.setText("Hora: "+formatar(hh%12)+":"+formatar(mm)+":"+formatar(ss));
    }
    private String formatar(int num){
    formato = new DecimalFormat("00");
    return formato.format(num);
    }

    public CadMario(){
    super ("SistemCAD");
    Container tela = getContentPane();
    setLayout(null);
    
    
    
    
    
    icone = new ImageIcon("sairr.png");
    icon2 = new ImageIcon("marioo.png");
    icon3 = new ImageIcon("mariovoa.png");
    icon4 = new ImageIcon("dino.png");
    icon5 = new ImageIcon("yoshi.png");
    
    
    text1 = new JLabel("SistCad - Sistema de Cadastro");
    cadCli = new JButton("", icon2);
    cadForn = new JButton("", icon4);
    cadProd = new JButton("", icon3);
    cadUser = new JButton("", icon5);
    btSair = new JButton("SAIR", icone);
    lb1 = new JLabel("Cadastrar Cliente");
    lb2 = new JLabel("Cadastrar Fornecedor");
    lb3 = new JLabel("Cadastrar Produtos");
    lb4 = new JLabel("Cadastrar Users");
    rotulo = new JLabel("");
    hr = new JLabel("");
    
    text1.setForeground(Color.black);
  //  text1.setForeground(new Color(0, 96, 128));
    text1.setFont(new Font("Arial",Font.BOLD,30));

   rotulo.setForeground(Color.BLACK);
  // rotulo.setForeground(new Color(0, 96, 128));
    rotulo.setFont(new Font("Arial",Font.BOLD,11));
    
    hr.setForeground(Color.BLACK);
    //hr.setForeground(new Color(0, 96, 128));
    hr.setFont(new Font("Arial",Font.BOLD,12));
    
    cadCli.setForeground(Color.BLACK);
   // cadCli.setForeground(new Color(0, 96, 128));
    cadCli.setOpaque(false);
    
    
    cadForn.setOpaque(false);
    
    cadProd.setForeground(Color.BLACK);
   // cadProd.setForeground(new Color(0, 96, 128));
    cadProd.setOpaque(false);
    
    cadUser.setForeground(Color.BLACK);
    //cadUser.setForeground(new Color(0, 96, 128));
    cadUser.setOpaque(false);
    
    btSair.setForeground(Color.RED);
   //btSair.setForeground(new Color(0, 96, 128));
    btSair.setOpaque(false);
   
    lb1.setForeground(Color.BLACK);
   // lb1.setForeground(new Color(0, 96, 128));
    
    lb2.setForeground(Color.BLACK);
    //lb2.setForeground(new Color(0, 96, 128));
    
    lb3.setForeground(Color.BLACK);
    //lb3.setForeground(new Color(0, 96, 128));
    
    lb4.setForeground(Color.BLACK);
   // lb4.setForeground(new Color(0, 96, 128));
    
    text1.setBounds(60,20,500,40);
    cadCli.setBounds(50,70,220,150);
    cadForn.setBounds(320,70,220,150);
    cadProd.setBounds(50,250,220,150);
    cadUser.setBounds(320,250,220,150);
    btSair.setBounds(140,440,120,40);
    hr.setBounds(480,440,220,20);
    lb1.setBounds(100,220,220,20);
    lb2.setBounds(380,220,220,20);
    lb3.setBounds(100,400,220,20);
    lb4.setBounds(380,400,220,20);
    
    
    cadCli.setBackground(Color.red);
     cadCli.setBackground(new Color(0,0,0,0));
     cadCli.setOpaque(false);
    
    cadForn.setBackground(Color.red);
    cadForn.setBackground(new Color (0,0,0,0));
    cadForn.setOpaque(false);
    
    cadProd.setBackground(Color.red);
    cadProd.setBackground(new Color (0,0,0,0));
    cadProd.setOpaque(false);
    
    cadUser.setBackground(Color.red);
    cadUser.setBackground(new Color (0,0,0,0));
    cadUser.setOpaque(false);
   
    btSair.setBackground(new Color (0,0,0,0));
    btSair.setOpaque(false);
     
    cadCli.setBorder(null);
    cadForn.setBorder(null);
    cadUser.setBorder(null);
    cadProd.setBorder(null);
    btSair.setBorder(null);
    
    ActionListener tarefa = (new ActionListener() {
        public void actionPerformed(ActionEvent e){
        	HORAS();
        	
        }});
    javax.swing.Timer time = new javax.swing.Timer(1000,tarefa);
    time.start();
    
    
    
    
    btSair.setToolTipText("Botão Sair!");
    UIManager.put("ToolTip.background",SystemColor.info);
    UIManager.put("ToolTip.foreground",Color.red);

    
    cadCli.addActionListener(
        new ActionListener() {
        public void actionPerformed(ActionEvent e){
        	MCliente app2 = new MCliente();
            app2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	
        	}
       	}
      );
        	
    
    cadForn.addActionListener(
        new ActionListener() {
        public void actionPerformed(ActionEvent e){
        	MForn app3 = new MForn();
            app3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	
        	}
       	}
      );
    
    
    
    cadUser.addActionListener(
        new ActionListener() {
        public void actionPerformed(ActionEvent e){
        	MUser app4 = new MUser();
            app4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	
        	}
       	}
      );
    
    
    cadProd.addActionListener(
        new ActionListener() {
        public void actionPerformed(ActionEvent e){
        	MProd app5 = new MProd();
            app5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	
        	}
       	}
      );
     
   
    
    
    btSair.addActionListener(
        new ActionListener() {
        public void actionPerformed(ActionEvent e){
            int status = JOptionPane.showConfirmDialog(null,"Deseja Realmente "
             + "Fechar O Programa? ", "Menssagem de saida", JOptionPane.YES_NO_OPTION);
           if(status == JOptionPane.YES_OPTION)
            
            
               setVisible(false);
                }
       	}
      );
    
   
    
    
    tela.add(rotulo);
    tela.add(text1);
    tela.add(cadCli);
    tela.add(cadForn);
    tela.add(cadProd);
    tela.add(cadUser);
    tela.add(btSair);
    tela.add(hr);
    tela.add(lb1);
    tela.add(lb2);
    tela.add(lb3);
    tela.add(lb4);
    
    //getContentPane().setBackground(Color.BLUE);
    //getContentPane().setBackground(new Color (255, 144, 0));
    
    
    JDesktopPane desk = new JDesktopPane(){
          Image im = (new ImageIcon("mmmm.png")).getImage(); 
          public void paintComponent(Graphics g){        
           g.drawImage(im,0,0,this);            }
                                      };
        tela.add(desk);
        JLabel status = new JLabel();
            status.setBorder(BorderFactory.createLineBorder(Color.WHITE));
            status.setBounds(1, 1, 800, 590);
            status.setIcon(new ImageIcon("mmmm.png"));
            tela.add(status);

    
    setUndecorated(true);        
    setSize(600,500);
    setVisible(true);
    setLocationRelativeTo(null);
    
    
}
}
