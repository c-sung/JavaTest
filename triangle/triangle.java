import java.util.Scanner;
import java.util.Arrays;
public class triangle
{
	static double[] a = {0,0,0};
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Please enter three values, depending three sides of the triangle.");
		a[0]=sc.nextDouble();
		a[1]=sc.nextDouble();
		a[2]=sc.nextDouble();
		Arrays.sort(a);		
		keisan(a[0],a[1],a[2]);
	}
	
	public static void keisan(double g,double h,double f)
	{		
		double s=(a[0]+a[1]+a[2])/2;
		double A=((s*(s-g)*(s-h)*(s-f)));
		System.out.println("Area:" + Math.sqrt(A) + "\n" + "sides: \t" + a[0] + "\t" + a[1] + "\t" + a[2]);
	}
}