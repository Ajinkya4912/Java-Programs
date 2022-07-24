//Accept N number user and display all such elemnt are divisible by 3 and 5.

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
   }
   public void Divisible()
   {
	   int iCnt=0;
	   for(iCnt=0;iCnt<Arr.length;iCnt++)
	   {
		   if((Arr[iCnt]%3==0) && (Arr[iCnt]%5)==0)
		   {
			   System.out.println(+Arr[iCnt]);
		   }
	   }
   }
  }
class Divthree
 {
	 public static void main(String[] arg)
	 {
	 int ilength=0;
	Scanner sobj=new Scanner(System.in); 
    System.out.println("Enter value of Constructor");	
	ilength=sobj.nextInt();
	ArrayX obj=new ArrayX(ilength);
	obj.Accept();
	obj.Display();
	obj. Divisible();
 }
 }