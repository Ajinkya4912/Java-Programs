//count  Number of Word in Sentence.
import java.util.*;
class Program17
{
  public static void main(String arg[])
  {
	  Scanner sobj=new Scanner(System.in);
	  
	  System.out.println("Enter the String: ");
	  String str=sobj.nextLine();
	  
	 String arr[]=str.split(" ");
	 
	System.out.println("Number of words are:"+arr.length);
  }
}
