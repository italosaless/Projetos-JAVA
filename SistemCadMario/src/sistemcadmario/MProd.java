/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemcadmario;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.io.File;
/**
 *
 * @author italo
 */
public class MProd extends JFrame{
    JLabel codbarra, nomeprod, descprod, catego, marcaprod, quantprod, dataprod,
     valorcus, valormv, valorvista, valormp, valorprazo, valorma, valorata, nomeforn, codprod, rotulo, foto;
    MaskFormatter mascaradata, mascarap, mascarab;
    JTextField cbarra, nomep, descp, categ, marcap, quantp,  vlcusto,
            vlmv, vlvista, vlmp, vlprazo, vlma, vlatacado, nomef, codp;
    JButton cad, limp, fech, add;
    JFormattedTextField data, codep, codeb;
    ImageIcon icone1, icone2, icone3, icone4;
    
    
    public MProd(){
    super("Cadastro de Produtos");
     Container tela = getContentPane(); 
        setLayout(null);
        
        
        
        codbarra = new JLabel("Código de barras:* ");
        nomeprod = new JLabel("Nome do Produto:* ");
        descprod = new JLabel("Descrição do Produto:* ");
        catego = new JLabel("Categoria:* ");
        marcaprod = new JLabel("Marca:* ");
        quantprod = new JLabel("Quantidade:* ");
        dataprod = new JLabel("Data de registro:* ");
        valorcus = new JLabel("Valor de CUSTO:* ");
        valormv = new JLabel("(%)Margem a Vista:* ");
        valormp = new JLabel("(%)Margem a PRAZO:* ");
        valorma = new JLabel("(%)Margem Atacado:* ");
        nomeforn = new JLabel("Nome do Fornecedor:* ");
        codprod = new JLabel("Código do Produto:* ");
        rotulo = new JLabel("Cadastro de Produtos");
      
        icone1 = new ImageIcon("ma.png");
        cad = new JButton("Cadastrar",icone1);
        icone2 = new ImageIcon("star.png");
        limp = new JButton("Limpar",icone2);
        icone3 = new ImageIcon("bala.png");
        fech = new JButton("Fechar",icone3);
        icone4 = new ImageIcon("add.png");
        add = new JButton("ADD FOTO: ", icone4);
        
          
        
        
        cbarra = new JTextField(20);
        nomep = new JTextField(20);
        descp = new JTextField(20);
        categ = new JTextField(20);
        marcap = new JTextField(20);
        quantp = new JTextField(20);
        vlcusto = new JTextField(20);
        vlmv = new JTextField(20);
        vlmp = new JTextField(20);
        vlma = new JTextField(20);
        nomef = new JTextField(20);
        codp = new JTextField(20);
        
        
        
        try{
            mascarap = new MaskFormatter("#####-######-###");
            mascarab = new MaskFormatter("########-####");
             mascaradata = new MaskFormatter("##/##/####");
             mascaradata.setPlaceholderCharacter('_');
              mascarap.setPlaceholderCharacter('_');
               mascarab.setPlaceholderCharacter('_');
        }
        catch(ParseException excp){}
        
        data = new JFormattedTextField(mascaradata);
        codep = new JFormattedTextField(mascarap);
        codeb = new JFormattedTextField(mascarab);
                
          rotulo.setForeground(Color.black);
          rotulo.setFont(new Font("Arial",Font.BOLD,26));
          
          codbarra.setForeground(Color.black);
          nomeprod.setForeground(Color.black);
          descprod.setForeground(Color.black);
          catego.setForeground(Color.black);
          marcaprod.setForeground(Color.black);
          quantprod.setForeground(Color.black);
          dataprod.setForeground(Color.black);
          valorcus.setForeground(Color.black);
          valormv.setForeground(Color.black);
          valormp.setForeground(Color.black);
          valorma.setForeground(Color.black);
          nomeforn.setForeground(Color.black);
          codprod.setForeground(Color.black);
          add.setForeground(Color.black);
          cad.setForeground(Color.black);
          limp.setForeground(Color.black);
          fech.setForeground(Color.black);
          
            
          
             
                   
                          
          
          
          
          rotulo.setBounds(250,20,400,40);
          codprod.setBounds(50,100,200,20);
          codbarra.setBounds(250,100,200,20);
          quantprod.setBounds(450,100,200,20);
          nomeprod.setBounds(50,160,200,20);
          descprod.setBounds(50,210,200,20);
           marcaprod.setBounds(50,320,200,20);
           catego.setBounds(300,320,100,20);
           nomeforn.setBounds(50,360,200,20);
           dataprod.setBounds(50,400,200,40);
           valorcus.setBounds(480,380,200,20);
           valormv.setBounds(480,420,200,20);
           valormp.setBounds(480,440,200,20);
           valorma.setBounds(480,460,200,20);
            
           codep.setBounds(50,120,130,20);
           codeb.setBounds(250,120,130,20);
           quantp.setBounds(450,120,100,20);
           nomep.setBounds(50,180,400,20);
           descp.setBounds(50,230,500,80);
           marcap.setBounds(100,320,160,20);
           categ.setBounds(370,320,160,20);
           nomef.setBounds(50,380,400,20);
           data.setBounds(50,430,100,20);
           vlcusto.setBounds(620,380,100,20);
           vlmv.setBounds(620,420,100,20);
           vlmp.setBounds(620,440,100,20);
           vlma.setBounds(620,460,100,20);
            
            cad.setBounds(50,520,130,30);
            limp.setBounds(320,520,120,30);
            fech.setBounds(600,520,120,30);
            add.setBounds(630,100,140,30);
            
            
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
            add.setBounds(560,20,200,300);
           

        } else {
            JOptionPane.showMessageDialog(null, "Você selecionou nenhum diretorio.");
        }
}    });
        
            
            cad.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    int num1, num2, soma, num3, num4, soma2, num5, num6, soma3,num7, num8, soma4;
                    soma=0; soma2=0; soma3=0;
                    //VALOR A VISTA
                num1=Integer.parseInt(vlcusto.getText());
                num2=Integer.parseInt(vlmv.getText());
                soma=num1+num2;
                    //VALOR A PRAZO
                num3=Integer.parseInt(vlcusto.getText());
                num4=Integer.parseInt(vlmp.getText());
                soma2=num3+num4;
                    //VALOR NO ATACADO
                num5=Integer.parseInt(vlcusto.getText());
                num6=Integer.parseInt(vlma.getText());
                soma3=num5+num6;
                //VALOR TOTAL DE PRODUTORS CADASTRADO
                num7=Integer.parseInt(quantp.getText());
                num8=Integer.parseInt(vlcusto.getText());
                soma4=num7*num8;
                
                    
                 JOptionPane.showMessageDialog(null,"O Produto Foi Cadastrado !! \n\n" + 
                    
                         "Nome do Produto:  " + nomep.getText() + 
                         "\nCódigo do Produto:  " + codp.getText() +
                         "\nCódigo de Barras:  " + cbarra.getText() + 
                         "\nNome do Forncedor:  " + nomef.getText() + 
                         "\nQuantidade:  " + quantp.getText() + 
                         "\nDescrição do Produto:  " + descp.getText() + 
                         "\nMarca do Produto:  " + marcap.getText() + 
                         "\nCategoria:  " + categ.getText() + 
                         "\nData de Registro:  " + data.getText() + 
                         "\nValor á Vista:  " + soma +  
                         "\nValor á Prazo:  " + soma2 + 
                         "\nValor no Atacado:  " + soma3 + 
                         "\nValor Total de Produtos Cadastrado:  " + soma4
                         ); 
                        
                 
                  
                }
            }
            );
            
            
            limp.addActionListener(
            new ActionListener() {
        	public void actionPerformed(ActionEvent e){
        	nomep.setText(null);
        	codep.setText(null);
                codeb.setText(null);
                nomef.setText(null);
                quantp.setText(null);
                descp.setText(null);
                marcap.setText(null);
                categ.setText(null);
                data.setText(null);
                vlcusto.setText(null);
                vlmv.setText(null);
                vlmp.setText(null);
                vlma.setText(null);
                
        	codep.requestFocus();
        				
        	}
       	}
      );
            
        fech.addActionListener(
        new ActionListener() {
        public void actionPerformed(ActionEvent e){
        	setVisible(false);
        	}
       	}
      );
         
            
         
         tela.add(rotulo); 
         tela.add(codprod);  
         tela.add(codbarra);  
         tela.add(quantprod);  
         tela.add(nomeprod);  
         tela.add(descprod);  
         tela.add(marcaprod);  
         tela.add(catego); 
         tela.add(nomeforn);
         tela.add(dataprod);
         tela.add(valorcus);
         tela.add(valormv);  
         tela.add(valormp);  
         tela.add(valorma);
         tela.add(codep);
         tela.add(codeb);
         tela.add(quantp);
         tela.add(nomep);
         tela.add(descp);
         tela.add(marcap);
         tela.add(categ);
         tela.add(nomef);
         tela.add(data);
         tela.add(vlcusto);
         tela.add(vlmv);
         tela.add(vlmp);
         tela.add(vlma);
         tela.add(cad);
         tela.add(limp);
         tela.add(fech);   
         tela.add(add); 
        
         
         JDesktopPane desk = new JDesktopPane(){
          Image im = (new ImageIcon("mm.png")).getImage(); 
          public void paintComponent(Graphics g){        
           g.drawImage(im,0,0,this);            }
                                      };
        tela.add(desk);
        JLabel status = new JLabel();
            status.setBorder(BorderFactory.createLineBorder(Color.WHITE));
            status.setBounds(1, 1, 800, 590);
            status.setIcon(new ImageIcon("mm.png"));
            tela.add(status);
         
         setUndecorated(true);
          setVisible(true);
        setSize(800,600);
        setLocationRelativeTo(null);
    }
}

    

