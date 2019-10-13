package org.pac;

public class School_Percentage extends Percentage {
	public void Social()
	{
		System.out.println("100%");
	}
	public void maths() 
	{
	System.out.println("90%");

	}
	public void mark()
	{
		System.out.println("datascience is 90");
	}
	public void details()
	{
		System.out.println("id is 1");
	}
	public static void main(String[] args) {
		School_Percentage s=new School_Percentage();
		s.Social();
		s.maths();
		s.details();
	
	}
}