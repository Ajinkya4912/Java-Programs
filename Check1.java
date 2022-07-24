//Accept N Number from user and check whther that number  contain 11 in it or not.

import java.util.*;

class ArrayX
{
	private int Arr[];
	
	public ArrayX(int iNo)
	{
		Arr=new int[iNo];
	}
	
	public void Accept()
	{
		int iCnt=0;
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Number");
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			Arr[iCnt]=sobj.nextInt();
		}
	}
	public void Display()
	{
		int iCnt=0;
		System.out.println("Value of Array are:");
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			System.out.println(+Arr[iCnt]);
		}
	}
	public boolean CheckNumber()
	{
		boolean bFlag=false;
		int iCnt=0;
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			if(Arr[iCnt]==11)
			{
				bFlag=true;
				break;
			}
		}
		return bFlag;
	}
}
class Check1
{
   public static void main (String[] arg)
   {
	   int ilength=0;
	    boolean bRet=false;
	   Scanner sobj=new Scanner(System.in);
	   System.out.println("Enter value of Constructor");
	   ilength=sobj.nextInt();
	   
	   ArrayX obj=new ArrayX(ilength);
	   
	   obj.Accept();
	   obj.Display();
	   bRet=obj.CheckNumber();
	   if(bRet==true)
	   {
		   System.out.println("11 is present in Array");
	   }
	   else
	   {
		   System.out.println("11 is not a present in Array");
	   }
   }
}