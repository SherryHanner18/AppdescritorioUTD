package Parcial1;
import java.awt.*;
import javax.swing.*;
public class Borderexample 

{ 
	private JFrame f;
	private JButton bn,bs,bw,be,bc;
	
	public Borderexample() 
	{
		f=new JFrame("Border Layout");
		bn=new JButton("Button 1");
		bc=new JButton("Buttomn 2");
		bw=new JButton("Buttomn 3");
		bs=new JButton("Buttomn 4");
		be=new JButton("Buttomn 2");
		
	}
	
	public void LaunchFrame() 
	{
		f.add(bn,BorderLayout.NORTH);
		f.add(bs,BorderLayout.SOUTH);
		f.add(bw,BorderLayout.WEST);
		f.add(be,BorderLayout.EAST);
		f.add(bc,BorderLayout.CENTER);
		f.setSize(400,200);
		f.setVisible(true);
		
		//Que es el jframe: es un contenedor
	}
	
	public static void main(String args[])  
	{
		Borderexample guiWindow2= new Borderexample();
		guiWindow2.LaunchFrame();
		
	} 
	
	
	

}
