//Accept N number from user and Accept one another number as No and index of LastOccurence.

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
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			System.out.println(+Arr[iCnt]);
		}
	}
	public int LastOccurence(int iNo1)
	{
		int iCnt=0;
		for(iCnt=Arr.length-1;iCnt>=0;iCnt--)
		{
			if(Arr[iCnt]==iNo1)
			{
				break;
			}
		}
		return iCnt;
	}
}
class IndexL
{
  public static void main(String[] arg)
  {
	  int ilength=0,iValue=0;
      int iRet=0;
	  Scanner sobj=new  Scanner(System.in);
	  System.out.println("Enter value of Constructor");
	  ilength=sobj.nextInt();
	  System.out.println("Entrer Second Number");
	  iValue=sobj.nextInt();
	  
	  ArrayX obj=new ArrayX(ilength);
	  obj.Accept();
	  obj.Display();
	  iRet=obj.LastOccurence(iValue);
	  
	  System.out.println("Last occurence index is:"+iRet);
  }  
}