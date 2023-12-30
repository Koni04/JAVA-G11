import java.util.Scanner;

public class numberguessing 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    
    while(true) {
      System.out.println("DO you want to play again ??");
      String responseUp = sc.next();
      if(responseUp.equals("s"))
         {
          System.out.println("guess");
         }
         else 
         {
          System.out.print("Done");
         }
      
      String playerGuess = "yes";
      
      if (playerGuess.equals("yes")) 
      {
        System.out.println("Correct! You Win!");
        break;
      }
      else 
      {
         System.out.println("Press (s) to updgrade again... ");
         String response = sc.next();

         if(response.equals("s"))
         {
          System.out.println("guess");
         }
         else 
         {
          System.out.print("Done");
         }
      }
    sc.close();
   }
 } 
}