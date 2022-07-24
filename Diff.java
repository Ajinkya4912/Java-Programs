import java.util.*;

	class ArrayX
	{
		private int Arr[];
		public ArrayX(int iNo)
		{
			Arr=new int [iNo];
		}
		public void Accept()
		{
			int iCnt=0;
			Scanner sobj=new Scanner(System.in);
			System.out.println("Enter the Values:");
			for(iCnt=0;iCnt<Arr.length;iCnt++)
			{
				Arr[iCnt]=sobj.nextInt();
			}
		}
		public void Display()
		{
			int iCnt=0;
			System.out.println("Elemnts of Array are");
			for(iCnt=0;iCnt<Arr.length;iCnt++)
			{
				System.out.println(Arr[iCnt]);
			}
		}
	public	int SumDiff()
  {
      int iCnt=0;
      int eSum=0;
      int oSum=0;
      int iSum=0;
      for(iCnt=0;iCnt<Arr.length;iCnt++)
      {
          if(iCnt%2==0)
          {
              eSum=eSum+Arr[iCnt];
          }
          else
          {
              oSum=oSum+Arr[iCnt];
          }
      }
      iSum=eSum-oSum;
      return iSum;
	}
	}
class Diff
{
   public static void main(String[] arg)
   {
	   Scanner sobj=new Scanner(System.in);
	   int ilength=0, iRet=0;
	   
	   System.out.println("Enter value of Contructor");
	   ilength=sobj.nextInt();
	   
	   ArrayX obj=new ArrayX(ilength);
	   
	   obj.Accept();
	   obj.Display();
	   
	   iRet=obj.SumDiff();
	   System.out.println(+iRet);
	   }
}