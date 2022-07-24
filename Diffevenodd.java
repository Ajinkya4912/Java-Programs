//write a program which accept number from user and return Differnce between sumation even or odd number.

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
	public int Summation()
	{
		int iDigit=0;
		int eSum=0,oSum=0,dSum=0;
		while(iNo>0)
		{
			iDigit=iNo%10;
			if(iDigit%2==0)
			{
				eSum=eSum+iDigit;
			}
			else
			{
				oSum=oSum+iDigit;
			}
			iNo=iNo/10;
		}
		dSum=eSum-oSum;
		return dSum;
	}
}
class Diffevenodd
{
	public  static void main(String[] arg)
	{
		int iRet=0;
		Number nobj=new Number();
		
		nobj.Accept();
		nobj.Display();
		iRet=nobj.Summation();
		System.out.println("Multiplication of Dihgit is:"+iRet);
	}
}