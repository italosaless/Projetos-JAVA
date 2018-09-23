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
public class cadUsers extends JFrame{

    static void addActionListener(ActionListener actionListener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    JLabel login, nomec, email, senha, senhar, rotulo;
     JTextField logi, nome, mail;
     JButton cad, fechar, limpar;
     ImageIcon icone1, icone2, icone3;
     JPasswordField senh, senh1;
     
     
     public cadUsers(){
     super("Cadastro de Usuarios");
     Container tela = getContentPane(); 
        setLayout(null);
        
        rotulo = new JLabel("Cadastro de Usuarios");
        login = new JLabel("Login: ");
        nomec = new JLabel("Nome Completo: ");
        email = new JLabel("Email: ");
        senha = new JLabel("Senha: ");
        senhar = new JLabel("Repita a Senha: ");
        cad = new JButton("Cadastrar");
        fechar = new JButton("Fechar");
        limpar = new JButton("Limpar");
        

        logi = new JTextField(20);
        nome = new JTextField(20);
        mail = new JTextField(20);
        senh = new JPasswordField(20);
        senh1 = new JPasswordField(20);
        
        icone1 = new ImageIcon("Ap5.gif");
        cad  = new JButton ("Cadastrar",icone1);
        icone2 = new ImageIcon("Close3.gif");
        fechar  = new JButton ("Fechar",icone2);
        icone3 = new ImageIcon("Limp3.gif");
        limpar  = new JButton ("Limpar", icone3);
        
        
            
        rotulo.setForeground(Color.black);
        rotulo.setFont(new Font("Arial",Font.BOLD,20));
        
            rotulo.setBounds(60,20,300,20);
            login.setBounds(50,50,100,20);
            nomec.setBounds(50,80,100,20);
            email.setBounds(50,110,100,20);
            senha.setBounds(50,140,100,20);
            senhar.setBounds(50,170,100,20);
            logi.setBounds(160,50,200,20);
            nome.setBounds(160,80,300,20);
            mail.setBounds(160,110,300,20);
            senh.setBounds(160,140,200,20);
            senh1.setBounds(160,170,200,20);
            cad.setBounds(20,220,120,20);
            fechar.setBounds(420,220,120,20);
            limpar.setBounds(220,220,120,20);
            
            limpar.addActionListener(
            new ActionListener() {
        	public void actionPerformed(ActionEvent e){
        	logi.setText(null);
        	nome.setText(null);
                mail.setText(null);
                senh.setText(null);
                senh1.setText(null);
                
        	logi.requestFocus();
        				
        	}
       	}
      );
            
            
             fechar.addActionListener(
        new ActionListener() {
        public void actionPerformed(ActionEvent e){
        	setVisible(false);
        	}
       	}
      );
            
            cad.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String senha = new String (senh.getPassword());
                   JOptionPane.showMessageDialog(null,"Usuario Foi Cadastrado com sucesso !!\n" + 
                        "\nLogin do Usuario:  " + logi.getText() + 
                        "\nSenha do Usuario:  " + senha +  
                        "\n" + 
                        "\nNome Completo:  " + nome.getText() + 
                        "\nEmail do Usuario:  " + mail.getText());
                }
                
            }
            );
            
         tela.add(login); 
         tela.add(nomec);  
         tela.add(email);  
         tela.add(senha);  
         tela.add(senhar); 
         tela.add(logi);  
         tela.add(nome);  
         tela.add(mail);  
         tela.add(senh);  
         tela.add(senh1);  
         tela.add(cad); 
         tela.add(limpar);  
         tela.add(fechar); 
         tela.add(rotulo);  
         
         JDesktopPane desk = new JDesktopPane(){
          Image im = (new ImageIcon("bl.png")).getImage(); 
          public void paintComponent(Graphics g){        
           g.drawImage(im,0,0,this);            }
                                      };
        tela.add(desk);
        JLabel status = new JLabel();
            status.setBorder(BorderFactory.createLineBorder(Color.WHITE));
            status.setBounds(1, 1, 800, 590);
            status.setIcon(new ImageIcon("bl.png"));
            tela.add(status);
            
            
        setUndecorated(true);
        setVisible(true);
        setSize(600,300);
        setLocationRelativeTo(null);
        
        
        
        
                    

             }
}
    

