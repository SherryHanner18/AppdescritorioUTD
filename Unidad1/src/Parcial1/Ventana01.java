package Parcial1;
import java.awt.FlowLayout;
import javax.swing.JFrame;

public class Ventana01 extends JFrame
{
  public Ventana01()
  
  {
	 super("Titulo de ventana"); 
	 setSize(400,400);
	 setLayout(new FlowLayout());
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setVisible(true);
  }
  
  public static void main(String args[]) 
  {
	  Ventana01 ventana= new Ventana01();
  }
}
