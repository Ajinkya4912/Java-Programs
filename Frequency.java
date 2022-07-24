//Accept number from user and  check wheter Frequency of Number.

import java.util.*;

class Number
{
	public boolean bFlag;
	private int iNo;
	
	public void Accept()
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Number");
		iNo=sobj.nextInt();
	}
	public void  Display()
	{
		System.out.println("Value is:"+this.iNo);
	}
	public int Checkfrequency()
	{
		int iCount=0;
		int iDigit=0;
		while(iNo>0)
		{
			iDigit=iNo%10;
			if(iDigit==2)
			{
			   iCount++;
			}
			iNo=iNo/10;
		}
		return iCount;
	}
}
class Frequency
{
	public static void main(String[] arg)
	{
		int iRet=0;
		Number nobj=new Number();
		
		
		nobj.Accept();
		nobj.Display();
		iRet=nobj.Checkfrequency();
		
		System.out.println("Frequency of numnber is:"+iRet);
	}
}