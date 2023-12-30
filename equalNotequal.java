import java.util.Scanner; // i declare a scanner 

public class equalNotequal  
{
    public static void main(String[]args)  // here is a main class 
    {
        Scanner sc = new Scanner (System.in); // i declare a scanner.sc 
        int num1;  // num1
        int num2;  // num2

        System.out.print("Eneter value for num1: "); // here is will ask the user what value for num1
        num1 = sc.nextInt(); // int value which is num1 scanner.nextInteger

        System.out.print("Enter value for num2: "); // here is will ask the user what value for num2
        num2 = sc.nextInt(); // int value which is num2 scanner.nextInteger

        if (num1 == num2)   // if num1 and num 2 are equal
        {
            System.out.println("EQUAL!"); // this s.o.p will print eqaul if num1 and num2 are equal
        }
        else // elsee
        {
            System.out.println("NOT EQUAL!"); // this s.o.p will print eqaul if num1 and num2 are  not equal
        }

        sc.close(); // this is i close a scanner


    }
}