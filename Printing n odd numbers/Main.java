import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    	     Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int count=1;
      for(int flag=1;flag<=n;flag=flag+1)
      {
          System.out.println(count);
     count=count+2;
      }
	}
}