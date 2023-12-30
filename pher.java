import java.util.Scanner;
public class pher {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);

        String[] GuessAns = {"Minecraft","Clock","g"}; 
        String guess = "";
        int attempts = 0;
        
            System.out.println("What is the game i love the most?"); // Question 1.
                while (!guess.equals(GuessAns[0])) {
                    System.out.print("Answer: ");
                        guess = sc.nextLine();
                
                    if (GuessAns[0].equals(guess)){
                        System.out.println("Amazing!");
                    } else {
                        System.out.println("Nice try, Give it another go!");
                        attempts++;
                    }
                }

            System.out.println("What has a face and two hands but no arms and legs?"); //Question 2.
                while (!guess.equals(GuessAns[1])) {
                    System.out.print("Answer: ");
                        guess = sc.nextLine();
                
                    if (GuessAns[1].equals(guess)) {
                        System.out.println("Correct!");
                    } else {                      
                        System.out.println("Try Again!");
                        attempts++;
                    }
                }

            System.out.println("What comes at the end of everything?"); //Question 3.
                while (!guess.equals(GuessAns[2])) {
                    System.out.print("Answer: ");
                        guess = sc.nextLine();

                    if (GuessAns[2].equals(guess)) {
                        System.out.println("Wow! That was a tricky one.");
                    } else {
                        System.out.println("Give it another attempt!");
                        attempts++;
                    }
                }

        System.out.println("Goodjob! You Guessed Everything Correct with " + attempts + " Attempts!"); //End.
        sc.close();
    }
}