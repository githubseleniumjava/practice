package java_progams;

import java.util.Scanner;

public class If  
{
	static String name;
	static char c;
	static float age;
	static char m,f,M,F,l,p;
	static
	{
	System.out.println("Hey welcome");		
	}

	public static void main(String[] args)
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("\nname: "); 
		name=s.nextLine();
		System.out.println("gender: ");
		c=s.next().charAt(0);

		if(c=='M' || c=='m') 
		{
			System.out.println("age: ");
			age=s.nextFloat();
			meth .all();
		}
		else if(c=='F' || c=='f')
		{
			System.out.println("age: ");
			age=s.nextFloat();	
			meth .all();
	    }
		else
		{
		  System.out.println("Are you Transgender?");
	      char t=s.next().charAt(0);
			
			if(t=='y' || t=='Y')
			{
				System.out.println("age: ");
				age=s.nextFloat();
				meth .yes();
			}
			else if (t=='n' || t=='N')
			{
				for(l='a';l<='m'||l>='m'||l<='M'||l>='M'||l<='f'||l>='f'||l<='F'||l>='F';l++)
				//do
				//while(l<='m'||l>='m'||l<='M'||l>='M'||l<='f'||l>='f'||l<='F'||l>='F')
				{
				System.out.println("enter proper gender");
				l=s.next().charAt(0);
				
				if(l=='m'||l=='M')
				{
					System.out.println("age: ");
					age=s.nextFloat();
					meth.all();
					break;
				}
				else if(l=='f'||l=='F')
				{
					System.out.println("age: ");
					age=s.nextFloat();
					meth.all();
					break;
				}
			    else
				{}
				}
				//while(l<='m'||l>='m'||l<='M'||l>='M'||l<='f'||l>='f'||l<='F'||l>='F');
			}
			else
			{
				meth.no();
				System.exit(0);
			}
		}
		meth.exit();
		System.exit(0);
	}
}





