import java.util.Scanner; // scanner

public class Num1nameNum2 
{
    public static void main(String[]args) // main class
    {
        Scanner sc = new Scanner(System.in); // i declare a scanner

        int num1; // integer num1
        int num2; // integer num2
        int sum;  // integer sum
        String name; // String name

        System.out.print("Enter your name: "); // ask the user enter your name
        name = sc.next(); // varaibles = scanner.next

        System.out.print("Enter your value for num1: "); // ask the user to enter what is her/his for num1
        num1 = sc.nextInt(); // integer num1 = scanner.integer

        System.out.print("Enter your value for num2: "); // ask the user to enter what is her/his for num2
        num2 = sc.nextInt(); // integer num2 = scanner.integer

        sum = num1 + num2; // sum = num1 plus num2 

        System.out.println(name+", the sum of "+num1+" and "+num2+" is "+sum+"."); // name and num1 and num2 then sum

        sc.close(); // Scanner.close(); for short
    }
}