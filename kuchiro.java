import java.util.Scanner;

public class kuchiro {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        char op;
        int num1;
        int num2;
        int ans;

        System.out.print("Enter value for num1: ");
        num1 = sc.nextInt();

        System.out.print("Enter value for num2: ");
        num2 = sc.nextInt();

        System.out.println("------------------------------------");
        System.out.println("Plus +");
        System.out.println("Minus -");
        System.out.println("TImes *");
        System.out.println("Devide /");
        System.out.println("------------------------------------");
        System.out.println();

        System.out.print("Selected the operator: ");
        op = sc.next().charAt(0);

        switch(op) {
            case '+':
            ans = num1 + num2;
            System.out.println();
            System.out.println("The answer: "+ans);
            break;

            case '-':
            ans = num1 - num2;
            System.out.println();
            System.out.println("The answer: "+ans);
            break;

            case '*':
            ans = num1 * num2;
            System.out.println();
            System.out.println("The answer: "+ans);
            break;

            case '/':
            ans = num1 / num2;
            System.out.println();
            System.out.println("The answer: "+ans);
            break;
        }
        sc.close();
    }
}