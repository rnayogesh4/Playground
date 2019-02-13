import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     int n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      int result=sum(n);
      System.out.println(result);
	}
  public static int sum(int n)
  {
    int s=0;
    for(int i=1;i<=n;i++)
    {
       s=s+i;
    }
    return s;
  }
      
}