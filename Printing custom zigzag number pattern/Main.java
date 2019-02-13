import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    int n;
      int num=1;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      for(int i=1;i<=n;i++)
      {
        if(i%2!=0)
        {  for(int j=1;j<=n-1;j++)
          {
            System.out.print(i);
          }
        num=num+1;
        
       System.out.print(num);
        num=num+1;}
        else
        {
          System.out.print(num); 
          for(int k=1;k<=n-1;k++)
           
          {
            System.out.print(i);
          }
        }
        System.out.println();
      }
          
          
            
	}
}