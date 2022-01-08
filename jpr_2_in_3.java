import java.util.*;

public class jpr_2_in_3{

	static 	int wage=50;
	static	String[] name=new String[5];
	
	static	int[] hours=new int[5];
	static	int[] empsalary=new int[5];

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);

		

		for (int i=0;i<5;i++) 
		{

			System.out.print("enter the name = ");
			name[i]=sc.next();

			System.out.print("enter the hours = ");
			hours[i]=sc.nextInt();

			System.out.println();

			System.out.println("=======================");

		} 

		salarycount();
		display();

	}

	public  static void salarycount()
		{
			for (int i=0;i<5;i++)
			{
				
				if(60<hours[i])
				{
					empsalary[i]=wage*hours[i]*2;
				}
				else
				{
					empsalary[i]=wage*hours[i];
				}

			}

		}

	 public	static void display()
		{
			for (int i=0;i<5;i++) 
			{
				System.out.println();

			System.out.println("=======================");


				System.out.println("emp name = "+name[i]);
				System.out.println("empsalary = "+empsalary[i]);

				System.out.println();

			System.out.println("=======================");

				
			}
		}
}