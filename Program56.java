//Display maximum words in String... 
import java.util.*;
 class Program56
{
	public static void main(String[] arg)
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the String");
	 	String str=sobj.nextLine();
	 
        String Arr[]=str.split(" ");
		
		HashMap<String,Integer>hobj=new HashMap<>();
		int Frequency=0;
		for(String ch:Arr) //for(int i=0;i<Arr.length;i++)
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
		Set<String>setobj=hobj.keySet();
		int iMax=0;
		String c=" ";
		for(String value:setobj)
		{
			if(hobj.get(value)>iMax)
			{
				iMax=hobj.get(value);
				c=value;
			}
		}
		System.out.println(c+"Words Occurs Maximum number of times is:"+iMax);
	}
}