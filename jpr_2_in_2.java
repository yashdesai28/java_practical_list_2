import java.util.*;
import java.lang.String;

class book{

	Scanner sc=new Scanner(System.in);
	String[] author=new String[0];
	String[] titel=new String[0];
	String[] publisher=new String[0];
	int[] cost=new int[0];
	int[] stock=new int[0];
	

	
	book(int n){

		author=new String[n];
		titel=new String[n];
		 publisher=new String[n];
		 cost=new int[n];
		 stock=new int[n];

	}
	
	
	void getdata(int n)
	{
		
		for (int i=0;i<n;i++)
		{

			System.out.print("enter the author name = ");
			author[i]=sc.next();
	
			System.out.print("enter the author titel = ");
			titel[i]=sc.next();
	
			System.out.print("enter the author publisher = ");
			publisher[i]=sc.next();
	
			System.out.print("enter the author cost = ");
			cost[i]=sc.nextInt();
	
			System.out.print("enter the author stock = ");
			stock[i]=sc.nextInt();

			System.out.println("------------------------------");
		}
		


	}

	void search(int n,String tit,String autor)
	{
		int totalcost;

		for (int i=0;i<n;i++) 
		{
			
			if(author[i].equals(autor)&&titel[i].equals(tit))
			{
				System.out.println("yes book is available ");
				System.out.print("enter the copis of requris = ");
 				int copis=sc.nextInt();

 				if(stock[i]>=copis)
 				{
 					System.out.println("yes total Number of copis available");

 					totalcost=copis*cost[i];

 					System.out.println("totalcost is = "+totalcost);
 				}
 				else
 				{
 					System.out.println("no Number of copis not available ");
 				}

			}
			else
			{
				System.out.println("no sorry  book is  not available ");
			}
		}
	}

	void putdata(int n)
	{

		for (int i=0;i<n;i++)
		{
				System.out.println("------------------------------");

				System.out.println(" author name = "+author[i]);
				System.out.println(" author titel = "+titel[i]);
				System.out.println(" author publisher = "+publisher[i]);
				System.out.println(" author cost = "+cost[i]);
				System.out.println(" author stock = "+stock[i]);

				System.out.println("------------------------------");
		}
	}	

}

public class jpr_2_in_2{

 	public static void main(String[]args){

 		Scanner sc=new Scanner(System.in);
 		
 		
 		System.out.print("enter the arry size of book = ");
 		int size=sc.nextInt();

 		System.out.println("------------------------------");
 		System.out.println();

		book obj1=new book(size);
 		
 		obj1.getdata(size);

 		System.out.print("enter the title for saerch = ");
 		String search=sc.next();

 		System.out.print("enter the author for saerch = ");
 		String author=sc.next();

 		

 		obj1.search(size,search,author);

 		//obj1.putdata(size);
 		


 	}
}



//class display{

// 	Scanner sc=new Scanner(System.in);
// 	book[] arry=new book[5];

// 	void input(book obj1){

// 		for (int i=0;i<2;i++) 
// 		{
// 			arry[i]=obj1;	
// 		}

		
// 	}

// 	void dis(book obj1)
// 	{
// 		for (int i=0;i<2;i++) 
// 		{
// 			arry[i].putdata();	
// 		}
// 	}
// }
