//Write a program which Accept number from user and Display its Multiplication of Factor
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
public int FactMultiplication()
{
	int Mult=1;
	int iCnt=0;
	for(iCnt=1;iCnt<=iNo/2;iCnt++)
	{
		if(iNo%iCnt==0)
		{
			Mult=Mult*iCnt;
		}
	}
	return Mult;
}
}
class FactMult
{
  public static void main(String[] arg)
  {
	  int iRet=0;
	  Number eobj=new  Number();
	  
	  eobj.Accept();
	  eobj.Display();
	  iRet=eobj.FactMultiplication();
	  System.out.println("Multiplication of Factor:"+iRet);
  }  
}