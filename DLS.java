//Accept N number from user and return Differnce between Largest Number Smallest Number.
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
	public int Smaller()
	{
		int iCnt=0;
		int Diff=0;
		int Smallest=Arr[0];
		int Largest=Arr[0];
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			if(Arr[iCnt]>Largest)
			{
				Largest=Arr[iCnt];
			}
			else if(Arr[iCnt]<Smallest)
			{
				Smallest=Arr[iCnt];
			}
	    }
		Diff=Largest-Smallest;
		return Diff;
	}
}
class DLS
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
	   iRet=obj.Smaller();
	   System.out.println("Differnce between Largest Number and Smallest number is:"+iRet);
   }
}