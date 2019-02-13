import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int f=n/100;
    int s=(n/10)%10;
    int l=n%10;
    int reverse=(l*100)+(s*10)+f;
    System.out.println(reverse);
  }
}