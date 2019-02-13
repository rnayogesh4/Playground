import java.util.Scanner;
class Main{
	public static void main (String[] args){
	         Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
      for( int i=2;i<=n;i++)
      {
        prime(i);
	}
    }
  public static void prime(int n)
  {if (n==2||n==3)
  {  System.out.println(n);
  }
   else
   { int flag=0;
     for(int i=2;i<=Math.sqrt(n);i++)
     { if(n%i==0)
    {flag=0;
     break;

    }
      
    else
      flag=1;
     }
    if(flag==1)
      System.out.println(n);
   }
  }
}