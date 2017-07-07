import java.util.Scanner;
public class caculator
{
	static char ch;
	static float b,c,g;
	static int a;
	public static void main(String[] arg)
	{			
		System.out.println("Please select the function you want to use and enter two numbers for caculating.");
		System.out.println("Addition:a" + "\n" + "Subtraction:s" + "\n" + "multiplication:m" + "\n" + "division:d");
		Scanner sc = new Scanner(System.in);
		ch=sc.next().charAt(0);
		a=(int)ch;
		b=sc.nextFloat();
		c=sc.nextFloat();
		switch (a){
			case 97:
				addition(b,c);
				break;
			
			case 115:
				substraction(b,c);
				break;
				
			case 109:
				multiplication(b,c);
				break;
			
			case 100:
				
				division(b,c);
				break; 
		}
		
	}
	
	public static void addition(float u,float h)
	{
		g=u+h;
		System.out.println(u + "+" + h + "=" + g);
	}
	
	public static void substraction(float y,float p)
	{		
		g=y-p;
		System.out.println(y + "-" + p + "=" + g);
	}
	
	public static void multiplication(float q,float w)
	{		
		g=q*w;
		System.out.println(q + "x" + w + "=" + g);
	}
	
	public static void division(float z,float x)
	{		
		g=z/x;
		System.out.println(z + "/" + x + "=" + g);
	}
	
}

