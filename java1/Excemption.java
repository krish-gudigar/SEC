import java.util.*;

public class Excemption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number 1: ");
            int a = sc.nextInt();

            System.out.print("Enter number 2: ");
            int b = sc.nextInt();

            int result = a % b;
            System.out.println("Result = " + result);
        }
        catch(ArithmeticException e){
            System.out.println("Error: Cannot perform modulus with zero!");
        }
    }
}
