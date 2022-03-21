import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener{
private JTextField texto;
private JLabel label1, label2, label3, label4;
private JButton boton1;
public static String texto1="";//esta variable guardara el nombre del usuarui qjue se indroduzca en el textfiekd//


public Bienvenida(){
   setLayout(null);
   //agregar titulo******************************************************************//
   setTitle("Bienvenido");
   //agregar color de fondo de la interface************************************//
   getContentPane().setBackground(new Color(255,0,0));
  //agregar el icono junto al titulo***********************************************//  
 setIconImage(new ImageIcon(getClass().getResource("images/icon.jpg")).getImage());  
//**********************************************************************************// 
 //poner una imagen dentro de un labe*************************************l//
   ImageIcon imagen=new ImageIcon("images/logo.jpg");
   label1=new JLabel(imagen);
   label1.setBounds(25,15,300,150);
   add(label1);
//**********************************LABEL 2*****************************************//
   label2=new JLabel("Sistema de control vacacional");
   label2.setBounds(35,135,300,30);
//agregar una tipografia y tamaño etc***************************************//
   label2.setFont(new Font("Andale Mono", 3, 18)); 
   label2.setForeground(new Color(255,255,255));
   add(label2);
//**************************LABEL 3*****************************************//
   label3=new JLabel("Ingrese su nombre");
   label3.setBounds(45,212,200,30);
   label3.setFont(new Font("Andale Mono", 1, 12));  
//color del texto//////////////////////////////////////////////////////////////////////****//
   label3.setForeground(new Color(255,255,255));
   add(label3);
//*************************LABEL 4******************************************//
   label4=new JLabel("©2017 The Coca-cola Company");
   label4.setBounds(85,375,300,30);
   label4.setFont(new Font("Andale Mono", 1, 12));  
   label4.setForeground(new Color(255,255,255));
   add(label4);
//***********************************BOTON**********************************//
   boton1=new JButton("Ingresar");
   boton1.setBounds(125,280,100,30);
   boton1.setBackground(new Color(255,255,255));
   boton1.setFont(new Font ("Andale Mono", 1, 14));
   boton1.setForeground(new Color(255,0,0));
   boton1.addActionListener(this);
  add(boton1);
//**************************TEXT FIELD*******************************************//
   texto=new JTextField();
   texto.setBounds(45,240,255,25);
   texto.setBackground(new Color(255,255,255));
   texto.setFont(new Font("Andale Mono", 1 , 14));
   texto.setForeground(new Color (255,0,0));
  add(texto);
 }
  public void actionPerformed(ActionEvent e){
   if(e.getSource()==boton1){
   //el metodo getText()nos permite recuperar el texto que se ingreso en el textfield//
   //el metodo trim hace que si se ingresaron espacios los borre//    
    texto1=texto.getText().trim ();
   //el metodo equals sirve para ver lo que hay dentro de la variable//
    if(texto1.equals("")){
    //si encuantra que la variable esta vacia mostrara el mensaje //
     JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre");
   } else{
     Licencia licencia1=new Licencia();
     licencia1.setBounds(0,0,600,360);
     licencia1.setVisible(true);
     licencia1.setResizable(false);
     licencia1.setLocationRelativeTo(null);
      //cuando se abre la nueva interface Licencia aremos que la de bienvenida se oculte//
      this.setVisible(false);
      
    }
  }  

 }
public static void main (String args[]){
   Bienvenida bienvenido=new Bienvenida(); 
   bienvenido.setBounds(0,0,350,450);
   bienvenido.setVisible(true);
   bienvenido.setResizable(false);
   bienvenido.setLocationRelativeTo(null);
 }
}
