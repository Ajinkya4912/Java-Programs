import java.util.*;

class Number
{
	private int iNo;
	
	public void Accept()
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Number");
		this.iNo=sobj.nextInt();
	}
	public void Display()
	{
		System.out.println("Value is:"+this.iNo);
	}
	public void  EvenFactor()
	{
		int iCnt=0;
		for(iCnt=1;iCnt<=iNo/2;iCnt++)
		{
			if((iNo%iCnt==0)&& (iCnt%2==0))
			{
				System.out.println(+iCnt);
			}
		}
	}
}
class EvenFact
{
  public static void main(String[] arg)
  {
  Number eobj=new Number();
  eobj.Accept();
  eobj.Display();
  eobj.EvenFactor();
  }
}