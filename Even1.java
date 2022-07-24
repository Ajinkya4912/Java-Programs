//Write a proram which Accept one number from user and print that number of even number.
import java.util.*;

class Number
{
  private int iNo=0;
  
  public void Accept()
  {
	  Scanner sobj=new Scanner(System.in);
	  System.out.println("Enter Number");
	  this.iNo=sobj.nextInt();
  }  
  public void Display()
  {
	  System.out.println("Number is:"+this.iNo);
  }
  public void DisplayEven()
  {
	  int iCnt=0;
	  
	  for(iCnt=1;iCnt<=iNo*2;iCnt++)
	  {
		  if(iCnt%2==0)
		  {
		  System.out.println(+iCnt);
	      }
	  }
  }
}
class Even1
{
 public static void main(String[] arg)
 {
	 Number eobj=new Number(); 
     eobj.Accept();
	 eobj.Display();
	 eobj.DisplayEven();
 }
}