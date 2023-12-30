import java.util.Scanner;

public class BirthdayParty
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Party bday = new Party();

        System.out.println("\nWelcome to BirthdayParty\n");
        System.out.println("");
        
        System.out.print("Enter number of guest: ");
        int numOfGuests = sc.nextInt();
        bday.setNumGuests(numOfGuests);
        
        //---PrintOut A Message!
        bday.displayMessage();

        sc.close();
    }   
}