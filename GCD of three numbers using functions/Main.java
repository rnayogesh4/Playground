import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	   Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      gcd(n1,n2,n3);
	}
  public static void gcd(int n1,int n2,int n3)
  {
    int min=0;
    int a=0;
    int min1=0;
    int result=0;
    if(n1>n2)
      min=n2;
    else
      min=n1;
    while(min>0)
    {
      if(n2%min==0&&n1%min==0)
      {
        a=min;
        break;
      }
      else
        min--;
    }
      if(a>n3)
      min1=n3;
    else
      min1=a;
    while(min1>0)
    {
      if(n3%min1==0&&a%min1==0)
      {
        result=min1;
        break;
      }
      else
        min1--;
    }
    System.out.println(result);
  }
}
	
