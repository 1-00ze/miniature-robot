import javax.swing.JOptionPane;

public class ArithmeticCalculator {
    public static void main(String[] args) {

        // Accept input as strings
        String num1Str = JOptionPane.showInputDialog("Enter first number:");
        String num2Str = JOptionPane.showInputDialog("Enter second number:");

        // Convert to integers
        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);

        // Perform calculations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;

        // Display results
        JOptionPane.showMessageDialog(null,
                "Sum: " + sum +
                "\nDifference: " + difference +
                "\nProduct: " + product +
                "\nQuotient: " + quotient);
    }
}
    

