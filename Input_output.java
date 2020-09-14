package java_progams;

import java.util.Scanner;
//import java.lang.Thread;


public class Input_output
{	
	double x,y,z;
	void div(float x,float y)
	{
		z=(double)x/y;
	}
}

class k extends Input_output
{
	double sub(int x,int y)
	{
		z=x-y;
		System.out.println("sub is: "+z);
		return z;
	}
	double mod()
	{
		z=x%y;
		//System.out.println("sub is: "+z);
		return z;
	}

	
	static 
	{
		System.out.println("main static");
		//System.exit(0);
	}
}

class cons extends k
{
	int x,y,z,l;
	cons(String name)
	{
		x=4;
		y=--x;
	}
	cons()
	{
		x=78;y=98;
	}
	int sum()
	{
		z=x+y;
		//System.out.println("add = "+z);
		return z;
	}
	void add(){
		System.out.println("pmthod");
	}
	
	                              
	               public static void main(String[] args)
	
	               {
	            	 conschild k=new conschild();
	                
	            	 k.sum();
	//System.out.println("sum is "+k.z);
	                 k.add();
	                 k.add(8);
	                 k.sub(8,9);
	
	                 Scanner s=new Scanner(System.in);
	                 
	                 System.out.println("enter 1 value: ");
	                 int m=s.nextInt();
	//s.nextInt();
	
	                 System.out.println("enter 2 value: ");
	                 int n=s.nextInt();
	//s.nextInt();
	
	                 double a=m+n;
	//double a=s.nextInt()+s.nextInt();
	                 System.out.println("addition is: "+a);
	
/*	try{
		sleep(int 500)
	//}catch();
	}catch(InterruptedException e);*/
	
	                 int b=m*n;
	                 System.out.println("multipliccation is: "+b);
	
	                 k p=new k();
	                
	                 p.div(90,80);
	                 System.out.println("div is: "+p.z);
	                 p.x=11;
	                 p.y=3;
	                 double l=p.mod();
	                 System.out.println(l);
	//k h=new k();
	//k.x=9;
	                 cons g=new cons("ijk");
	                 //cons g=new cons();
	                 l=g.sum();
	                 System.out.println("const is "+l);
	
	           }
}	
class  conschild extends cons
{
	void add(int i)
	{
		System.out.println("ovloading");
	}
	void add(){
		System.out.println("ovRiding");
	}
}