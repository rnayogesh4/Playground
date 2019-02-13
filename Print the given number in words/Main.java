import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	   Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      if(n==3)
        System.out.println("Three");
      else if (n>5)
        System.out.println("Invalid");
	}
}