public class EvenNumbers {
    public static void main(String[] args) {

        int sum = 0; // Stores sum of even numbers
        int count = 0; // Counts how many even numbers

        // Loop from 1 to 100
        for (int i = 1; i <= 100; i++) {

            // Check if number is even
            if (i % 2 == 0) {
                sum += i; // Add to sum
                count++; // Increase count
            }
        }

        // Calculate average
        double average = (double) sum / count;

        // Display results
        System.out.println("Sum: " + sum);
        System.out.println("Count: " + count);
        System.out.println("Average: " + average);
    }
}

    

