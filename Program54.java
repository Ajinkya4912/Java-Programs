//Display the Strings in highest times Charcter
import java.util.*;
 class Program54
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
		for(char value:setobj)
		{
			System.out.println(value+"Occur"+hobj.get(value)+"times");
		}
	}
}