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
   public void DisplayNonFact()
   {
	   int iCnt=0;
	   
	   for(iCnt=1;iCnt<=iNo;iCnt++)
	   {
		   if(iNo%iCnt!=0)
		   {
			   System.out.println(+iCnt);
		   }
	   }
   }
}
class Nonfact
{
  public static void main(String[] arg)
  {
	  Number nobj=new Number();
	  nobj.Accept();
	  nobj.Display();
	  nobj.DisplayNonFact();
	  nobj=null;
	  
  }
}