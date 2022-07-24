//Accept N number from user return product of odd number.
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
	public int Product()
	{
		int iCnt=0,iSum=0,eSum=0,oSum=0;
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			if(Arr[iCnt]%2!=0)
			{
				iSum=iSum+Arr[iCnt];
			}
	    }
		return iSum;
	}
}
class OddN
{
   public static void main (String[] arg)
   {
	   int ilength=0;
	   int iRet=0;
	   Scanner sobj=new Scanner(System.in);
	   System.out.println("Enter value of Constructor");
	   ilength=sobj.nextInt();
	   
	   ArrayX obj=new ArrayX(ilength);
	   
	   obj.Accept();
	   obj.Display();
	   iRet=obj.Product();
	   System.out.println("Product of Odd Number is::"+iRet);
   }
}