import java.util.*;

public class jpr_2_in_1{

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);

		bank obj1=new bank();

		obj1.assigninitialvalues();
		obj1.depositamount();
		obj1.withdraw();
		obj1.display();


	}
}

class bank
{
	Scanner sc=new Scanner(System.in);

	String name;
	int accountnumber;
	String typeofaccount;
	int amountintheaccount;

	void assigninitialvalues()
	{
		System.out.print("enter the name = ");
		name=sc.next();

		System.out.print("enter the Accountnumber = ");
		accountnumber=sc.nextInt();

		System.out.print("enter the Typeofaccount = ");
		typeofaccount=sc.next();

		System.out.print("enetr the amountintheaccount = ");
		amountintheaccount=sc.nextInt();

		System.out.println("---------------------------------------");
	}

	void depositamount()
	{
		System.out.print("enter the depositamount = ");
		int deposit=sc.nextInt();

		System.out.println("---------------------------------------");

		amountintheaccount +=deposit;

		System.out.println("---------------------------------------");
	}

	void withdraw()
	{
		System.out.println("balance = "+amountintheaccount);

		System.out.println("---------------------------------------");

		int withdraw=0;
		System.out.print("withdraw = ");
		withdraw=sc.nextInt();

		System.out.println("---------------------------------------");

		if(withdraw<amountintheaccount)
		{
			amountintheaccount -=withdraw;

			System.out.println("balance = "+amountintheaccount);

			System.out.println("---------------------------------------");
		}
		else
		{
			System.out.println("no withdraw is withdraw is more than amountintheaccount ");
		}
	}

	void display()
	{
		System.out.println("---------------------------------------");
		System.out.println("name = "+name);
		System.out.println("accountnumber = "+accountnumber);
		System.out.println("Typeofaccount = "+typeofaccount);
		System.out.println("amountintheaccount = "+amountintheaccount);

	}



}