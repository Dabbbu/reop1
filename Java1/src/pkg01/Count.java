package pkg01;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) 
	{
		int count=0;
		
		System.out.println("Entre the String");
		Scanner s1= new Scanner(System.in);
		String s2=s1.nextLine();
		
		System.out.println("Entre the character whose occurence need to check");
		Scanner s3= new Scanner(System.in);
		char ch = s3.next().charAt(0);
		
		for(int i=0; i<s2.length(); i++)
		{
			if(s2.charAt(i)== ch)
			
			{
				count++;
				
			}
			
			
			
		}
		
		
		System.out.println("Occurence of "+ch+ " is "+ count);

	}

}
