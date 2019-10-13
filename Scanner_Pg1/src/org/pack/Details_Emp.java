package org.pack;

import java.util.Scanner;

public class Details_Emp {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);

	System.out.println("empid is : ");
	int empid=Integer.parseInt(sc.nextLine());
	
	System.out.println("empName is : ");
	String empname=sc.nextLine();
	System.out.println("empid is : "+empid);
	System.out.println("empname is : "+empname);
	
	
	//String empname=sc.nextLine();
	//System.out.println("mobilenumber");
	
	//int empid=sc.nextInt();
	//String empname=sc.nextLine();
	//long mobilenumber=sc.nextLong();
	
	//System.out.println("empid is"+empid);
	//System.out.println("empname is"+empname);
	//System.out.println("mobilenumber:"+mobilenumber);
}
}
