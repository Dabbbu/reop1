//my name is devesh
//devesh is name my 

package pkg01;

import java.util.Scanner;

public class StringHndlg2 {

	public static void main(String[] args) 
	{
		
System.out.println("Entre any String:  ");
		
	
		Scanner s4= new Scanner(System.in);
		String s2=s4.nextLine();
		String[] s3=s2.split(" ");
		
		for(int i=s3.length-1; i>=0;i--)
		{
			System.out.print(s3[i]+" ");
			
		}
	
	}

}
