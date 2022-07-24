import java.lang.*;
import java.util.*;

class Bitwise
{
	public boolean CheckBit(int iNo)
	{
		int imask=64;
		int iResult=0;
		
		iResult=iNo&imask;
		if(iResult==0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
class Program6
{
 public static void main(String[] arg)
 {
	Scanner sobj=new Scanner(System.in);
	
	System.out.println("Enter Number");
	int value=sobj.nextInt();
	
	Bitwise bobj=new Bitwise();
	boolean bRet=bobj.CheckBit(value);
	
	if(bRet==true)
	{
		System.out.println("Bit is on");
	}
	else
	{
		System.out.println("Bit is off");
	}
 }
}





























//