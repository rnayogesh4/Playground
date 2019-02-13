import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       	Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
    int list[]=new int[n];
    for(int i=0;i<n;i++)
    {
      list[i]=sc.nextInt();
    }
      int zero_count=0;
      for(int j=0;j<n;j++)
      {
        if(list[j]==0)
          zero_count++;
    }
      int temp[]=new int[n-zero_count];
      int l=0;
      for(int i=0;i<n;i++)
      {
        if(list[i]!=0)
        {temp[l]=list[i];
        l++;
        }
      }
      int size=0;
      for(int i=0;i<(n-zero_count);i++)
      {
        list[i]=temp[i];
        size++;
      }
      for(int j=0;j<zero_count;j++)
      {
        list[size]=0;
        size++;
      }
      for(int i=0;i<n;i++)
      { System.out.print(list[i]+" ");
      }
          }
}