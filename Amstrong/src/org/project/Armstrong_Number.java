package org.project;

import java.util.Scanner;


public class Armstrong_Number {
	public static void check()
	{
		int n,a,i=0,j=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		a=n;
		while(a>0) {
		i=a%10;
		j=j+(i*i*i);
		a=a/10;

		}
		if(n==j)
		{
			System.out.println("amstrong");
		}
		else
		{
			System.out.println("not amstrong");
		}

	}
	
	public static void main(String[] args) {
		Armstrong_Number c=new Armstrong_Number();
		c.check();
	}
	
}
