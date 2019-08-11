// my name is devesh
// hseved si eman ym


package pkg01;

import java.util.Scanner;

public class StringHndlh3 
{

	public static void main(String[] args) 
	{
		{
			
			System.out.println("Entre any String:  ");
			
			String s1,s2="";
			Scanner s= new Scanner(System.in);
			s1=s.nextLine();
			
			int leng=s1.length();
			for(int i=leng-1;i>=0; i-- )// 
				{
				s2=s2+s1.charAt(i);
				}
				System.out.println("Reverse is: "+s2);
		}
		
		
	
	}
}
