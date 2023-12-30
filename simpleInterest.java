import java.util.Scanner;

public class simpleInterest
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter");


        System.out.println("What is missing from the given?");

        System.out.println("");
        System.out.println("Type " + "\"I\"" +" if the interest is missing.");
        System.out.println("Type " + "\"r\"" +" if the rate is missing.");
        System.out.println("Type " + "\"p\"" +" if the Principal is missing.");
        System.out.println("Type " + "\"t\"" +" if the time is missing.");
        System.out.println("");

        System.out.print("Type the letter that is missing: ");
        char unKnown = sc.next().charAt(0);

        switch(unKnown)
        {
            case 'I':

            System.out.println(" Interest is the unknown.");
            System.out.println("");
            System.out.println("Before continuing, please convert everything to decimal or a whole number!");
            System.out.println("");

            System.out.print("Principal: ");
            double P = sc.nextDouble();

            System.out.print("Rate: ");
            double r = sc.nextDouble();

            System.out.print("Time(in years): ");
            double t = sc.nextDouble();

            int I = (int) (P*r*t);
            System.out.println("The interest is: " + I + "pesos"); 
        }
        switch(unKnown)
        {
            case 'r':
            System.out.println("rate is the unknown.");
            System.out.println("rate is the unknown.");
            System.out.println("");
            System.out.println("Before continuing, please convert everything to decimal or a whole number!");
            System.out.println("");

            System.out.print("Interest: ");
            double I = sc.nextDouble();

            System.out.print("Principal: ");
            double P = sc.nextDouble();

            System.out.print("Time(in years): ");
            double t = sc.nextDouble();

            double r = (I/(P*t));
            System.out.println("The rate is: " + r);
        }
        switch(unKnown)
        {
            case 'p':
            System.out.println(" Principal is the unknown.");
            System.out.println("");
            System.out.println("Before continuing, please convert everything to decimal or a whole number!");
            System.out.println("");

            System.out.print("Interest: ");
            double I = sc.nextDouble();

            System.out.print("rate: ");
            double r = sc.nextDouble();

            System.out.print("Time(in years): ");
            double t = sc.nextDouble();

            int P = (int) (I/(r*t));
            System.out.println("The Principal is: " + P);

        }
        switch(unKnown)
        {
            case 't':
                
            System.out.println(" time is the unknown.");
            System.out.println("");
            System.out.println("Before continuing, please convert everything to decimal or a whole number!");
            System.out.println("");

            System.out.print("Interest: ");                
            double I = sc.nextDouble();

            System.out.print("Principal: ");
            double P = sc.nextDouble();

            System.out.print("Rate: ");
            double r = sc.nextDouble();

            System.out.print("(Exact Interest , Ordinary Interest)");
            System.out.println("");
            System.out.println("360 = o");
            System.out.println("365 = e");

            System.out.print("Enter Value: ");
            String response = sc.next();

            int e = 365;
            int o = 360;

            if(response.equals("o"))
            {
                int t = (int) (o*I/(P*r));
                System.out.println("The time(in years) is: " + t);
            }
            else
            if(response.equals("e"))
            {
                int t = (int) (e*I/(P*r));
                System.out.println("The time(in years) is: "+t);
            }
            else
            {
                System.out.println("invalid");
            }
        }
        sc.close();
    }
}