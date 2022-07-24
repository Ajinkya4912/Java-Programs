//String convert the Charcter
import java.util.*;
class Program15
{
	public static void main(String[] arg)
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String str=sobj.nextLine();
		
		char arr[]=str.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}