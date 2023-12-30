import java.util.Scanner;

public class anime
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        String[]character = {"luffy", "zoro", "goku", "nami", "vegeta"};

        System.out.println("------------------------------------");
        System.out.print("["+character[0]+","+character[1]+","+character[2]+","+character[3]+","+character[4]+"]");
        System.out.println("");

        System.out.println("");
        System.out.print("Choose a number between 0 to 4: ");
        String response = sc.next();

        if(response.equals("1"))
        {
            System.out.println(character[0]);
        }
        else if(response.equals("2"))
        {
            System.out.println(character[1]);
        }
        else if(response.equals("3"))
        {
            System.out.println(character[2]);
        }
        else if(response.equals("4"))
        {
            System.out.println(character[3]);
        }
        else if(response.equals("5"))
        {
            try
            {
                System.out.println(character[99]);
            }
            catch(IndexOutOfBoundsException e)
            {
                System.out.println("Invalid input. This program has been terminated.");
            }
        }
        sc.close();
    }
}