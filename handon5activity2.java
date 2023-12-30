import java.util.Scanner;

public class handon5activity2
{
    public static void main (String[]args)
    {

        //Eto ung method!

        Scanner guessingGame = new Scanner(System.in);

        String secretWord = "while loop";
        String guess = "";
        int guessCount = 0;
        int guessLimit = 2;
        boolean outOfGuesses = false;
        
        while(!guess.equals(secretWord) && !outOfGuesses)
        {
            if(guessCount < guessLimit)
            {
            System.out.print("Enter a guess: ");
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
        }
    }
}