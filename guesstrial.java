import java.util.Scanner; // eto  dineclare ko import java.util.Scanner;

public class guesstrial // eto ung kung ano class name ko 
{
    public static void main (String[]args) // eto ung main class or ewan basta nalimutan kona
    {

        //Eto ung method!

        Scanner guessingGame = new Scanner(System.in); // nag declare ako ng guessingGame! note any name pede dyan!

        String secretWord = "while loop";    // string cause ung ginamit kong value is name! // pede mo syang gawing int 
        String guess = "";   // eto ung blackong ilagagay na value kung ano hula nila
        int guessCount = 0;   // eto nmn ung magbibilang kung naka ilang try ka
        int guessLimit = 5;   // eto ung if kung gusto mo ng limit sa guessing words pede mo iadjust
        boolean outOfGuesses = false;  // eto nnm if ung guess mo ay wala sa pagpipilian mag fafalse syah

        System.out.println("Guess or pick a Word!");  // eto ung paunang sulat pra inde nakakalito
        System.out.println("Choose a words: do while loop , for loop , while loop "); // eto nmn ung papag piliian pag wala d2 mag fafalse!

        
        while(!guess.equals(secretWord) && !outOfGuesses)  // while loop statement ginawa ko kasi if ung value na tinype mo mali tuloy tuloy lng syah if tama mag iistop na ung program
        {
            if(guessCount < guessLimit)  // if ung guesscount mo ay 3 na mag iistopnayung program 
            {
            System.out.print("Enter a guess: "); //eto ung pauli uit ulit na print pag mali value or tinype mo na word
            guess = guessingGame.nextLine();   // if ung guess daw ay puta indi kotoh gets feelng para tong method na hava scanner = name na gusto mo = new Scanner(System.in);
            guessCount++; //eto ung count mo if mali sagot mo pag priprint ulit syah ng "enter a guess" increment
            }
             else
            {
            outOfGuesses = true; // // eto pag ibah sinagot mo tuloy tuloy lng! true if false istop program!
            }

            }
            if(outOfGuesses)  // if ung guess mo ay tama o mali
            {
            System.out.println("You Lose!"); // pag mali guess mo eto ipriprint
            } else 
            {
            System.out.println("You Win!"); // if tama nmn eto i pri print

            guessingGame.close();  // eto ung pang close sa guessingGame.Scanner

            // basta ganyan!!!
        }
    }
}