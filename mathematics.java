import java.util.Scanner;

public class mathematics
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int sum;

        System.out.println("-----------------------------------");
        System.out.println("\nMath Class\n");
        System.out.println("");

        
        System.out.println("Please enter your preferred operation. '1' for addition, '2' for subtraction.");
        System.out.println("'3' for multiplication, '4' for division");
        System.out.println("");

        System.out.print("Enter your desired number: ");
        int response = sc.nextInt();

        while(response < 6)
        {
            switch(response)
            {
                case 1 :
    
                System.out.println("----------------------------------------");
                System.out.println("\nAdditon\n");
                System.out.print("Enter your value for num1: ");
                num1 = sc.nextInt();
                System.out.print("Enter your value for num2: ");
                num2 = sc.nextInt();
    
                sum = num1 + num2;
    
                System.out.print("------------------------------------------");
                System.out.println("");
                System.out.println("The Answer: "+num1+" + "+num2+" = "+sum);
                break;
    
                case 2 :
    
                System.out.println("----------------------------------------");
                System.out.println("\nSubtraction\n");
                System.out.print("Enter your value for num1: ");
                num1 = sc.nextInt();
                System.out.print("Enter your value for num2: ");
                num2 = sc.nextInt();
    
                sum = num1 - num2;
    
                System.out.print("------------------------------------------");
                System.out.println("");
                System.out.println("The Answer: "+num1+" - "+num2+" = "+sum);
                break;

                case 3 :
                System.out.println("----------------------------------------");
                System.out.println("\nMultiplication\n");
                System.out.print("Enter your value for num1: ");
                num1 = sc.nextInt();
                System.out.print("Enter your value for num2: ");
                num2 = sc.nextInt();
    
                sum = num1 * num2;
    
                System.out.print("------------------------------------------");
                System.out.println("");
                System.out.println("The Answer: "+num1+" x "+num2+" = "+sum);
                break;

                case 4 :
                System.out.println("----------------------------------------");
                System.out.println("\nDivision\n");
                System.out.print("Enter your value for num1: ");
                num1 = sc.nextInt();
                System.out.print("Enter your value for num2: ");
                num2 = sc.nextInt();
    
                sum = num1 / num2;
    
                System.out.print("------------------------------------------");
                System.out.println("");
                System.out.println("The Answer: "+num1+" - "+num2+" = "+sum);
                break;
            }
        }
        sc.close();
    }
}