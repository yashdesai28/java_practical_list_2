import java.util.*;

	
public class bank{

 public static int n=0;


	public static void main(String[]args)
	{	
		
		System.out.println("hello yash");

		Scanner sc=new Scanner(System.in);

		//arry ni size mate ayathi bank class ma mokal vani 
		int size;
		

		System.out.print("enter the user arry size = ");
		size=sc.nextInt();

		n=size;

		process b1=new process(size);
		b1.input();
		int ch;
		do{
			System.out.println("PRESS 1 | WITHDRAW ");
			System.out.println("PRESS 2 | DIPOSIT ");
			System.out.println("PRESS 3 | TRANSFAR MONAY ");
			System.out.println("PRESS 4 | DISPLAY ");
			System.out.println("PRESS 5 | FORGET PIN");
			System.out.println("PRESS 6 | CHANG DETAILS ");
			System.out.println("PRESS 7 | SARCH DETAILS ");
			System.out.println("PRESS 8 | EXIT ");


			
			System.out.print("ENETR THE CHOIS = ");
			ch=sc.nextInt();

			switch(ch)
			{
					
		
					case 1:
						b1.withdraw();
					break;

					case 2:
						b1.diposit();
					break;

					case 3:
						b1.transfarmonay();
					break;
	
					case 4:
						b1.display();
					break;

					case 5:

						long faco,fpho,fpin;

						System.out.print("ENETR THE ACCOUNTNUMBER = ");
						faco=sc.nextLong();


						System.out.print(" ENTER PHONE NUMBER = ");
						fpho=sc.nextLong();

						System.out.print("ENETR THE  new PIN NUMBER = ");
						fpin=sc.nextLong();

						
						b1.forfet(faco,fpho,fpin);

						break;


					case 6:
						
						int ch1;

						do{
							System.out.println("____________________________");

								System.out.println("PRESS 1 |EDIT NAME");
								System.out.println("PRESS 2 |EDIT PIN");
								System.out.println("PRESS 3 |EDIT ACCOUNT TYPE");
								System.out.println("PRESS 4 |ALL 3 DITAILS CHANGS ");
								System.out.println("PRESS 5 | EXIT ");


								System.out.print("ENETR THE CHOIS = ");
								ch1=sc.nextInt();

		
								switch(ch1)
								{
									case 1:
										long acpin;
										System.out.print("ENETR THE ACpin = ");
										acpin=sc.nextLong();

										long accountnumber;
										System.out.print("ENETR THE ACCOUNTNUMBER = ");
										accountnumber=sc.nextLong();

										String name;
										System.out.print("ENETR THE NAME = ");
										name=sc.next();

										b1.edit(accountnumber,acpin,name);
		
										break;

									case 2:

										long acpin1;
										System.out.print("ENETR THE  OLD ACPIN = ");
										acpin1=sc.nextLong();

										long accountnumber1;
										System.out.print("ENETR THE ACCOUNTNUMBER = ");
										accountnumber1=sc.nextLong();

										long pin1;
										System.out.print("ENETR THE new pin = ");
										pin1=sc.nextLong();

										b1.edit1(accountnumber1,acpin1,pin1);
		
										break;
		
									case 3:

										long acpin2;
										System.out.print("ENETR THE ACpin = ");
										acpin2=sc.nextLong();

										long accountnumber2;
										System.out.print("ENETR THE ACCOUNTNUMBER = ");
										accountnumber2=sc.nextLong();

										String typeaccount2;
										System.out.print("ENETR THE ACCOUNT TYPE = ");
										typeaccount2=sc.next();

										b1.edit2(accountnumber2,acpin2,typeaccount2);
		
										break;

									case 4:

										long acpin3;
										System.out.print("ENETR THE ACpin = ");
										acpin3=sc.nextLong();

										long accountnumber3;
										System.out.print("ENETR THE ACCOUNTNUMBER = ");
										accountnumber3=sc.nextLong();

										String name3;
										System.out.print("ENETR THE NAME = ");
										name3=sc.next();


										long pin3;
										System.out.print("ENETR THE new pin = ");
										pin3=sc.nextLong();


										String typeaccount3;
										System.out.print("ENETR THE ACCOUNT TYPE = ");
										typeaccount3=sc.next();

										b1.edit3(accountnumber3,acpin3,name3,pin3,typeaccount3);

										break;

										default:
								}

							}while(ch1!=5);			

					case 7:

						int ch2;

						do{
							System.out.println("____________________________");

								System.out.println("PRESS 1 |SARCH NAME");
								System.out.println("PRESS 2 |SARCH ACCOUNT NUMBER");
								System.out.println("PRESS 3 |SARCH TYPE OF ACCOUNT");
								System.out.println("PRESS 4 |SARCH phonenumber");
								System.out.println("PRESS 5 | EXIT ");


								System.out.print("ENETR THE CHOIS = ");
								ch2=sc.nextInt();

		
								switch(ch2)
								{
									case 1:
										
										String sarchname;
										System.out.print("ENETR THE NAME = ");
										sarchname=sc.next();

										b1.sarchname(sarchname);


										break;

									case 2:

										long sarchacountnumber;
										System.out.println("ENTER THE ACCOUNT NUMBER = ");
										sarchacountnumber=sc.nextLong();

										b1.sarchnumber(sarchacountnumber);

										break;
		
									case 3:
									
										String acounttype;
										System.out.println("ENTER THE ACCOUNT TYPE ");
										acounttype=sc.next();

										b1.sarchtype(acounttype);
										
		
										break;

									case 4:

										long sarchphonenumber;
										System.out.println("ENTER THE ACCOUNT NUMBER = ");
										sarchphonenumber=sc.nextLong();

										b1.sarchpho(sarchphonenumber);
										


										break;


										default:
							    }

					}while(ch2!=5);


					break;

					default:

			}
		}while(ch!=8);
		
		


	}
}

 class bank1 extends bank
{
	Scanner sc=new Scanner(System.in);

