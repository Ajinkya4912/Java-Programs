//Accept N number from user and display all such element which are even and divisible by 5

import java.util.*;

class ArrayX
{
	private int Arr[];
	
	public ArrayX(int iNo)
	{
		Arr=new int[iNo];
	}
	public void Accept()
	{
		int iCnt=0;
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Number");
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			Arr[iCnt]=sobj.nextInt();
		}
	}
	public void Display()
	{
		int iCnt=0;
		System.out.println("Element of Array are:");
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			System.out.println(+Arr[iCnt]);
		}
	}
	public void EvenDiv()
	{
		int iCnt=0;
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			if((Arr[iCnt]%5==0) && (Arr[iCnt]%2==0))
			{
				System.out.println(+Arr[iCnt]);
			}
		}
	}
}
class DivEven
{
	public static void main(String[] arg)
	{
		int ilength=0;
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter value of constructor");
		ilength=sobj.nextInt();
		ArrayX obj=new ArrayX(ilength);
		obj.Accept();
		obj.Display();
		obj.EvenDiv();
	}
}