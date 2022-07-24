//Accept  number from user and display below pattern.
/*
5 # 4 # 3 # 2 # 1 #
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
		for(iCnt=iNo;iCnt>=1;iCnt--)
		{
			System.out.print(+iCnt);
			System.out.print(" ");
			System.out.print("#");
			System.out.print(" ");
		}
	}
}
class Pattern2
{
	public static void main(String[] arg)
	{
		Number nobj=new Number();
		
		nobj.Accept();
		nobj.Display();
	}
}
