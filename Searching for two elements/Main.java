import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<=n-1;i++)
      {
       arr[i]=sc.nextInt(); 
    }
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int flag=0;
        for(int i=0;i<=n-1;i++)
      {
          if(arr[i]==n1||arr[i]==n2)
          {
           
             System.out.println(i);
            flag++;
          }
       
      }
      if(flag!=2)
     System.out.println("-1");
    }
}