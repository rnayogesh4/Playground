import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    	  
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int temp=n;
      int sum=0;
      int fact=1;
      while(n>0)
      {
        int a=n%10;
        for(int i=1;i<=a;i++)
        {
          fact=fact*i;
        }
        n=n/10;
        sum=sum+fact;
        fact=1;
      }
      if(sum==temp)
        System.out.println("Yes");
      else
                System.out.println("No");
        
      
	}
}