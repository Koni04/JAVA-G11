import java.util.Scanner;

public class mathClass
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------------------");
        System.out.println("");

        System.out.println("Accumulate");
        System.out.println("");

        System.out.print("Simple and general annuaties");
        System.out.println("");
        System.out.println("Present and future values");
        System.out.println("");

        System.out.println("Press 1 to view an Example..");
        System.out.println("");

        System.out.print("About: ");
        String response = sc.nextLine();

        if(response.equals("1"))
        {
            System.out.println("");
            System.out.println("Payment Interval- The time between succesive payment.");
            System.out.println("");
            System.out.println("Term of annuity- The number  of periods from the first payment interval to the payment interval.");
            System.out.println("");
            System.out.println("Simple annuity- Payment intervaland interest conversion period are the same.");
            System.out.println("");
            System.out.println("General annuity- Payment interval and interest conversion periods are unequal.");
            System.out.println("");
            System.out.println("Ordinary annuity- Periodic payment are made at the end of the payment intevals.");
            System.out.println("");
            System.out.println("Annuity due- Periodic payment are made at the beggining of payment intervals.");
            System.out.println("");
        }
        else 
        {
            System.out.println("Invalid");
        }
        System.out.println("Press x to view a Proccess");
        String res = sc.nextLine();

        if(res.equals("x"))
        {
            System.out.println("");
            System.out.println("Annuity- Periodic payment is due at some later date.");
            System.out.println("");
            System.out.println("Accumulation phase- The time money is put into annuity it is released.");
            System.out.println("");
            System.out.println("Distribution phase- tyhe time after the release of annuity.");
            System.out.println("");
        }
        else 
        {
            System.out.println("Invalid");
        }
        sc.close();
    }
}