import java.lang.*;
import java.util.*;
//0000 0000 0000 0000 0000 0000 0000 0000
//  0   4    0     0    0   0    0     0   //27

class Bitwise
{
	public int OnBit(int iNo) //4
	{
		int imask=0X04000000;    
        int iResult=0;
       		
			iResult=iNo | imask;
			return iResult;
	}
}
class Program9
{
 public static void main(String[] arg)
 {
	Scanner sobj=new Scanner(System.in);
	
	System.out.println("Enter Number");
	int value=sobj.nextInt();
	
	Bitwise bobj=new Bitwise();
	int iRet=bobj.OnBit(value);
	System.out.println(+iRet);
 }
}





























//