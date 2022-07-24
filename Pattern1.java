//Accept  number from user and display below pattern.
/*
A B C D E
*/
import java.lang.*;
import java.util.*;

class Number
{
	private int iNo;
	
	public void Accept()
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Number");
		this.iNo=sobj.nextInt();
	}
	public void Display()
	{
		int iCnt=0;
		char ch='\0';
		for(iCnt=1,ch='A';iCnt<=iNo;iCnt++,ch++)
		{
			System.out.print( ch);
			System.out.print(" ");
		}
	}
}
class Pattern1
{
	public static void main(String[] arg)
	{
		Number nobj=new Number();
		
		nobj.Accept();
		nobj.Display();
	}
}
