//write a program which accept which accept number from user and display all its Non Factors.

import java.util.*;

class Number
{
   private int iNo;
   
   public void Accept()
   {
	   Scanner sobj=new Scanner(System.in);
	   System.out.println("Enter number");
	   this.iNo=sobj.nextInt();
   }
   public void Display()
   {
	   System.out.println("Value is:"+this.iNo);
   }
   public int DisplayNonFact()
   {
	   int iCnt=0;
	   int Fsum=0;
	   int Nsum=0;
	   int Diff=0;
	   
	   for(iCnt=1;iCnt<iNo;iCnt++)
	   {
		   if(iNo%iCnt==0)
		   {
			   Fsum=Fsum+iCnt;
		   }
		   else
		   {
			   Nsum=Nsum+iCnt;
		   }
	   }
	   Diff=Fsum-Nsum;
	   return Diff;
   }
}
class Difffactnonfact
{
  public static void main(String[] arg)
  {
	  int iRet=0;
	  Number nobj=new Number();
	  nobj.Accept();
	  nobj.Display();
	  iRet=nobj.DisplayNonFact();
	  System.out.println("Differnce  of factor and non Fcator number are:"+iRet);
	  nobj=null;
	  
  }
}