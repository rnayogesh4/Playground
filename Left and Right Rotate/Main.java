import java.util.Scanner;
class Main
{
  public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   int size=sc.nextInt();
   int list[]=new int[size];
   for(int i=0;i<size;i++)
{
    list[i]=sc.nextInt();
}
   int rot=sc.nextInt();
int temp1=0;
int temp2=0;
int temp3=0;
int temp4=0;
if(size%2!=0)
{
   
for(int j=0;j<rot;j++)
{temp1=list[size-1];
    for(int k=size-1;k>0;k=k-2)
   { 
list[k]=list[k-2];

}
list[0]=temp1;
}
 for(int j=0;j<rot;j++)
{temp2=list[1];
for(int l=1;l<size-2;l=l+2)
{
  list[l]=list[l+2];
}
list[size-2]=temp2;
}

}
else
{
 for(int m=0;m<rot;m++)
{temp3=list[size-2];
for(int n=size-2;n>0;n=n-2)
{
  list[n]=list[n-2];
}
list[0]=temp3;
}
 for(int j=0;j<rot;j++)
{temp4=list[1];
for(int p=1;p<size-1;p=p+2)
{
  list[p]=list[p+2];
}
list[size-1]=temp4;
}
}

   

 
for(int i=0;i<size;i++)
{
System.out.print(list[i]);
  System.out.print(" ");
}

}
}
     