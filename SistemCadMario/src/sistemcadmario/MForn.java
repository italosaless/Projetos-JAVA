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

/**
 *
 * @author italo
 */
public class MForn extends JFrame{
    JLabel top,tipo,razao,nome,cnpj,representante,endereco,bairro,cidade,cep,email,fone,fax,nit,emite,aliquota,percent,internacional;
    JTextField ctipo,crazao,cnome,crepresentante,cendereco,cbairro,ccidade,cnum,cemail,cemite,caliquota;
    JButton cadastrar,cancelar, limp;
    MaskFormatter mascaracpf,mascaracep,mascarafone,mascarafax,mascaranit;
    JFormattedTextField ccnpj,ccep,cfone,cfax,cnit;
    ImageIcon icone1, icone2, icone3;
    
    public MForn(){
    super("Cadastro de fornecedor");
    Container tela = getContentPane();
    setLayout(null);
    
    top = new JLabel("Cadastro de fornecedor");
    tipo = new JLabel("Tipo do fornecedor: *");
    razao = new JLabel("Razão social: *");
    nome = new JLabel("Nome fantasia:");
    cnpj = new JLabel("CPF/CNPJ: *");
    representante = new JLabel("Representante:");
    endereco = new JLabel("Endereço: *");
    bairro = new JLabel("Bairro: *");
    cidade = new JLabel("Cidade: *");
    cep = new JLabel("CEP:");
    fone = new JLabel("Fone:");
    email = new JLabel("Email:");
    fax = new JLabel("Fax:");
    nit = new JLabel("NIT ou PIS/PASEP:");
    emite = new JLabel("Emite fatura?");
    aliquota = new JLabel("Aliquota de imposto:");
    percent = new JLabel("%");
    internacional = new JLabel("Internacional");
    
    ctipo = new JTextField();
    crazao = new JTextField();
    cnome = new JTextField();
    crepresentante = new JTextField();
    cendereco = new JTextField();
    cbairro = new JTextField();
    ccidade = new JTextField();
    cnum = new JTextField();
    cemail = new JTextField();
    cemite = new JTextField();
    caliquota = new JTextField();

    icone1 = new ImageIcon("ma.png");
    cadastrar  = new JButton ("Cadastrar",icone1);
    icone2 = new ImageIcon("bala.png");
    cancelar  = new JButton ("Fechar",icone2);
    icone3 = new ImageIcon("star.png");
    limp  = new JButton ("Limpar", icone3);
   
    
    try{
    mascaracpf = new MaskFormatter("###.###.###-##");
    mascaracep = new MaskFormatter("#####-###");
    mascarafone = new MaskFormatter("(##)#####-####");
    mascarafax = new MaskFormatter("(##)####-####");
    mascaranit = new MaskFormatter("#########-#");
    
    mascaracpf.setPlaceholderCharacter('_');
    mascaracep.setPlaceholderCharacter('_');
    mascarafone.setPlaceholderCharacter('_');
    mascarafax.setPlaceholderCharacter('_');
    mascaranit.setPlaceholderCharacter('_');
    }
    catch(ParseException excp){}
    
        
    ccnpj = new JFormattedTextField(mascaracpf);
    ccep = new JFormattedTextField(mascaracep);
    cfone = new JFormattedTextField(mascarafone);
    cfax = new JFormattedTextField(mascarafax);
    cnit = new JFormattedTextField(mascaranit);
    
    top.setForeground(Color.black);
    top.setFont(new Font("Arial",Font.BOLD,20));
    
    tipo.setForeground(Color.black);
    razao.setForeground(Color.black);
    nome.setForeground(Color.black);
    cnpj.setForeground(Color.black);
    representante.setForeground(Color.black);
    endereco.setForeground(Color.black);
    bairro.setForeground(Color.black);
    cidade.setForeground(Color.black);
    cep.setForeground(Color.black);
    fone.setForeground(Color.black);
    email.setForeground(Color.black);
    fax.setForeground(Color.black);
    nit.setForeground(Color.black);
    emite.setForeground(Color.black);
    aliquota.setForeground(Color.black);
    percent.setForeground(Color.black);
    internacional.setForeground(Color.black);
    cadastrar.setForeground(Color.black);
    cancelar.setForeground(Color.black);
    limp.setForeground(Color.black);
    
    
    
    
    
    top.setBounds(200,20,300,20);
    tipo.setBounds(70,60,200,20);
    razao.setBounds(100,90,200,20);
    nome.setBounds(95,120,200,20);
    cnpj.setBounds(110,150,200,20);
    representante.setBounds(90,180,200,20);
    endereco.setBounds(110,210,200,20);
    bairro.setBounds(130,240,200,20);
    cidade.setBounds(130,270,200,20);
    cep.setBounds(150,300,200,20);
    email.setBounds(140,330,200,20);
    fone.setBounds(145,360,200,20);
    fax.setBounds(155,390,200,20);
    nit.setBounds(80,420,200,20);
    emite.setBounds(100,450,200,20);
    aliquota.setBounds(470,450,200,20);
    percent.setBounds(660,450,100,20);
    internacional.setBounds(510,240,200,20);
    ctipo.setBounds(200,60,300,20);
    crazao.setBounds(200,90,500,20);
    cnome.setBounds(200,120,500,20);
    ccnpj.setBounds(200,150,200,20);
    crepresentante.setBounds(200,180,500,20);
    cendereco.setBounds(200,210,500,20);
    cbairro.setBounds(200,240,250,20);
    ccidade.setBounds(200,270,250,20);
    cnum.setBounds(460,240,40,20);
    ccep.setBounds(200,300,170,20);
    cemail.setBounds(200,330,200,20);
    cfone.setBounds(200,360,170,20);
    cfax.setBounds(200,390,170,20);
    cnit.setBounds(200,420,170,20);
    cemite.setBounds(200,450,130,20);
    caliquota.setBounds(600,450,50,20);
    cadastrar.setBounds(200,500,130,30);
    cancelar.setBounds(600,500,120,30);
    limp.setBounds(400,500,120,30);
    
    
            cadastrar.setBackground(Color.red);
            cadastrar.setBackground(new Color (255,255,255));
            
            cancelar.setBackground(Color.red);
            cancelar.setBackground(new Color (255,255,255));
            
            limp.setBackground(Color.red);
            limp.setBackground(new Color (255,255,255));
    
     cancelar.addActionListener(
        new ActionListener() {
        public void actionPerformed(ActionEvent e){
        	setVisible(false);
        	}
       	}
      );
    
    
    
    limp.addActionListener(
            new ActionListener() {
        	public void actionPerformed(ActionEvent e){
        	ccnpj.setText(null);
        	ccep.setText(null);
                cfone.setText(null);
                cfax.setText(null);
                cnit.setText(null);
                ctipo.setText(null);
                crazao.setText(null);
                crepresentante.setText(null);
                cendereco.setText(null);
                cbairro.setText(null);
                ccidade.setText(null);
                cnum.setText(null);
                cemail.setText(null);
                cemite.setText(null);
                caliquota.setText(null);
                cnome.setText(null);
                
        	ctipo.requestFocus();
        				
        	}
       	}
      );
    cadastrar.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,"O Fornecedor foi Cadastrado !!\n\n" + 
                        "Tipo do fornecedor: " + ctipo.getText() + 
                        "\nNome da empresa:  " + cnome.getText()  + 
                        "\nCNPJ: " + ccnpj.getText() + 
                        "\nNome do Fornecedor:  " + crepresentante.getText() + 
                        "\nCEP:  " + ccep.getText() + 
                        "\nEndereço:  " + cendereco.getText() + 
                        "\nBairro:  " + cbairro.getText() + 
                        "\nCidade:  " + ccidade.getText() + 
                        "\nEmail:  " + cemail.getText() + 
                        "\nTelefone:  " + cfone.getText() + 
                        "\nFAX:  " + cfax.getText() + 
                        "\nNIT ou PIS/PASEP:  " + cnit.getText() + 
                        "\nEmitir Fatura:  " + cemite.getText() + 
                        "\nAliquota de Imposto:  " + caliquota.getText() + "%" + 
                        "\nEmpresa Internacional:  " + cnum.getText());
                }
            }
            );
    
    
    
    
        
    tela.add(top);
    tela.add(tipo);
    tela.add(razao);
    tela.add(nome);
    tela.add(cnpj);
    tela.add(representante);
    tela.add(endereco);
    tela.add(bairro);
    tela.add(cidade);
    tela.add(cep);
    tela.add(email);
    tela.add(fone);
    tela.add(fax);
    tela.add(nit);
    tela.add(emite);
    tela.add(aliquota);
    tela.add(percent);
    tela.add(internacional);
    tela.add(ctipo);
    tela.add(crazao);
    tela.add(cnome);
    tela.add(ccnpj);
    tela.add(crepresentante);
    tela.add(cendereco);
    tela.add(cbairro);
    tela.add(ccidade);
    tela.add(cnum);
    tela.add(ccep);
    tela.add(cemail);
    tela.add(cfone);
    tela.add(cfax);
    tela.add(cnit);
    tela.add(cemite);
    tela.add(caliquota);
    tela.add(cadastrar);
    tela.add(cancelar);
    tela.add(limp);
   
    
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
    setSize(800,590);
    setLocationRelativeTo(null);
    
    }
    
}


