import java.util.Scanner;
class Main{
	public static void main (String[] args){
	       int n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      int num=n;
	   for(int i=n;i>=1;i--)
       {
         for(int j=num;j>=1;j--)
         {
           System.out.print(j);
         }
         num=num-1;
         System.out.println();
       }
      
	}
}