import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
    int base=sc.nextInt();
    int exp=sc.nextInt();
    int result=power(base,exp);
    System.out.println(result);
  }
  public static int power(int a,int b)
  {
    int c=1;
    for(int i=1;i<=b;i++)
    {
      c=c*a;
    }
    return c;
  }
}

    