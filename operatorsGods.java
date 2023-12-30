import java.util.Scanner; // Scanner 

public class operatorsGods 
{ 
    public static void main (String [] args) // main class
    {
        int num1; // integer value
        int num2; // integer value
        int op;  // integer value
    Scanner sc = new Scanner (System.in); // i declare a scanner
    
    System.out.print("Enter the first number:"); // ask the user whats is number
    num1 = sc.nextInt(); // integer = scanner.nextInteger
    
    System.out.print("Then enter the second number:"); // ask the user whats is second number
    num2 = sc.nextInt(); // integer = scanner.nextInteger

    // operation
    
    System.out.println("Please enter your preferred operation. '1' for addition, '2' for subtraction."); 
    
    System.out.println("'3' for multiplication, '4' for division");
    
    System.out.println("Note that this calculator don't support floating numbers or decimals.");
    
    op = sc.nextInt(); // operation = scanner.nextInteger
     // op short for operation
    int o1 = 1; //addition
    int o2 = 2; // subtraction
    int o3 = 3; // multiplication
    int o4 = 4; // division

    if(op == o1) // addition 
    {
        int sum = num1 + num2; // sum +
        System.out.println("The sum of "+num1+" and "+num2+" is "+sum+"."); //print
    }
    else
    {
        System.out.println("Sucess"); // print sucesss
    }
    if(op == o2){ // subtraction
        int dif = num1 - num2; // diff -
        System.out.println("The difference of "+num1+" and "+num2+" is "+dif+". "); // print 
    }
    else{
        System.out.println("Sucess"); // sucess
    }
    if(op == o3) // multiplication 
    {
        int pr = num1 * num2; // pr *
        System.out.println("The sum of "+num1+" and "+num2+" is "+pr+"."); // print
    }
    else{
        System.out.println("Sucess"); // sucess 
    }
    if(op == o4) // division 
    {
        int qu = num1 / num2; // qu 
        System.out.println("The sum of "+num1+" and "+num2+" is "+qu+"."); // pirnt
    }
    else{
        System.out.println("Sucess"); // sucesss
    }
     sc.close(); // i close it
    
    }
}