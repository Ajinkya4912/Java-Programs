//Accept N number from user and return frequency of 11 from it.

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
		System.out.println("Value of Arrays");
		for(iCnt=0;iCnt>Arr.length;iCnt++)
		{
			System.out.println(+Arr[iCnt]);
		}
	}
	public int Frequency()
	{
		int iCount=0;
		int iCnt=0;
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			if(Arr[iCnt]%2==0)
			{
				iCount++;
			}
		}
		return iCount;
	}
}
class FrequencyE
{
  public static void main(String[] arg)
  {
	  int ilength=0;
      int iRet=0;
	  Scanner sobj=new  Scanner(System.in);
	  System.out.println("Enter value of Constructor");
	  ilength=sobj.nextInt();
	  ArrayX obj=new ArrayX(ilength);
	  obj.Accept();
	  obj.Display();
	  iRet=obj.Frequency();
	  
	  System.out.println("Frequency of even number is:"+iRet);
  }  
}