import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      greatest(n1,n2,n3);
	}
  public static void greatest(int n1,int n2,int n3)
  {
    int greater=0;
    
    if(n1>n2)
      greater=n1;
    else 
      greater=n2;
    if(n3>greater)
      greater=n3;
    System.out.println(greater);
  }
    
}