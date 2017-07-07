import java.awt.*;
import javax.swing.*;
import java.awt.event.*; 
public class formtry
{
	static JFrame fr;
	public static void main(String[] args)
	{
		fr = new JFrame();
		fr.setSize(600,600);
		fr.setLayout(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
		Button btn = new Button("yellow");
		btn.setBounds(100,100,20,50);
		btn.addActionListener(new ActLis());		
		fr.add(btn);		
		fr.setVisible(true);
	}
	
	static class ActLis implements ActionListener 
	{
		public void actionPerformed(ActionEvent e){
		    System.out.println("action");
			fr.getContentPane().setBackground(Color.yellow);
		}
	}
	
}