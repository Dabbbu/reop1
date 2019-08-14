// 1010101010=1111100000

package pkg01;

public class sep 
{

	public static void main(String[] args) 
	{
	String s1="1010101010";
	String s2="";
	String s3="";
	int count2=0;
	int count=0;
	
	for(int i=0; i<=s1.length()-1;i++)
	{
		if(s1.charAt(i)=='1')
		{
			count++;
			s2=s2+1;
			
		}
		

	}
	System.out.print(s2);

	for(int j=0; j<=s1.length()-1;j++)
	{
		if(s1.charAt(j)=='0')
		{
			count++;
			s3=s3+0;
		}
	
	
	}
	System.out.print(s3);
	
	}
}
	
