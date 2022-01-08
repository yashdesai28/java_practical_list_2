import java.util.*;


class toolbooth
{
	Scanner sc=new Scanner(System.in);


		int without,totalcash,carcount,nonopayingcount;

		void paying()
		{

			totalcash+=50;
			carcount+=1;

		}

		void nonopaying()
		{

			without+=1;
			carcount+=1;
			nonopayingcount+=1;

		}

		void displya()
		{
			System.out.println("non paying car total number = "+nonopayingcount);
			System.out.println("total number of PASSING car = "+carcount);
			System.out.println("total callction = "+totalcash);
		}


}

public class jpr_2_in_5
{

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);

		toolbooth tool=new toolbooth();

			int ch;
		
		do{

			System.out.println("PRSS 1 PASSING CAR paying ");
			System.out.println("PRSS 2 PASSING non paying car ");
			System.out.println("PRSS 3 total cash and displya all ");
			

			System.out.println();

			System.out.println("-----------------");

			System.out.println("ENTER THE CHOICE = ");
			ch=sc.nextInt();

			switch(ch)
			{

					case 1:

					tool.paying();

					break;

					case 2:

					tool.nonopaying();

					break;

					case 3:

					tool.displya();

					break;

			}



		}while(ch!=4);

	}
}