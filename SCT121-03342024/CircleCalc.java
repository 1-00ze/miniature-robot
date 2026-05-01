import java.util.Scanner;

public class CircleCalc {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask user for radius
        System.out.print("Enter radius: ");
        double r = input.nextDouble();

        // Calculate values
        double diameter = 2 * r;
        double circumference = 2 * Math.PI * r; // Using Math.PI
        double area = Math.PI * Math.pow(r, 2); // Using Math.pow

        // Display results with 2 decimal places
        System.out.printf("Diameter = %.2f\n", diameter);
        System.out.printf("Circumference = %.2f\n", circumference);
        System.out.printf("Area = %.2f\n", area);
    }
}
    

