import java.util.*;

public class jpr_2_in_4{

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;

		System.out.print("enter the a = ");
		a=sc.nextInt();

		System.out.print("enter the b = ");
		b=sc.nextInt();

		System.out.print("enter the c = ");
		c=sc.nextInt();

		a*=a;
		b*=b;
		c*=c;

		if(a+b==c||a+c==b||b+c==a)
		{
			System.out.println();
			System.out.println("Pythagorean triplet ");
		}
		else
		{
			System.out.println();
			System.out.println("Pythagorean triplet not ");
		}




	}
}