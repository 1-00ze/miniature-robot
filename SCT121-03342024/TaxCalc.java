import java.util.Scanner;

public class TaxCalc {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input gender and salary
        System.out.print("Enter gender (M/F): ");
        char gender = input.next().charAt(0);

        System.out.print("Enter salary: ");
        double salary = input.nextDouble();

        double taxRate = 0;

        // Determine tax rate using nested if
        if (gender == 'M') {
            if (salary < 30000)
                taxRate = 0.10;
            else
                taxRate = 0.15;
        } else {
            if (salary < 25000)
                taxRate = 0.08;
            else
                taxRate = 0.12;
        }

        // Calculate tax and net salary
        double tax = salary * taxRate;
        double net = salary - tax;

        // Display results
        System.out.println("Tax: " + tax);
        System.out.println("Net Salary: " + net);
    }
}


