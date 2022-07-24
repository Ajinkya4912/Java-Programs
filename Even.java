import java.util.*;

class Number
{
	private int iNo;
	
	public void Accept()
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Number:");
		this.iNo=sobj.nextInt();
	}
	public void Display()
	{
		System.out.println("Value is"+this.iNo);
	}
	public void EvenNumber()
	{
		int iCnt=0;
		for(iCnt=1;iCnt<=iNo;iCnt++)
		{
			if(iCnt%2==0)
			{
				System.out.println(+iCnt);
			}
		}
	}
}
class Even
{
	public static void main(String[] arg)
	{
		Number nobj=new Number();
		
		nobj.Accept();
		nobj.Display();
		nobj.EvenNumber();
	}
}