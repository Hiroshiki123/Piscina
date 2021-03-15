
package piscina18;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Piscina18 extends JFrame implements ActionListener{
    JLabel lblcomprimento, lbllargura, lblaltura, lblresultado;
    JTextField txtcomprimento, txtlargura,txtaltura,txtresultado;
    JButton btncalcular, btnlimpar;

    
    public static void main(String[] args) {
        JFrame janela = new Piscina18();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
    Piscina18(){
        setTitle("Area da Piscina");
        setBounds(300,50,500,300);
        getContentPane().setBackground(new Color(207, 198, 255));
        getContentPane().setLayout(new GridLayout(5,2));
        lblcomprimento = new JLabel("comprimento");
        lblcomprimento.setFont(new Font("04b",Font.BOLD, 18));
        lblcomprimento.setForeground(Color.black);
        lbllargura = new JLabel("largura");
        lbllargura.setFont(new Font("04b",Font.BOLD, 18));
        lbllargura.setForeground(Color.black);
        lblaltura = new JLabel("altura");
        lblaltura.setFont(new Font("04b",Font.BOLD, 18));
        lblaltura.setForeground(Color.black);
        lblresultado = new JLabel("resultado");
        lblresultado.setFont(new Font("04b",Font.BOLD, 18));
        lblresultado.setForeground(Color.black);
        
        btncalcular = new JButton("calcular");btncalcular.addActionListener(this);
        btncalcular.setFont(new Font("04b",Font.BOLD, 18));
        btnlimpar = new JButton("limpar");btnlimpar.addActionListener(this);
        btnlimpar.setFont(new Font("04b",Font.BOLD, 18));
        
        txtcomprimento = new JTextField();
        txtlargura = new JTextField();        
        txtaltura = new JTextField();
        txtresultado = new JTextField();
        txtresultado.setEditable(false);
        
        getContentPane().add(lblcomprimento);
        getContentPane().add(txtcomprimento);
        getContentPane().add(lbllargura);
        getContentPane().add(txtlargura);
        getContentPane().add(lblaltura);
        getContentPane().add(txtaltura);
        getContentPane().add(lblresultado);
        getContentPane().add(txtresultado);
        getContentPane().add(btncalcular);
        getContentPane().add(btnlimpar);
        
        
        
        
        
    }
    public void actionPerformed(ActionEvent e){
    if (e.getSource()==btnlimpar){
        txtcomprimento.setText("");
        txtlargura.setText("");
        txtaltura.setText("");
        txtresultado.setText("");
        return;
    }
    double largura=0,comprimento=0,altura=0,resultado=0;
    try{
        largura=Double.parseDouble(txtlargura.getText());
        comprimento=Double.parseDouble(txtcomprimento.getText());
        altura=Double.parseDouble(txtaltura.getText());
    }
    catch(NumberFormatException erro){
        txtresultado.setText("só números");
        return;
    }
    if(e.getSource()==btncalcular) resultado = (largura*altura*comprimento)*300;
    txtresultado.setText(""+resultado);
    
    }
}

