import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int lastdigit=n%10;
      int firstdigit=n;
      while(firstdigit>=10)
      {
        firstdigit=firstdigit/10;
	}
     int sum = firstdigit+lastdigit;
      System.out.println(sum);
}
}