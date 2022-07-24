//Accept N number from user and Accept one another as No check whether No is present or not.  
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
	   System.out.println("Values of Array");
	   for(iCnt=0;iCnt<Arr.length;iCnt++)
	   {
		System.out.println(+Arr[iCnt]);
	   }
   }
   public boolean Check(int iNo)
   {
	   boolean bFlag=false;
	   int iCnt=0;
	   for(iCnt=0;iCnt<Arr.length;iCnt++)
	   {
		   if(Arr[iCnt]==iNo)
		   {
			   bFlag=true;
			   break;
		   }
	   }
	   return bFlag;
   }
}
class FrequencyC
{
   public static void main(String[] arg)
   {
	   boolean bRet=false;
	   int ilength=0,iValue=0;
     Scanner sobj=new Scanner(System.in);
     System.out.println("Enter number of constructor");
	 ilength=sobj.nextInt();
	 
	 System.out.println("Enter Second Number");
	 iValue=sobj.nextInt();
	 
	 ArrayX obj=new ArrayX(ilength);
	 obj.Accept();
	 obj.Display();
	 bRet=obj.Check(iValue);
	 
	 if(bRet==true)
	 {
		 System.out.println("Number is Presnt:"+iValue);
	 }
	 else
	 {
		 System.out.println("Number is Not a Present:"+iValue);
	 }
   }
}