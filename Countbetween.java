//write a program which accept number from user and return count between 3 to 7 number.

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
		int iCount=0;
		while(iNo>0)
		{
			iDigit=iNo%10;
			if((iDigit>2)&&(iDigit<8))
			{
				iCount++;
			}
			iNo=iNo/10;
		}
		return iCount;
	}
}
class Countbetween
{
	public  static void main(String[] arg)
	{
		int iRet=0;
		Number nobj=new Number();
		
		nobj.Accept();
		nobj.Display();
		iRet=nobj.Counter();
		System.out.println("Count bteween 3 and 7 number:"+iRet);
	}
}