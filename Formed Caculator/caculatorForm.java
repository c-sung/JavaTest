import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class caculatorForm
{
	static JFrame fr;
	static TextField a = new TextField();
	static TextField b = new TextField();
	static TextField c = new TextField();
	static float h,j;	
	public static void main(String[] args)
	{
		fr = new JFrame();
		fr.setSize(300,200);
		fr.setLayout(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Button addi = new Button("+");
		Button subs = new Button("-");
		Button mult = new Button("x");
		Button divi = new Button("/");
		addi.setBounds(20,120,50,30);	
		subs.setBounds(80,120,50,30);
		mult.setBounds(140,120,50,30);
		divi.setBounds(200,120,50,30);
		addi.addActionListener(new addition());
		subs.addActionListener(new substration());
		mult.addActionListener(new multi());
		divi.addActionListener(new division());
		a.setBounds(20,20,250,20);
		b.setBounds(20,50,250,20);
		c.setBounds(20,80,250,20);
		c.setEditable(false);
		fr.add(addi);
		fr.add(a);
		fr.add(b);
		fr.add(c);
		fr.add(subs);
		fr.add(mult);
		fr.add(divi);
		fr.setVisible(true);
	}
	
	static class addition implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{			
			h=Float.parseFloat(a.getText());
			j=Float.parseFloat(b.getText());
			c.setText(String.valueOf(h+j));
		}
	}
	
	static class substration implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			h=Float.parseFloat(a.getText());
			j=Float.parseFloat(b.getText());
			c.setText(String.valueOf(h-j));
		}
	}
	
	static class multi implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			h=Float.parseFloat(a.getText());
			j=Float.parseFloat(b.getText());
			c.setText(String.valueOf(h*j));
		}
	}
	
	static class division implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			h=Float.parseFloat(a.getText());
			j=Float.parseFloat(b.getText());
			c.setText(String.valueOf(h/j));
		}
	}
}