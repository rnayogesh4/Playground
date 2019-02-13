import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    int n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      for(int i=1;i<=n;i++)
      {
        if(i%n==1||i%n==0)
        for(int j=1;j<=n;j++)
        {
          System.out.print("*");
        }
        else
          for(int k=1;k<=n;k++)
          {
            if(k%n==1||k%n==0)
              System.out.print("*");
            else
             System.out.print(" ");
          }
        System.out.println();
      }
              
      }
}