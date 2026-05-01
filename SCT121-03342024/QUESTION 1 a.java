import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        // Create Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt user for full name
        System.out.print("Enter your full name: ");
        String name = input.nextLine(); // Reads full line

        // Prompt user for age
        System.out.print("Enter your age: ");
        int age = input.nextInt(); // Reads integer

        // Prompt user for height
        System.out.print("Enter your height in meters: ");
        double height = input.nextDouble(); // Reads decimal

        // Display output
        System.out.println("\nWelcome " + name + "! You are " + age + 
                           " years old and " + height + " meters tall.");

        // Close scanner (fixes resource leak error )
        input.close();
    }
}