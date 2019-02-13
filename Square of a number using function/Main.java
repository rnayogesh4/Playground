import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
     int n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      int result=sq(n);
      System.out.println(result);
      
	} 
  public static  int sq(int n)
  {
    return n*n;
  }
}