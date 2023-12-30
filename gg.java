import java.util.Scanner;

public class gg
{
    public static void main(String args[])
    {
		Scanner scan = new Scanner (System.in);

        System.out.println("Maintianace #Fixing");

        System.out.println("Pick a method!");
	    System.out.println("1 EqualornotEqual, 2 GussingGameChallage, 3 ageSecuring., 4 Operation godz");

     int x = scan.nextInt();
	 
	 
	 if ( x == 1 )
     {
		equalsvalue();
	 }
	 else if ( x == 2)
     {
		GuessingGame();
	 }
	 else if ( x == 3)
     {
		ageProgram();
	 }
     else if (x == 4)
     {
        operation();
     }
	 else 
     {
		System.out.println("Invalid method");
	 }
     scan.close();
    }
	private static void equalsvalue(){

        Scanner sc = new Scanner(System.in);
        int num1;  // num1
        int num2;  // num2

        System.out.print("Eneter value for num1: ");
        num1 = sc.nextInt(); 

        System.out.print("Enter value for num2: ");
        num2 = sc.nextInt();

        if (num1 == num2)
        {
            System.out.println("EQUAL!");
        }
        else // elsee
        {
            System.out.println("NOT EQUAL!");
        }
        sc.close();
	}
	private static void GuessingGame(){

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
	private static void ageProgram(){

        Scanner sc = new Scanner(System.in);

        System.out.print("How old are you?: ");

        int age = sc.nextInt();
		
		if (age < 16)
			System.out.println("YOUR ARE KID");

		else 
			System.out.println("YOUR ARE ADDULT");

        sc.close();
	}
    private static void operation() {

        int num1;
        int num2;
        int op;

        Scanner sc = new Scanner (System.in);
    
        System.out.print("Enter the first number:");
        num1 = sc.nextInt();
    
        System.out.print("Then enter the second number:");
        num2 = sc.nextInt();

    
        System.out.println("Please enter your preferred operation. '1' for addition, '2' for subtraction."); 
    
        System.out.println("'3' for multiplication, '4' for division");
    
        System.out.println("Note that this calculator don't support floating numbers or decimals.");
    
        op = sc.nextInt();


        int o1 = 1;
        int o2 = 2; 
        int o3 = 3;
        int o4 = 4;

        if(op == o1)
        {
            int sum = num1 + num2;
            System.out.println("The sum of "+num1+" and "+num2+" is "+sum+".");
        }

        else
        {
            System.out.println("Sucess");
        }

            if(op == o2)
        {
            int dif = num1 - num2;
            System.out.println("The difference of "+num1+" and "+num2+" is "+dif+". ");
        }
        else
        {
            System.out.println("Sucess");
        }

        if(op == o3)
        {
            int pr = num1 * num2;
            System.out.println("The sum of "+num1+" and "+num2+" is "+pr+".");
        }

        else
        {
            System.out.println("Sucess");
        }

        if(op == o4) // division 
        {
            int qu = num1 / num2;
            System.out.println("The sum of "+num1+" and "+num2+" is "+qu+".");
        }

        else
        {
            System.out.println("Sucess");
        }
        sc.close();
    }
}