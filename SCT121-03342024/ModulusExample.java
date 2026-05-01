import java.util.Scanner;

public class ModulusExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // Check even or odd
        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

        // Check divisibility by 5
        if (num % 5 == 0)
            System.out.println("Divisible by 5");
        else
            System.out.println("Not divisible by 5");

        // Display remainder when divided by 3
        System.out.println("Remainder when divided by 3: " + (num % 3));
    }
}

    

