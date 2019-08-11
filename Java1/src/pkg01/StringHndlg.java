// String is Palindrome or not

package pkg01;

import java.util.Scanner;

public class StringHndlg {

	public static void main(String[] args) 
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
			System.out.println("Reverse of  "+s1+"  is: "+s2);
			 
			if(s1.equals(s2))
			{
				System.out.println("and it is palindrome");
				
			}	
			else 
			{
				System.out.println("and it is not a palindrome");
			}
		

	}

}
