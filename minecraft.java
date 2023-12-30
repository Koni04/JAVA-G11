import java.util.Scanner;

public class minecraft 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("oopen mo ung server? ");
        String response = sc.next();
        
        if (response.equals("yes"))
        {
            System.out.println("Nice! grind nakuh...");
        }
        else 
        {
            System.out.println("Open nyona kasi!...");
        }
        sc.close();
    }
}