//Accept N number from user and display all such element which are divisible by 5.
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
	   System.out.println("Enter number");
	   for(iCnt=0;iCnt<Arr.length;iCnt++)
	   {
		   Arr[iCnt]=sobj.nextInt();
	   }
   }
 public  void Display()
   {
	   int iCnt=0;
	   System.out.println("Elements of Array are:");
	   for(iCnt=0;iCnt<Arr.length;iCnt++)
	   {
		   System.out.println(+Arr[iCnt]);
	   }
	   System.out.println("");
   }
   public void Divisible()
   {
	   int iCnt=0;
	
	   for(iCnt=0;iCnt<Arr.length;iCnt++)
	   {
		   if(Arr[iCnt]%5==0)
		   {
			   System.out.println("Divisible by 5:"+Arr[iCnt]);
		   }
	   }
   }
}
class Divisiblefive
{
	public static void main(String[] arg)
	{
	int ilength=0;
	
	Scanner sobj=new Scanner(System.in);
	System.out.println("Enter number in constructor");
	ilength=sobj.nextInt();
	ArrayX obj=new ArrayX(ilength);
	obj.Accept();
	obj.Display();
	obj.Divisible();
}
}