	public int n1;
	 
	public String[] name=new String[n];
	public long[] accountnumber=new long[n];
	public long[] pin=new long[n];
	public String[] typeaccount=new String[n];
	public float[] amountaccount=new float[n];
	public long[] phonenumber=new long[n];
	
	 bank1(int n)
	{
		 n1=n;
	}

	void input()
	{
		int atometic=1001;
		for (int i=0;i<n1;i++)
		{
			System.out.print("ENTER THE NAME = ");
			name[i]=sc.next();

			accountnumber[i]=atometic;
			atometic++;
			System.out.println("ENETR THE ACCOUNTNUMBER = "+accountnumber[i]);

			System.out.print("ENETR THE PIN NUMBER = ");
			pin[i]=sc.nextLong();

			System.out.print("ENETR THE ACCOUNT TYPE = ");
			typeaccount[i]=sc.next();

			System.out.print("ENTER THE AMOUNT ENTER THE ACCOUNT = ");
			amountaccount[i]=sc.nextFloat();

			System.out.print(" ENTER PHONE NUMBER = ");
			phonenumber[i]=sc.nextLong();


			System.out.println("____________________________");
		}
	}

	void forfet(long faco,long fpho,long fpin)
	{
		for(int i=0;i<n1;i++)
		{
			if(accountnumber[i]==faco&&phonenumber[i]==fpho)
			{
				pin[i]=fpin;
			}
		}
	}

	void edit(long acnumber,long acpin,String name4)
	{
		for (int i=0;i<n1;i++)
		{
			
			if(accountnumber[i]==acnumber&&pin[i]==acpin)
			{
				System.out.println(name4);
				name[i]=name4;
				
			}
		}
	}

	void edit1(long acnumber1,long acpin1,long pin1)
	{
		for (int i=0;i<n1;i++)
		{
			if(accountnumber[i]==acnumber1&&pin[i]==acpin1)
			{
				pin[i]=pin1;
			}
		}
	}

	void edit2(long acnumber2,long acpin2,String typac2)
	{
		for (int i=0;i<n1;i++)
		{
			if(accountnumber[i]==acnumber2&&pin[i]==acpin2)
			{
				typeaccount[i]=typac2;
			}
		}
	}

	void edit3(long acnumber3,long acpin3,String name3,long pin3,String typac3)
	{
		for (int i=0;i<n1;i++)
		{
			if(accountnumber[i]==acnumber3&&pin[i]==acpin3)
			{
				name[i]=name3;
				pin[i]=pin3;
				typeaccount[i]=typac3;
			}
		}
	}


	void sarchname(String sname)
	{
		for(int i=0;i<=n1;i++)
		{
			if (name[i].equals(sname)) 
			{

				System.out.println("NAME = "+name[i]);
			
				System.out.println(" ACCOUNTNUMBER = "+accountnumber[i]);
			
				System.out.println(" PIN = "+pin[i]);

				System.out.println(" ACCOUNT TYPE = "+typeaccount[i]);
			
				System.out.println(" ENTER THE ACCOUNT = "+amountaccount[i]);

				System.out.println("____________________________");
				System.out.println();
			}
		}
	}

	void sarchnumber(long snumber)
	{
		for(int i=0;i<=n1;i++)
		{
			if (accountnumber[i]==snumber) 
			{

				System.out.println("NAME = "+name[i]);
			
				System.out.println(" ACCOUNTNUMBER = "+accountnumber[i]);
			
				System.out.println(" PIN = "+pin[i]);

				System.out.println(" ACCOUNT TYPE = "+typeaccount[i]);
			
				System.out.println(" ENTER THE ACCOUNT = "+amountaccount[i]);

				System.out.println("____________________________");
				System.out.println();
			}
		}
	}


