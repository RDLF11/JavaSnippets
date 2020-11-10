import java.util.Scanner;

public class YesOrNo{
  public static void main(String[]args) {

    String answer;
    boolean yn;
    System.out.println("is it true? yes or no");
    
    while (true) {
      Scanner in = new Scanner (System.in);

      answer = in.nextLine().trim().toLowerCase();
      if (answer.equals("yes")) {
      yn = true;
      System.out.println("Ok, it's " + yn + " then");
      break;
      }

      else if (answer.equals("no")) {
      yn = false;
      System.out.println("Ok, it's " + yn + " then");
      break;
      }

      else {    
      System.out.println("Sorry, I didn't catch that. Please answer yes or no");
      }

      in.close();
    }

  }

}