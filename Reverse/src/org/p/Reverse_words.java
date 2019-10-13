package org.p;

public class Reverse_words {
	public static void main(String[] args) {
		
	
	String s="Welcome god";
	System.out.println("original"+s);
	String output="";
	
	String[]sp=s.split(" ");
	
	for(String word:sp)
	{
		String reverse="";
	for(int i=word.length()-1;i>=0;i--)
	{
		reverse=reverse+word.charAt(i);
	}
	output=output+reverse+" ";
	}
	System.out.println("reverse a string is "+output);
}
}
