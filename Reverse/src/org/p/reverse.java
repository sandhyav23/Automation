package org.p;

public class reverse {
	public static void main(String[] args) {
		String input="Java code";
		System.out.println("original"+input);
		String output="";
		String[] words=input.split(" ");
		for(String word:words)
		{
			String revword="";
		
			for(int i=word.length()-1;i>=0;i--)
			{
				revword=revword+word.charAt(i);
		}
		output=output + revword+" ";
	}
System.out.println("Finall"+output);

}
}
