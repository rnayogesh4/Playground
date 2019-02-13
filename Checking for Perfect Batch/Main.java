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
   int m=n/3;
    int sum[]=new int[m];
    int l=0;
    sum[l]=0;
    int p=0;
    
    for(int j=0;j<m;j++)
    {for(int k=0;k<3;k++)
    {
      sum[l]=sum[l]+list[p];
      p++;

    }
    
     l++;
    }
    if(sum[0]==sum[1]&&sum[0]==sum[2])
      System.out.println("Perfect Batch");
    else 
      System.out.println("Not a Perfect Batch");
  }
}
  