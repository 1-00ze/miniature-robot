import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        // Predefined array
        int[] arr = {23, 45, 12, 67, 34, 89, 56, 78, 90, 33};

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number to search: ");
        int key = input.nextInt();

        int index = -1;      // Stores position if found
        int comparisons = 0; // Counts comparisons

        // Loop through array
        for (int i = 0; i < arr.length; i++) {
            comparisons++;

            if (arr[i] == key) {
                index = i; // Save index
                break;
            }
        }

        // Display result
        if (index != -1)
            System.out.println("Found at index " + index);
        else
            System.out.println("Element not found");

        System.out.println("Comparisons: " + comparisons);
    }
}

    

