import java.util.Scanner;

public class dst {
    public static void main(String [] args) 
    {

        Scanner cal = new Scanner(System.in);
        System.out.println("Which of the following information you are looking for? \nType 'S' for Speed \nType 'T' for Time \nType 'D' for Distance");
        char unknown = cal.next().charAt(0);

        switch (unknown) {
            case 'S':
                System.out.println("You are looking for speed");

                System.out.print("Enter the given distance: ");
                double d1 = cal.nextDouble();

                System.out.print("Enter the given time: ");
                double t1 = cal.nextDouble();
                
                double s1 = d1/t1;
                System.out.println(s1);
                break;

            case 'T':
                System.out.println("You are looking for time");

                System.out.print("Enter the given distance: ");
                double d2 = cal.nextDouble();

                System.out.println("Enter the given speed");
                double s2 = cal.nextDouble();

                double t2 = d2/s2;
                System.out.println(t2);
                break;

            case 'D':
                System.out.println("You are looking for distance");

                System.out.print("Enter the given speed");
                double s3 = cal.nextDouble();

                System.out.println("Enter the given time");
                double t3 = cal.nextDouble();

                double d3 = s3*t3;
                System.out.println(d3);
                break;

            default:
                System.out.println("WRONG INPUT!");
        }
        cal.close();
    }
}