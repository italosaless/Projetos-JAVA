
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.NullPointerException.*;
import java.text.DecimalFormat;
import java.util.*;
import javax.swing.Timer.*;
import java.lang.RuntimeException.*;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ítalo
 */
public class Sistcad extends JFrame{
JButton cadCli, cadForn, cadUser, cadProd, btSair;
JLabel text1, rotulo, hr;
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

    public Sistcad(){
    super ("SistemCAD");
    Container tela = getContentPane();
    setLayout(null);
    
    nome = JOptionPane.showInputDialog("Informe seu Nome: ");
    
    
    
    icone = new ImageIcon("deslig.png");
    icon2 = new ImageIcon("Cliente.png");
    icon3 = new ImageIcon("Prod.png");
    icon4 = new ImageIcon("Fornecedor.png");
    icon5 = new ImageIcon("Chave.png");
    
    
    text1 = new JLabel("SistCad - Sistema de Cadastro");
    cadCli = new JButton("Cadastrar Cliente", icon2);
    cadForn = new JButton("Cadastrar Fornecedor", icon4);
    cadProd = new JButton("Cadastrar Produtos", icon3);
    cadUser = new JButton("Cadastrar Users", icon5);
    btSair = new JButton("SAIR", icone);
    rotulo = new JLabel("");
    hr = new JLabel("");
    
    text1.setForeground(Color.black);
    text1.setForeground(new Color(0, 96, 128));
    text1.setFont(new Font("Arial",Font.BOLD,30));

   rotulo.setForeground(Color.black);
   rotulo.setForeground(new Color(0, 96, 128));
    rotulo.setFont(new Font("Arial",Font.BOLD,11));
    
    hr.setForeground(Color.BLUE);
    hr.setForeground(new Color(0, 96, 128));
    hr.setFont(new Font("Arial",Font.BOLD,12));
    
    cadCli.setForeground(Color.BLUE);
    cadCli.setForeground(new Color(0, 96, 128));
    
    cadForn.setForeground(Color.BLUE);
    cadForn.setForeground(new Color(0, 96, 128));
    
    cadProd.setForeground(Color.BLUE);
    cadProd.setForeground(new Color(0, 96, 128));
    
    cadUser.setForeground(Color.BLUE);
    cadUser.setForeground(new Color(0, 96, 128));
    
    btSair.setForeground(Color.BLUE);
    btSair.setForeground(new Color(0, 96, 128));
   
    text1.setBounds(60,20,500,40);
    cadCli.setBounds(50,60,220,40);
    cadForn.setBounds(300,60,220,40);
    cadProd.setBounds(50,110,220,40);
    cadUser.setBounds(300,110,220,40);
    btSair.setBounds(140,170,120,40);
    rotulo.setBounds(10,240,220,20);
    hr.setBounds(480,240,220,20);
    
    cadCli.setBackground(Color.red);
    cadCli.setBackground(new Color (152, 204, 253));
    
    cadForn.setBackground(Color.red);
    cadForn.setBackground(new Color (152, 204, 253));
    
    cadProd.setBackground(Color.red);
    cadProd.setBackground(new Color (152, 204, 253));
    
    cadUser.setBackground(Color.red);
    cadUser.setBackground(new Color (152, 204, 253));
    
    btSair.setBackground(Color.red);
    btSair.setBackground(new Color (152, 204, 253));
    
    
    
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
        	CadClientes app2 = new CadClientes();
            app2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	
        	}
       	}
      );
        	
    
    cadForn.addActionListener(
        new ActionListener() {
        public void actionPerformed(ActionEvent e){
        	cadforne app3 = new cadforne();
            app3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	
        	}
       	}
      );
    
    
    
    cadUser.addActionListener(
        new ActionListener() {
        public void actionPerformed(ActionEvent e){
        	cadUsers app4 = new cadUsers();
            app4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	
        	}
       	}
      );
    
    
    cadProd.addActionListener(
        new ActionListener() {
        public void actionPerformed(ActionEvent e){
        	cadProdu app5 = null;
            try {
                app5 = new cadProdu();
            } catch (ParseException ex) {
                Logger.getLogger(Sistcad.class.getName()).log(Level.SEVERE, null, ex);
            }
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
    
    nome = JOptionPane.showInputDialog("Informe seu Nome: ");
    rotulo.setText("Usuario: " + nome.toUpperCase());
    
    
    tela.add(rotulo);
    tela.add(text1);
    tela.add(cadCli);
    tela.add(cadForn);
    tela.add(cadProd);
    tela.add(cadUser);
    tela.add(btSair);
    tela.add(hr);
    
    JDesktopPane desk = new JDesktopPane(){
          Image im = (new ImageIcon("bl.png")).getImage(); 
          public void paintComponent(Graphics g){        
           g.drawImage(im,0,0,this);            }
                                      };
        tela.add(desk);
        JLabel status = new JLabel();
            status.setBorder(BorderFactory.createLineBorder(Color.WHITE));
            status.setBounds(1, 1, 600, 400);
            status.setIcon(new ImageIcon("bl.png"));
            tela.add(status);

    
    setUndecorated(true);        
    setSize(600,300);
    setVisible(true);
    setLocationRelativeTo(null);
    
    
}
}
