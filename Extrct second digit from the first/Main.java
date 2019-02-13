import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int seconddigit=n;
      while(seconddigit>=100)
      {
         seconddigit=seconddigit/10;
      }
      seconddigit=seconddigit%10;
      System.out.println(seconddigit);
    }
}
        