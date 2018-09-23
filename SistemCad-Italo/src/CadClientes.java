/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.JOptionPane;
/**
 *
 * @author italo
 */
public class CadClientes extends JFrame{
     JLabel rotulo1, rotulo2, rotulo3, rotulo4, rotulo5, rotulo6, rotulo7, rotulo8;
     JFormattedTextField rot1, rot4, rot5, rot6;
     JTextField rot2, rot3, rot7;
     JButton button1, button2, limp;
     MaskFormatter mascaracpf, mascaratel,mascararg, mascaracep;
     ImageIcon icone, icon2, icon3;
     
     public CadClientes(){
     super("Cadastro de Cliente");
     Container tela = getContentPane(); 
        setLayout(null);
        
       
        
    icone = new ImageIcon("Ap5.gif");
    icon2 = new ImageIcon("Limp3.gif");
    icon3 = new ImageIcon("Close3.gif");
        
        rotulo5 = new JLabel("Cadastro de Cliente");
        rotulo1 = new JLabel("CPF: ");
        rotulo6 = new JLabel("RG :");
        rotulo2 = new JLabel("Nome: ");
        rotulo3 = new JLabel("Endereço: ");
        rotulo7 = new JLabel("CEP: ");
        rotulo4 = new JLabel("Telefone: ");
        rotulo8 = new JLabel("Email: ");
        button1 = new JButton("Cadastrar", icone);
        button2 = new JButton("Fechar", icon3);
        limp = new JButton("Limpar", icon2);
try{        
        mascaracpf = new MaskFormatter("#########-##");
        mascaratel = new MaskFormatter("(##)####-####");
        mascararg = new MaskFormatter("##.###.###-#");
        mascaracep = new MaskFormatter("#####-###");
        
        mascaratel.setPlaceholderCharacter('_');
	mascaracpf.setPlaceholderCharacter('_');
        mascararg.setPlaceholderCharacter('_');
        mascaracep.setPlaceholderCharacter('_');
}
catch(ParseException excp){}

            rot1 = new JFormattedTextField(mascaracpf);
            rot2 = new JTextField(20);
            rot3 = new JTextField(20);
            rot4 = new JFormattedTextField(mascaratel);
            rot5 = new JFormattedTextField(mascararg);
            rot6 = new JFormattedTextField(mascaracep);
            rot7 = new JTextField(20);

           
            
            rotulo5.setForeground(Color.black);
             //rotulo5.setForeground(new Color(0, 96, 128));
            rotulo5.setFont(new Font("Arial",Font.BOLD,25));
            
           
            
            rotulo5.setBounds(120,10,250,40);
            rotulo1.setBounds(50,50,100,20);
            rotulo6.setBounds(50,80,100,20);
            rotulo2.setBounds(50,110,100,20);
            rotulo3.setBounds(50,140,100,20);
            rotulo7.setBounds(50,170,200,20);
            rotulo4.setBounds(50,200,100,20);
            rotulo8.setBounds(50,230,100,20);
            rot1.setBounds(120,50,100,20);
            rot2.setBounds(120,110,300,20);
            rot3.setBounds(120,140,300,20);
            rot4.setBounds(120,200,100,20);
            rot5.setBounds(120,80,100,20);
            rot6.setBounds(120,170,100,20);
            rot7.setBounds(120,230,300,20);
            
            button1.setBounds(20,300,120,20);
            button2.setBounds(420,300,120,20);
            limp.setBounds(220,300,120,20);
        
            
            
            button2.addActionListener(
        new ActionListener() {
        public void actionPerformed(ActionEvent e){
        	setVisible(false);
        	}
       	}
      );
            
            
            
            button1.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    
                 JOptionPane.showMessageDialog(null,"O Cliente foi Cadastrado !! \n\n" + 
                        "Nome do Cliente:  " + rot2.getText() + 
                        "\nCPF:  " + rot1.getText() + 
                        "\nRG:  " + rot5.getText() + 
                        "\nCEP:  " + rot6.getText() + 
                        "\nEndereço:  " + rot3.getText() + 
                        "\nTelefone:  " + rot4.getText() + 
                        "\nEmail:  " + rot7.getText());
                 
                  
                }
            }
            );
            
            limp.addActionListener(
            new ActionListener() {
        	public void actionPerformed(ActionEvent e){
        	rot1.setText(null);
        	rot2.setText(null);
                rot3.setText(null);
                rot4.setText(null);
                rot5.setText(null);
                rot6.setText(null);
                rot7.setText(null);
                
        	rot1.requestFocus();
        				
        	}
       	}
      );
        
         tela.add(rotulo1); 
         tela.add(rotulo2);  
         tela.add(rotulo3);  
         tela.add(rotulo4);  
         tela.add(rot1);  
         tela.add(rot2);  
         tela.add(rot3);  
         tela.add(rot4); 
         tela.add(rot5);
         tela.add(rot6);
         tela.add(rot7);
         tela.add(button1);  
         tela.add(button2);  
         tela.add(limp);
         tela.add(rotulo5);
         tela.add(rotulo6);
         tela.add(rotulo7);
         tela.add(rotulo8);
         
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
        setVisible(true);
        setSize(600,400);
        setLocationRelativeTo(null);
        
        
        
                    

             }
}


             

