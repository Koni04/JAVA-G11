import java.util.Scanner; // i declare scanner

public class LABEXER05A1
{
    public static void main (String[]args) // main class
    {
        Scanner sc = new Scanner(System.in); // same here

        String name; // value of String 
        int num1; // integer value
        int num2; // integer value

        System.out.print("Enter your initials: "); // ask the user initials
        name = sc.next(); // string name value = scanner for short.next open close parentheses

        System.out.print("Please enter the first number:"); // ask the user to enter a value for num1
        num1 = sc.nextInt(); // integer value = scanner for short.next open close parentheses

        System.out.print("Please enter the second number"); // ask the user to enter a value for num2
        num2 = sc.nextInt(); // integer value = scanner for short.next open close parentheses

        System.out.println("hello,"+name+"!."); // s.o.p hello and your name

        if (num1 == num2) // if num1 == num2
        {
            System.out.print("Num1 and Num2 are equal!"); //it will print if num1 and num2 is equal
        }
        else 
        {
            System.out.print("Num1 and Num2 are not equal!"); // if not namn
        }
    
        sc.close(); // i close a Scanner for short sc
    }
}