import java.util.Scanner;

public class kyle {
    public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);

      System.out.print("Enter a grade:");

      int n = scan.nextInt();
      System.out.println(n);
      
      if(n >= 90 && n <=100) {

        System.out.println("Your grade A"); //exelence

      } else if(n >= 80 && n < 90) {

        System.out.println("Your grade is B");  //passed

      } else if(n >= 70 && n < 80) {

        System.out.println("Your grade is C"); //high poor grade

      } else if(n >= 65 && n < 70) {

        System.out.println("Your grade is D");  // low poor grade

      } else if (n >= 0 && n < 65) {

        System.out.println("Your grade is F"); // poor grade

      } else {

         System.out.println("The number that you entered is not in the range");
      }
      scan.close();
    }
}