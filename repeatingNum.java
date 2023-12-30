import java.util.Scanner;

public class repeatingNum 
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in); 
        {
            System.out.print("Enter number of repeats: ");

            int repeat = sc.nextInt();
            
            koni(repeat);

            sc.close();
        }
    }
    private static void koni(int num)
    {
        int i = 1;

        while (i <= num)
        {
            System.out.println("access");

            i++;
        }
    }
}