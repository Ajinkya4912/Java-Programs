//Accept N number from user and one another number is avilabl or not. 
import java.util.*;

class ArrayX
{
  private int Arr[];
  public int iValue;
  
  public ArrayX(int iNo,int iValue)
  {
	  Arr=new int [iNo];
  }
  public void Accept()
  {
	  int iCnt=0;
	  Scanner sobj=new Scanner(System.in);
	  System.out.println("Enter the Value:");
	  for(iCnt=0;iCnt<Arr.length;iCnt++)
	  {
		  Arr[iCnt]=sobj.nextInt();
	  }
  }
  public void Display()
  {
	  int iCnt=0;
	  System.out.println("Element of Array Are:");
	  for(iCnt=0;iCnt<Arr.length;iCnt++)
	  {
		  System.out.println(+Arr[iCnt]);
	  }
	  System.out.println(+iValue);
  }
  public boolean AvailableNumber()
  {  boolean bFalg=false;
	  int iCnt=0;
	  for(iCnt=0;iCnt<Arr.length;iCnt++)
	  {
		 if(Arr[iCnt]==iValue)
		 {
			 bFalg=true;
			 break;
		 }
	  }
  }
}
class Available
{
	public static void main(String[] arg)
	{
		int ilength=0;
		boolean bRet=false; int iNo1=0;
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the Calue of Constructor");
		ilength=sobj.nextInt();
		System.out.println("Enter Another number");
		iNo1=sobj.nextInt();
		
		ArrayX obj=new ArrayX(ilength,iNo1);
		
		obj.Accept();
		obj.Display();
		bRet=obj.AvailableNumber();
	if(bRet==true)
	{
	    System.out.println("Number is Available");
	}
	else
	{
		System.out.println("Number is  Not Available");
	}
	}
}