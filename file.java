import java.util.*;
import java.io.*;

class file
{
	public static void main(String[]args)
	{
		Scanner open=new Scanner(System.in);
		System.out.println("yash hello ");

		try{

			//file banava mate and baneli 6e toh batava mate ke file baneli 6e 

			File f1=new File("yashdemo.txt");

			if(f1.createNewFile())
			{
				System.out.println("file create :- "+ f1.getName());
			}
			else
			{
				System.out.println("file already exits");
			}

			//file ni ander lakhva mate FileWriter namno class 6e File ma F capital Writer ma W capital

			 //FileWriter w1=new FileWriter("yashdemo.txt");
			// w1.write("hello yash may 1st demo file  and hasti hello 1st demo file\n");
			// // a close kari devanu file ni ander lakhi ne 
			// w1.close();

			//have file ne read karva mate  Scanner use thay Scanner ek class 6e Scanner ma S cpital

			// Scanner sc=new Scanner(f1);

			// // importtant ! hasNextLine 

			// while(sc.hasNextLine())
			// {
			// 	String s1=sc.nextLine();
			// 	System.out.println(s1);
			// }

			//sc.close();

			//have value overeading thay 6e toh eni mate BufferedWriter vapar 6e ama pan B,W cpital

			BufferedWriter out=new BufferedWriter(new FileWriter("yashdemo.txt",true));

			String[] arry=new String[10];

			for (int i=0;i<5;i++)
			{
				arry[i]=open.nextLine();
				out.write(arry[i]+"\n");
			}

			// out.close();
			Scanner sc1=new Scanner(f1);
			int add=0;
			while(sc1.hasNextLine())
			{
				int s=Integer.parseInt(sc1.nextLine());
				add+=s;

			}
			System.out.println("add= "+add);

			out.write("add = "+add);
			out.close();

			Scanner sc=new Scanner(f1);

			while(sc.hasNextLine())
			{
				String s1=sc.nextLine();
				System.out.println(s1);
			}

			sc.close();

			



		}
		catch(Exception e)
		{

		}

		finally
		{

		}

	}
}