	void sarchtype(String stype)
	{
		for(int i=0;i<=n1;i++)
		{
			if (typeaccount[i].equals(stype)) 
			{

				System.out.println("NAME = "+name[i]);
			
				System.out.println(" ACCOUNTNUMBER = "+accountnumber[i]);
			
				System.out.println(" PIN = "+pin[i]);

				System.out.println(" ACCOUNT TYPE = "+typeaccount[i]);
			
				System.out.println(" ENTER THE ACCOUNT = "+amountaccount[i]);

				System.out.println("____________________________");
				System.out.println();
			}
		}
	}


	void sarchpho(long pnumber)
	{
		for(int i=0;i<=n1;i++)
		{
			if (phonenumber[i]==pnumber) 
			{

				System.out.println("NAME = "+name[i]);
			
				System.out.println(" ACCOUNTNUMBER = "+accountnumber[i]);
			
				System.out.println(" PIN = "+pin[i]);

				System.out.println(" ACCOUNT TYPE = "+typeaccount[i]);
			
				System.out.println(" ENTER THE ACCOUNT = "+amountaccount[i]);

				System.out.println("____________________________");
				System.out.println();
			}
		}
	}



	void display()
	{


		for (int i=0;i<n1;i++)
		{
			System.out.println("NAME = "+name[i]);
			
			System.out.println(" ACCOUNTNUMBER = "+accountnumber[i]);
			
			System.out.println(" PIN = "+pin[i]);

			System.out.println(" ACCOUNT TYPE = "+typeaccount[i]);
			
			System.out.println(" ENTER THE ACCOUNT = "+amountaccount[i]);

			System.out.println("____________________________");
			System.out.println();
			
		}

		
	}
}


class process extends bank1
{
	int n2;

	 public process(int n)
	{
		super(n);
		n2=n;
		
	}

	void withdraw()
	{

		System.out.println("____________________________");

		System.out.println("*********************WITHDRAW*********************");

		float withdrw;
		long serachnumber,rightpin;
		int flag=0;

		System.out.print("ENTER THE WITHDRAW AMOUNT = ");
		withdrw=sc.nextFloat();

		System.out.print("ENETR THE  ACCOUNTNUMBER  = ");
		serachnumber=sc.nextLong();

		System.out.print("ENERT THE RIGHTPIN = ");
		rightpin=sc.nextLong();


		for (int i=0;i<n2;i++)
		{
			if(serachnumber==accountnumber[i]&&rightpin==pin[i])
			{
				flag=1;

				if(withdrw<amountaccount[i])
				{
					amountaccount[i]-=withdrw;
										
				}
				else
				{
					System.out.println("withdrw more then accountammount ");
				}
			}

		}


			if(flag==1)
			{
				System.out.println("TRANSFAR SUCCUSES");
			}
			else
			{
				System.out.println("TRANSFAR NOT SUCCUSES");
			}

	}

	void diposit()
	{

		System.out.println("____________________________");

		System.out.println("*********************DIPOSIT*********************");

		float diposit;
		long serachnumber,rightpin;
		int flag=0;

		System.out.print("ENETR THE DIPOSIT = ");
		diposit=sc.nextFloat();

		System.out.print("ENETR THE  ACCOUNTNUMBER  = ");
		serachnumber=sc.nextLong();

		System.out.print("ENETR THE  RIGHTPIN = ");
		rightpin=sc.nextLong();



		for (int i=0;i<n2;i++)
		{
			if(serachnumber==accountnumber[i]&&rightpin==pin[i])
			{
				flag=1;
				amountaccount[i]+=diposit;
				
			}
		}


			if(flag==1)
			{
				System.out.println("TRANSFAR SUCCUSES");
			}
			else
			{
				System.out.println("TRANSFAR NOT SUCCUSES");
			}

	}

	void transfarmonay()
	{

		System.out.println("____________________________");

		System.out.println("*********************TRANSFAR ONW ACCOUNT TO OTHER ACCOUNT*********************");

		    

		float monaytransfar;
		long serachnumber,tonumber,rightpin;

		System.out.print("enter the TRANSFAR AMOUNT = ");
		monaytransfar=sc.nextFloat();

		System.out.print("ENETR THE  ACCOUNTNUMBER  = ");
		serachnumber=sc.nextLong();


		System.out.print("ENETR THE  DIPOSIT ACCOUNTNUMBER  = ");
		tonumber=sc.nextLong();


		System.out.print("ENETR THE  RIGHTPIN = ");
		rightpin=sc.nextLong();



		for (int i=0;i<n2;i++)
		{
			if(serachnumber==accountnumber[i]&&rightpin==pin[i])
			{
				if(monaytransfar<amountaccount[i])
				{
					for (int j=0;j<n2;j++)
					{
						if(tonumber==accountnumber[j])
						{

						
							amountaccount[j]+=monaytransfar;
							amountaccount[i]-=monaytransfar;
						}

					}
				}
				else
				{
					System.out.println("TRANSFAR MONAY  MORE THEN ACCOUNT MONAY IS NOT TRANSFAR ");
				}
			}
			
		}
	}

}