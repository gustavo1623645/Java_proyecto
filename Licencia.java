import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;


public class Licencia extends JFrame implements ChangeListener, ActionListener{
  private JLabel label1, label2;    
  private JCheckBox check1;
  private JTextArea area1;
  private JScrollPane scroll1;
  private JButton boton1, boton2;
 String nombre="";

public Licencia(){
   setLayout(null);
   setTitle("Licencia de uso");
   setIconImage(new ImageIcon(getClass().getResource("images/icon.jpg")).getImage());
//para visitar otra clase y recuperar algun valor de una variable se usa....//   
   Bienvenida accesoBienvenida =new Bienvenida();
   nombre=accesoBienvenida.texto1;
   label1=new JLabel("TERMINOS Y CONDICIONES");
   label1.setBounds(215,5,200,30);
   label1.setFont(new Font("Andale Mono", 1, 14));
   label1.setForeground(new Color(0,0,0));
  add(label1);

  area1=new JTextArea();
  area1.setEditable(false);
  area1.setFont(new Font("Andale Mono" , 0, 9));
  area1.setText("\n\n          Terminos y condiciones"+
                      "\n\n          A.  PROHIBIDA SU VENTA O DISTRIBUCION SIN AUTORIZACION DE GUSTAVO."+
                      "\n          B, PROHIBIDA LA ALTERACION DEL CODIGO FUENTE O DISEÑO DE LAS INTERFACES GRAFICAS."+
                      "\n\n          C. GUSTAVO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE."+
                      "\n\n          LOS AUERDOS LEGALES EXPUESTOS ACONTNUACION RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE"+
                       "\n           (GUSTAVO Y EL AUTOR) NO SE RESPONSABILIZAN DEL USO QUE USTED "+
                       "\n           HAGA CON ESTE SOFTWARE Y SUS SERVICIOS, PARA HACEPTASR ESTOS TERMINOS HAGA CLICK DN (ACEPTAR)"+
                       "\n           SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLICK EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE."+
                        "\n\n          PARA MAYOR INFORMACION SOBRE NUESTOS PRODUCTOS O SERVICIOS, POR FAVOR VISITE"+
                        "\n           http://www.youtube.com");
  scroll1=new JScrollPane(area1);
  scroll1.setBounds(10,40,575,200);
  add(scroll1);

   check1=new JCheckBox("Yo "+nombre+" Acepto ");
   check1.setBounds(10,250,300,30);
  check1.addChangeListener(this);
  add(check1);

  boton1=new JButton("Continuar");
  boton1.setBounds(10,290,100,30);
  boton1.setEnabled(false);
  boton1.addActionListener(this);
  add(boton1);

 
  boton2=new JButton("No acepto");
  boton2.setBounds(120,290,100,30);
  boton2.setEnabled(true);
  boton2.addActionListener(this);
  add(boton2);
 
  ImageIcon imagen=new ImageIcon("hhhhhhhhhhhhhh");
  label2=new JLabel(imagen);
  label2.setBounds(3158,135,300,300);
 add(label2); 
}


   public void stateChanged(ChangeEvent e){
   if(check1.isSelected()){
   boton1.setEnabled(true);
   boton2.setEnabled(false);
    
  } else{
     boton1.setEnabled(false);
     boton2.setEnabled(true);
   }
}
   public void actionPerformed(ActionEvent e){ 
  if(e.getSource()==boton1){
     Principal ventanaPrincipal=new Principal();
     ventanaPrincipal.setBounds(0,0, 640,535);
     ventanaPrincipal.setVisible(true);
     ventanaPrincipal.setResizable(false);
     ventanaPrincipal.setLocationRelativeTo(null); 
    this.setVisible(false);
}
 if(e.getSource()==boton2){
  Bienvenida bienvenido=new Bienvenida(); 
   bienvenido.setBounds(0,0,350,450);
   bienvenido.setVisible(true);
   bienvenido.setResizable(false);
   bienvenido.setLocationRelativeTo(null); 
   this.setVisible(false);
 }
}
 public static void main (String args[]){
   Licencia licencia1=new Licencia();
   licencia1.setBounds(0,0,600,360);
   licencia1.setVisible(true);
   licencia1.setResizable(false);
   licencia1.setLocationRelativeTo(null);
 }
}