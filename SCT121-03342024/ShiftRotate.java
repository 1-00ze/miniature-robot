import java.util.Scanner;
import java.util.Arrays;

public class ShiftRotate {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] arr = new int[6]; // Array of size 6

        // Input elements
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter number: ");
            arr[i] = input.nextInt();
        }

        System.out.println("Original: " + Arrays.toString(arr));

        // RIGHT SHIFT
        int last = arr[5]; // Store last element

        for (int i = 5; i > 0; i--) {
            arr[i] = arr[i - 1]; // Shift elements right
        }

        arr[0] = last; // Put last element at front

        System.out.println("Right shift: " + Arrays.toString(arr));

        // LEFT ROTATE BY 2
        for (int k = 0; k < 2; k++) {

            int first = arr[0]; // Store first element

            for (int i = 0; i < 5; i++) {
                arr[i] = arr[i + 1]; // Shift left
            }

            arr[5] = first; // Move first to end
        }

        System.out.println("Left rotate by 2: " + Arrays.toString(arr));
    }
}

    

