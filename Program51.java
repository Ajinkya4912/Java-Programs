//Rotation String
import java.util.*;
 class Program51
{
	public static void main(String[] arg)
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter First String");
	 	 String str1=sobj.nextLine();
	 
    	 System.out.println("Enter rotated String");
		String str2=sobj.nextLine();
     		
	   if(str1.length()!=str2.length())
	   {
		   System.out.println("String are not Rotation");
		   return;
	   }		   
	   String str3=str1+str1;
      	   
	   if(str3.contains(str2))
	   {
		   System.out.println("String are Rotations");
	   }
	   else
	   {
		   System.out.println("String are not Rotation");
	   }
	}
}