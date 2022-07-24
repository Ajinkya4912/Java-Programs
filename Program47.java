import java.util.*;

class Program47
{
	public static void main(String[] arg)
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number");
		long iNo=sobj.nextInt();
		
		System.out.println("Enter Starting point");
		int iStart=sobj.nextInt();
		
		System.out.println("Enter Ending point");
		int iEnd=sobj.nextInt();
		
		int iMask1=0xffffffff;
		int iMask2=0xffffffff;
		long iMask=0;
		
		iMask1=iMask1<<(iStart-1);
		iMask2=iMask2>>(32-iEnd);
		
		iMask=iMask1&iMask2;
		
		System.out.println(iMask);
		long iResult=0;
		
		iResult=iNo&iMask;
		if(iResult==iMask)
		{
			System.out.println("Bits are on");
		}
		else
		{
			System.out.println("Bits are Off");
		}
	}
}