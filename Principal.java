import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{
  private JMenuBar mb;
  private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
  private JMenuItem miCalculo, miRojo, miNegro, miMorado, miElCreador, miSalir, miNuevo;
  private JLabel labelLogo, labelBienvenido, labelTitle, labelNombre,  labelAPaterno, labelAMaterno, 
                        labelDepartamento, labelAntiguedad, labelResultado, labelFooter;
   private JTextField txtNombreTrabajador, txtAPaternoTrabajador, txtAMaternoTrabajador;
  private JComboBox comboDepartamento, comboAntiguedad;
  private JScrollPane scrollpane1;
  private JTextArea textarea1;
  String nombreTrabajador1="1";

  public Principal(){
   setLayout(null); 
//creando el titulo y el icono de la interface***************************************//
   setTitle("Pantalla principal");

//colocamos el fondo de color rojo
   getContentPane().setBackground(new Color(255,0,0));
   setIconImage(new 	ImageIcon(getClass().getResource("images/icon.jpg")).getImage());
   Bienvenida accesoBienvenida=new Bienvenida();
   nombreTrabajador1=accesoBienvenida.texto1;

   //creando la barra de menus**************************************************//
   mb=new JMenuBar();
   mb.setBackground(new Color(255,0,0));
   setJMenuBar(mb);

   //creando las opciones de la barra*******************************************//
   menuOpciones=new JMenu("Opciones");
   menuOpciones.setBackground(new Color(255,0,0));
   menuOpciones.setFont (new Font("Andale Mono", 1,14));
   menuOpciones.setForeground(new Color(255,255,255));
   mb.add(menuOpciones);

 //creando la segunda opcion de la barra*********************************//
  menuCalcular=new JMenu("Calcular");
   menuCalcular.setBackground(new Color(255,0,0));
   menuCalcular.setFont (new Font("Andale Mono", 1,14));
   menuCalcular.setForeground(new Color(255,255,255));
   mb.add(menuCalcular);

  //creando la tercera opcion de la barra***********************************//
   menuAcercaDe=new JMenu("Opciones");
   menuAcercaDe.setBackground(new Color(255,0,0));
   menuAcercaDe.setFont (new Font("Andale Mono", 1,14));
   menuAcercaDe.setForeground(new Color(255,255,255));
   mb.add(menuAcercaDe);

   //creando la opcion color fondo para el menu Opciones**********************//
   menuColorFondo=new JMenu ("Color de fondo");
   menuColorFondo.setFont(new Font("Andale Mono",1, 14));
   menuColorFondo.setForeground(new Color(255,0,0));
   menuOpciones.add(menuColorFondo);   

   //agregando lel sub menu  calculo para la opcion calcular******************//
   miCalculo=new JMenuItem("vacaciones");
   miCalculo.setFont(new Font("Andale Mono", 1, 14));
   miCalculo.setForeground(new Color(255,0,0));
  miCalculo.addActionListener(this);
  menuCalcular.add(miCalculo);
  

  //creando el item "rojo" para el sub menu color de fondo******************//
   miRojo=new JMenuItem("Rojo");
   miRojo.setFont(new Font("Andale Mono", 1, 14));
   miRojo.setForeground(new Color(255,0 ,0));
  miRojo.addActionListener(this);
   menuColorFondo.add(miRojo);
   

   //crendo el item "negro" para el sub menu color de fondo***********//
   miNegro=new JMenuItem("Negro");
   miNegro.setFont(new Font("Andale Mono", 1, 14));
   miNegro.setForeground(new Color(255,0,0));
   miNegro.addActionListener(this);
   menuColorFondo.add(miNegro);
 

  //creando el item "morado" para el sub menu color de fondo***********// 
   miMorado=new JMenuItem("Morado");
   miMorado.setFont(new Font("Andale Mono", 1, 14));
   miMorado.setForeground(new Color(255,0,0));
   menuColorFondo.add(miMorado);
   miMorado.addActionListener(this);

   miNuevo=new JMenuItem("Nuevo");
   miNuevo.setFont(new Font("Andale Mono", 1, 14));
   miNuevo.setForeground(new Color(255,0,0));
   menuOpciones.add(miNuevo);
   miNuevo.addActionListener(this);

   miElCreador=new JMenuItem("El creador");
   miElCreador.setFont(new Font("Andale Mono", 1, 14));
   miElCreador.setForeground(new Color(255,0,0));
   menuAcercaDe.add(miElCreador);
   miElCreador.addActionListener(this);
  
   miSalir=new JMenuItem("Salir");
   miSalir.setFont(new Font("Andale Mono", 1, 14));
   miSalir.setForeground(new Color(255,0,0));
   menuOpciones.add(miSalir);
   miSalir.addActionListener(this);

  ImageIcon imagen=new ImageIcon("      ");
  labelLogo=new JLabel(imagen);
  labelLogo.setBounds(5,5,250,100);
  add(labelLogo);

  labelBienvenido=new JLabel("Bienvenido "+ nombreTrabajador1);
  labelBienvenido.setBounds(280,30,300,50);
  labelBienvenido.setFont(new Font("Andale Mono", 1, 32));
  labelBienvenido.setForeground(new Color(255,255,255));
  add(labelBienvenido);

  labelTitle=new JLabel("Datos del trabajador para el calculo evacaciones");
  labelTitle.setBounds(45,140,900,25);
  labelTitle.setFont(new Font("Andale Mono",1,24));
  labelTitle.setForeground(new Color(255,255,255));
  add(labelTitle);

   //creando label nombre y su textfield***************************//
   labelNombre=new JLabel("Nombre de usuario");
   labelNombre.setBounds(25,188,185,25);
   labelNombre.setFont(new Font("Andale Mono", 1, 12));
   labelNombre.setForeground(new Color(255,255,255));
   add(labelNombre);

   txtNombreTrabajador=new JTextField();
   txtNombreTrabajador.setBounds(25,213,150, 25);
   txtNombreTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
   txtNombreTrabajador.setForeground(new java.awt.Color(225,0,0));
   add(txtNombreTrabajador);

  //creando label apellido paterno y su textfield***************************//
   labelAPaterno=new JLabel("Apellido paterno");
   labelAPaterno.setBounds(25,248,180,25);
   labelAPaterno.setFont(new Font("Andale Mono", 1, 12));
   labelAPaterno.setForeground(new Color(255,255,255));
   add(labelAPaterno);

   txtAPaternoTrabajador=new JTextField();
   txtAPaternoTrabajador.setBounds(25,273,150,25);
   txtAPaternoTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
   txtAPaternoTrabajador.setForeground(new java.awt.Color(255,0,0));
   add(txtAPaternoTrabajador);

   //creando label apellido materno y su textfield***************************//
   labelAMaterno=new JLabel("Apellido Materno");
   labelAMaterno.setBounds(25,308,180,25);
   labelAMaterno.setFont(new Font("Andale Mono", 1, 12));
   labelAMaterno.setForeground(new Color(255,255,255));
   add(labelAMaterno);

   txtAMaternoTrabajador=new JTextField();
   txtAMaternoTrabajador.setBounds(25,334,150,25);
   txtAMaternoTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
   txtAMaternoTrabajador.setForeground(new java.awt.Color(255,0,0));
   add(txtAMaternoTrabajador);

   labelDepartamento=new JLabel("Departamento");
   labelDepartamento.setBounds(220,188,180,25);
   labelDepartamento.setFont(new Font("Andale Mono", 1, 14));
   labelDepartamento.setForeground(new Color(255,255,255));
   add(labelDepartamento);
   
  comboDepartamento=new JComboBox();
  comboDepartamento.setBounds(220,213,220,25);
  comboDepartamento.setBackground(new java.awt.Color(224,224,224));
  comboDepartamento.setFont(new java.awt.Font("Andale Mono", 1, 14));
  comboDepartamento.setForeground(new java.awt.Color(255,0,0));
  add(comboDepartamento);
  comboDepartamento.addItem("");
  comboDepartamento.addItem("Atencion al cliente");
  comboDepartamento.addItem("Departamento de logistica");
  comboDepartamento.addItem("Departamento de gerencia");

   labelAntiguedad=new JLabel("Antiguedad");
   labelAntiguedad.setBounds(220,248,180,25);
   labelAntiguedad.setFont(new Font("Andale Mlono", 1, 12));
   labelAntiguedad.setForeground(new Color(255,255,255));
   add(labelAntiguedad);
   
   comboAntiguedad=new JComboBox(); 

   comboAntiguedad.setBounds(220,273,220,25);
  comboAntiguedad.setBackground(new java.awt.Color (224,224,224));
  comboAntiguedad.setFont(new java.awt.Font("Andale Mono", 1, 14));
  comboAntiguedad.setForeground(new java.awt.Color(255,0,0));
  add(comboAntiguedad);
  comboAntiguedad.addItem("");
  comboAntiguedad.addItem("1");
  comboAntiguedad.addItem("2 a 6");
  comboAntiguedad.addItem("7 en adelante");
   

   labelResultado=new JLabel("Resultado");
   labelResultado.setBounds(220,307,180,25);
   labelResultado.setFont(new Font("Andale Mono", 1, 12 ));
   labelResultado.setForeground(new Color(255,255,255));
   add(labelResultado);

   textarea1=new JTextArea();
   textarea1.setEditable(false);
   textarea1.setBackground(new Color(224,224,224));
   textarea1.setFont(new Font("Andale Mono",1,11));
   textarea1.setForeground(new Color(255,0,0));
   textarea1.setText("\n   Aqui aparece el resultado del calculo de vacaciones");
   scrollpane1=new JScrollPane(textarea1);
   scrollpane1.setBounds(200,325,400,110);
   add(scrollpane1);

  
   labelFooter=new JLabel("2020 The Coca-cola Company | Todos los derechos reservados ");
   labelFooter.setBounds(135,445,500,30);
   labelFooter.setFont(new Font("Andale Mono", 1, 12));
   labelFooter.setForeground(new Color(255,255,255));
   add(labelFooter);
}

   public void actionPerformed(ActionEvent e){      //************************************************VACACIONES**********************************************************//
    if (e.getSource()==miCalculo){  
     //tenemos que crear variables donde se recupere y guarde lo que esta en el textfield y combobox//

    String nombreTrabajador=txtNombreTrabajador.getText();
    String AP=txtAPaternoTrabajador.getText();
    String AM= txtAMaternoTrabajador.getText();
    String Departamento= comboDepartamento.getSelectedItem().toString();
    String Antiguedad=comboAntiguedad.getSelectedItem().toString();

   if(nombreTrabajador.equals("") || AP.equals("") || AM.equals("") || Departamento.equals("") || Antiguedad.equals("")){
    JOptionPane.showMessageDialog(null, "Ingrese todos los datos");
   } else{
   if(Departamento.equals("Atencion al cliente")){
   if(Antiguedad.equals("1")){
    textarea1.setText("\nEl trabajador "+ nombreTrabajador + " "+AP + " " + AM + "\n del area de" + Departamento + " \n con " + Antiguedad +"año de antiguedad"+ "\nrecibe 6  dias de vacaciones");
 

}  
  if(Antiguedad.equals("2 a 6")){
    textarea1.setText("\nEl trabajador "+ nombreTrabajador + " "+AP + " " + AM + "\n del " + Departamento + "\n con " + Antiguedad +"año de antiguedad"+ "\nrecibe 14  dias de vacaciones"); 
}
 if(Antiguedad.equals("7 en adelante")){
    textarea1.setText("\nEl trabajador "+ nombreTrabajador + " "+AP + " " + AM + "\n del " + Departamento + "\n con " + Antiguedad +"año de antiguedad"+ "\nrecibe 20 dias de vacaciones"); 
}

}
//*********************************************************************SECCION AREA DE LOGISTICA*********************************************************************//
if(Departamento.equals("Departamento de logistica")){
   if(Antiguedad.equals("1")){
    textarea1.setText("\nEl trabajador "+ nombreTrabajador + " "+AP + " " + AM + "\n del " + Departamento + "\n con " + Antiguedad +"año de antiguedad"+ "\nrecibe 7 dias de vacaciones");
 

}  
  if(Antiguedad.equals("2 a 6")){
    textarea1.setText("\nEl trabajador "+ nombreTrabajador + " "+AP + " " + AM + "\n del " + Departamento + "\n con " + Antiguedad +"año de antiguedad"+ "\nrecibe 15  dias de vacaciones"); 
}
 if(Antiguedad.equals("7 en adelante")){
    textarea1.setText("\nEl trabajador "+ nombreTrabajador + " "+AP + " " + AM + "\n del " + Departamento + "\n con " + Antiguedad +"año de antiguedad"+ "\nrecibe 22 dias de vacaciones"); 
}

}
//*******************************SECCION DE GERENCIA****************************************************************************************************************//
if(Departamento.equals("Departamento de gerencia")){
   if(Antiguedad.equals("1")){
    textarea1.setText("\nEl trabajador "+ nombreTrabajador + " "+AP + " " + AM + "\n del " + Departamento + "\n con " + Antiguedad +"año de antiguedad"+ "\nrecibe  10 dias de vacaciones");
 

}  
  if(Antiguedad.equals("2 a 6")){
    textarea1.setText("\nEl trabajador "+ nombreTrabajador + " "+AP + " " + AM + "\n del " + Departamento + "\n  con " + Antiguedad +"año de antiguedad"+ "\nrecibe 20  dias de vacaciones"); 
}
 if(Antiguedad.equals("7 en adelante")){
    textarea1.setText("\nEl trabajador "+ nombreTrabajador + " "+AP + " " + AM + "\n del " + Departamento + "\n con " + Antiguedad +"año de antiguedad"+ "\nrecibe 30 dias de vacaciones"); 
}

}
}
   
    
        
 }

//**************************************************************************************************FIN SECCION VACACIONES/********************************************************//
    if (e.getSource()==miRojo){  
     getContentPane().setBackground(new Color(255,0,0));
   
   }

    if(e.getSource()==miNegro){
    getContentPane().setBackground(new Color(0,0,0));
     }
     if (e.getSource()==miMorado){  
   getContentPane().setBackground(new Color(51,0,51));
   }
   if (e.getSource()==miSalir){  
   Bienvenida bienvenido=new Bienvenida(); 
   bienvenido.setBounds(0,0,350,450);
   bienvenido.setVisible(true);
   bienvenido.setResizable(false);
   bienvenido.setLocationRelativeTo(null);
   this.setVisible(false);
   }
   if (e.getSource()==miElCreador){  
   JOptionPane.showMessageDialog(null,"creado por Gustavo");
  
   
   
  }
  if(e.getSource()==miNuevo){
        txtNombreTrabajador.setText("");
       txtAPaternoTrabajador.setText("");
      txtAMaternoTrabajador.setText("");
      comboDepartamento.setSelectedIndex(0);
     comboAntiguedad.setSelectedIndex(0);
     textarea1.setText("Aqui aparecera el resultado del calculo de vacaciones");	

      }
    }
         
  public static void main(String args[]){
   Principal ventanaPrincipal=new Principal();
   ventanaPrincipal.setBounds(0,0, 640,535);
   ventanaPrincipal.setVisible(true);
   ventanaPrincipal.setResizable(false);
   ventanaPrincipal.setLocationRelativeTo(null);

 }
}
