import java.util.Scanner;

public class literalGuess
{

    public static void main(String[]args)
    {
        Scanner reader = new Scanner(System.in);

        int numCorrect = 0;

        System.out.println("Guess What is meaning:");

        System.out.println("whats is the meaning of java?");

        String response = reader.nextLine();
        
        if (response.equals("Just another virtual accelerator"))
        {
            System.out.println("Correct!");
            numCorrect+=1;
        }
        else 
        {
            System.out.println(" Wrong, Nice Try");
        }
        
        System.out.println("what is the meaning of html?");

        response = reader.nextLine();
       if (response.equals("Hypertext markup language"))
        {
            System.out.println("Correct!");
            numCorrect+=1;
        }
        else 
        {
            System.out.println(" Wrong, Nice Try");
        }  

        System.out.println("what is the meaning of css?");

        response = reader.nextLine();
       if (response.equals("Cascading style sheets"))
        {
            System.out.println("Correct!");
            numCorrect+=1;
        }
        else 
        {
            System.out.println(" Wrong, Nice Try");
        }  

        System.out.println("what is the meaning of js?");

        response = reader.nextLine();
       if (response.equals("Javascript"))
        {
            System.out.println("Correct!");
            numCorrect+=1;
        }
        else 
        {
            System.out.println(" Wrong, Nice Try");
        }

        System.out.println("Whats is the meaning of {} ?");

        response = reader.nextLine();
       if (response.equals("Open close parentheses"))
        {
            System.out.println("Correct!");
            numCorrect+=1;
        }
        else 
        {
            System.out.println(" Wrong, Nice Try");
        }

        int totalQuestions = 5;
        double score = (100.0*numCorrect) / totalQuestions;

        System.out.println("You scored  "+score+ "%");

        reader.close();
    }
}