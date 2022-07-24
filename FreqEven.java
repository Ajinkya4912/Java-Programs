//Accept N number user and return frequency of even number.

import java.util.*;

class ArrayX
  {
   private int Arr[];
   
   public ArrayX(int iNo)
   {
	   Arr=new int [iNo];
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
	   
	   System.out.println("Array number are");
	   for(iCnt=0;iCnt<Arr.length;iCnt++)
	   {
		   System.out.println(+Arr[iCnt]);
	   }
	   System.out.println("");
   }
   public int Frequency()
   {
	   int iCnt=0;
	   int iCount=0;
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
class FreqEven
 {
	 public static void main(String[] arg)
	 {
	 int iRet=0;
	 int ilength=0;
	Scanner sobj=new Scanner(System.in); 
    System.out.println("Enter value of Constructor");	
	ilength=sobj.nextInt();
	ArrayX obj=new ArrayX(ilength);
	obj.Accept();
	obj.Display();
	iRet=obj. Frequency();
	System.out.println("Frequency of Even number is:"+iRet);
 }
 }