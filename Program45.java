import java.util.*;
class Program45
{
	public static void main(String[] arg)
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int iNo=sobj.nextInt();
		
		int iDigit=0;
		int iSum=0;
		while(true)
		{
		while(iNo!=0)
		{
			iDigit=iNo%10;
			iSum=iSum+iDigit;
			iNo=iNo/10;
		}
		iNo=iSum;
		iSum=0;
		if(iNo<10)
		{
			break;
		}
	}
		System.out.println(iNo);
	}
}