import java.util.Scanner;
public class adder
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter two numbers to do the addition function."+"\n");
		float a,b;
		a=sc.nextFloat();
		b=sc.nextFloat();
		System.out.println(a+b);
	}
}