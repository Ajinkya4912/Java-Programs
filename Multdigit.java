//write a program which accept number from user and return Multiplication of Digit.

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
		System.out.println("value is"+this.iNo);
	}
	public int Counter()
	{
		int iDigit=0;
		int iMult=1;
		while(iNo>0)
		{
			iDigit=iNo%10;
			iMult=iMult*iDigit;
			iNo=iNo/10;
		}
		return iMult;
	}
}
class Multdigit
{
	public  static void main(String[] arg)
	{
		int iRet=0;
		Number nobj=new Number();
		
		nobj.Accept();
		nobj.Display();
		iRet=nobj.Counter();
		System.out.println("Multiplication of Dihgit is:"+iRet);
	}
}