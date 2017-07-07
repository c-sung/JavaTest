import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class FTC
{

	static JFrame fr = new JFrame("Formed Triangle Caculator");
	static TextField a = new TextField();
	static TextField b = new TextField();
	static TextField c = new TextField();
	static JLabel lb1 = new JLabel();
	static JLabel lb2 = new JLabel("side1");
	static JLabel lb3 = new JLabel("side2");
	static JLabel lb4 = new JLabel("side3");	
	static Button GO = new Button("GO!");
	public static void main(String[] args)
	{
		fr.setSize(620,250);
		fr.setLayout(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setBounds(15,60,180,20);
		b.setBounds(210,60,180,20);
		c.setBounds(405,60,180,20);
		lb2.setBounds(15,20,180,20);
		lb3.setBounds(210,20,180,20);
		lb4.setBounds(405,20,180,20);
		lb1.setBounds(15,100,600,50);		
		GO.setBounds(15,130,80,50);		
		fr.add(a);
		fr.add(b);
		fr.add(c);
		fr.add(lb4);
		fr.add(lb2);
		fr.add(lb3);
		fr.add(lb1);		
		fr.add(GO);
		GO.addActionListener(new GOO());
		
		fr.setVisible(true);
	}
	
	static class GOO implements ActionListener
	{
		public void actionPerformed(ActionEvent e){
		double aa,bb,cc,dd,s;
		aa=Double.parseDouble(a.getText());
		bb=Double.parseDouble(b.getText());
		cc=Double.parseDouble(c.getText());
		if(aa+bb>cc && aa+cc>bb && bb+cc>aa){
		s=(aa+bb+cc)/2;
		dd=Math.sqrt(((s*(s-aa)*(s-bb)*(s-cc))));
		lb1.setText("AREA: \t" + dd);
		}
		else{
			lb1.setText("please check again if the value you've entered could be a triangle.");
		}
		}
	}
	
}