import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int temp=n;
      int t1=n;
      int count=0;
      int prod=1;
      int sum=0;
      int g;
      while(n>0)
      {
      n=n%10;
      count++;
        n=n/10;
      }
      while(temp>0)
      {
         g=temp%10;
      
           prod=g*g*g;
        
        sum=sum+prod;
        temp=temp/10;
        prod=1;
        
      }
      if(sum==t1)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
        
      
    }
      
}