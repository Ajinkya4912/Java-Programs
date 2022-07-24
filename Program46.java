import java.util.*;

class Program46
{
	public static void main(String[] arg)
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number");
		int iNo=sobj.nextInt();
		
		int iMask=0x000000f;
		int iResult=0;
		
		iResult=iNo&iMask;
		
		if(iResult==iMask)
		{
			System.out.println("First Nible is Complasry on");
		}
		else
		{
			System.out.println("First Nible is off");
		}
	}
}