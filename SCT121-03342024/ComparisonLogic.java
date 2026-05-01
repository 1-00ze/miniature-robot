import java.util.Scanner;
public class ComparisonLogic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 1. Accept two integers from the user
        System.out.print("Enter first number: ");
        int first = input.nextInt();
          System.out.print("Enter second number: ");
        int second = input.nextInt();
          System.out.println("\n--- Comparison Results ---");
        // 2. Relational Operators (True/False)
        System.out.println("First number is greater than second: " + (first > second));
        System.out.println("First number is less than second: " + (first < second));
        System.out.println("First number is equal to second: " + (first == second));
        // 3. Logical AND (&&) - Check if both are even
        // A number is even if remainder when divided by 2 is 0
        boolean bothEven = (first % 2 == 0) && (second % 2 == 0);
        System.out.println("Both numbers are even: " + bothEven);
        // 4. Logical OR (||) - Check if at least one is positive
        boolean atLeastOnePositive = (first > 0) || (second > 0);
        System.out.println("At least one number is positive: " + atLeastOnePositive);
        input.close();
        }}
