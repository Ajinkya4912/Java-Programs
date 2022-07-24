//Display maximum Charcter String... 
import java.util.*;
 class Program55
{
	public static void main(String[] arg)
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the String");
	 	String str=sobj.nextLine();
	 
        char Arr[]=str.toCharArray();
		
		HashMap<Character,Integer>hobj=new HashMap<>();
		int Frequency=0;
		for(char ch:Arr) //for(int i=0;i<Arr.length;i++)
		{
			if(hobj.containsKey(ch))
			{
				Frequency=hobj.get(ch);
				hobj.put(ch,hobj.get(ch)+1);
			}
			else
			{
				hobj.put(ch,1);
			}
		}
		Set<Character>setobj=hobj.keySet();
		int iMax=0;
		char c='\0';
		for(char value:setobj)
		{
			if(hobj.get(value)>iMax)
			{
				iMax=hobj.get(value);
				c=value;
			}
		}
		System.out.println(c+"Occurs Maximum number of times is:"+iMax);
	}
}