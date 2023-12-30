public class OddOrEvenChecker {
    public static void main(String []args) {
        long num = 17;

        long ans = num % 2;

        if(ans == 1) {
            System.out.println("odd");
        } else {
            System.out.println("Even");
        }
    }
}