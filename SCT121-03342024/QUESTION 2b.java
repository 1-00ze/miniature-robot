import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input numbers
        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        // Relational operations
        System.out.println(a + " > " + b + ": " + (a > b));
        System.out.println(a + " < " + b + ": " + (a < b));
        System.out.println(a + " == " + b + ": " + (a == b));

        // Logical operations
        System.out.println("Both even: " + (a % 2 == 0 && b % 2 == 0));
        System.out.println("At least one positive: " + (a > 0 || b > 0));
    }
}
    

