import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
    int list[]=new int[n];
    for(int i=0;i<n;i++)
    {
      list[i]=sc.nextInt();
    }
    int max=list[0];
    int index=0;
    for(int j=1;j<n;j++)
    {if(max<list[j])
    {index=j;
     max=list[j];
    }
    }
    System.out.println(index);
    
      
      
  }
}