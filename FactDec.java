//Write a program which Accept number from user and Display its factor in decrasing order.
import java.lang.*;
import java.util.*;

class Number
{
 private int iNo;

public void Accept()
{
	Scanner sobj= new Scanner(System.in);
	System.out.println("Enter Number");
	this.iNo=sobj.nextInt();
} 
public void Display()
{
	System.out.println("Value is:"+this.iNo);
}
public void FactDecrasing()
{
	int Mult=1;
	int iCnt=0;
	for(iCnt=iNo/2;iCnt>0;iCnt--)
	{
		if(iNo%iCnt==0)
		{
			System.out.println(+iCnt);
		}
	}
}
}
class FactDec
{
  public static void main(String[] arg)
  {
	  Number eobj=new  Number();
	  
	  eobj.Accept();
	  eobj.Display();
	  eobj.FactDecrasing();
	  //System.out.println("Factor is:"+iRet);
  }  
}