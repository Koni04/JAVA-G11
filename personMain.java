import java.util.Scanner;

public class personMain
{
    public static void main(String [] args)
    {
        try (Scanner inputmethod = new Scanner(System.in)) {
            System.out.println("To begin using the program enter 1! if you don't want to press 2 otherwise.");
            System.out.println("-----------------------------------------------------");
            System.out.print("Enter your desired number: ");
            
            int method = inputmethod.nextInt();
            System.out.println("-----------------------------------------------------");
            
            while(method < 3)
            {
            switch(method)
            {
            case 1 :
            {
            Person p = new Person();
            try (Scanner input = new Scanner(System.in)) {
                System.out.print("What is the name of your person? Input: ");
                String personName = input.nextLine();
                p.setName(personName);

                System.out.print("What is the age of your person? Input: ");
                int personAge = input.nextInt();
                p.setAge(personAge);

                System.out.print("When is the birth year of your person? Input: ");
                int personbirthYear = input.nextInt();
                p.setYear(personbirthYear);

                System.out.print("When is the birth month of your person? Input: ");
                try (Scanner input2 = new Scanner(System.in)) {
                    String personbirthMonth = input2.nextLine();
                    p.setMonth(personbirthMonth);
                }
                System.out.print("When is the birth day of your person? Input: ");
                int personbirthDay = input.nextInt();
                p.setDay(personbirthDay);
            }
            
            System.out.println("-----------------------------------------------------");
            p.getInfo();
            System.out.println("-----------------------------------------------------");
            break;
            }
            case 2 :
            {
                System.out.println("Thank you for using the program! The program will now close...");
                System.out.println("-----------------------------------------------------");
                System.exit(0);
            }
            }
            System.out.println("Do you wanna try placing new attributes to the person? If yes type in 1, otherwise 2: ");
            System.out.println("-----------------------------------------------------");
            method = inputmethod.nextInt();
            System.out.println("-----------------------------------------------------");
            }
        }
    }
}