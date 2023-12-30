import java.util.Scanner;

public class ian 
{
    public static void main (String[]args)
    {
        Scanner guessingGame = new Scanner(System.in);

        String number = "5";
        String guess = "";
        int guessCount = 0;
        int guessLimit = 5;
        boolean outOfGuesses = false; 

        while(!guess.equals(number) && !outOfGuesses)
        {
            if(guessCount < guessLimit)
            {
            System.out.println("choose number 1-10");
            guess = guessingGame.nextLine();
            guessCount++;
            }
             else
            {
            outOfGuesses = true;
            }

            }
            if(outOfGuesses)
            {
            System.out.println("You Lose!");
            } else 
            {
            System.out.println("You Win!");

            guessingGame.close();

            System.out.println("it tooked you "+guessCount+".");
        }
    }
}