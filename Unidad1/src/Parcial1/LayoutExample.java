package Parcial1;
import java.awt.*;
import javax.swing.*;

public class LayoutExample 
{
  private JFrame f;
  private JButton b1;
  private JButton b2;
  private JButton b3;
  private JButton b4;
  private JButton b5;
  
  
  public LayoutExample() 
  {
	  f=new JFrame("GUI example");
	  b1=new JButton("Button 1");
	  b2=new JButton("Button 1");
	  b3=new JButton("Button 1");
	  b4=new JButton("Button 1");
	  b5=new JButton("Button 1"); 
	  
  }
  public void LaunchFrame() 
  {
	  f.setLayout(new FlowLayout());
	  f.add(b1);
	  f.add(b2);
	  f.add(b3);
	  f.add(b4);
	  f.add(b5);
	  f.pack();
	  f.setVisible(true);
	  
	  
  }
  
  public static void main(String args[]) 
  {
	  LayoutExample guiWindow= new LayoutExample();
	  guiWindow.LaunchFrame();
                                                                                                                                                                                                       }
}
