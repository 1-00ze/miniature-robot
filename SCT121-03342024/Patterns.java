public class Patterns {
    public static void main(String[] args) {

        // Pattern 1 (increasing stars)
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Print stars
            }

            System.out.println(); // Move to next line
        }

        System.out.println();

        // Pattern 2 (decreasing stars)
        for (int i = 5; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
    

