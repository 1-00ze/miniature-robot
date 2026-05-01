import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] marks = new int[8]; // Array for 8 students

        int sum = 0;
        int pass = 0;
        int fail = 0;

        int highest = Integer.MIN_VALUE; // Smallest possible value
        int lowest = Integer.MAX_VALUE; // Largest possible value

        // Input marks
        for (int i = 0; i < 8; i++) {
            System.out.print("Enter mark for student " + (i + 1) + ": ");
            marks[i] = input.nextInt();

            sum += marks[i]; // Add to total

            // Count pass/fail
            if (marks[i] >= 50)
                pass++;
            else
                fail++;

            // Find highest
            if (marks[i] > highest)
                highest = marks[i];

            // Find lowest
            if (marks[i] < lowest)
                lowest = marks[i];
        }

        // Calculate average
        double avg = (double) sum / 8;

        // Display results
        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Passed: " + pass);
        System.out.println("Failed: " + fail);

        // Display in reverse order
        System.out.println("Reverse order:");
        for (int i = 7; i >= 0; i--) {
            System.out.print(marks[i] + " ");
        }
    }
}

    

