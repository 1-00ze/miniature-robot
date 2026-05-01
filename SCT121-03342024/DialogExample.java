import javax.swing.JOptionPane;

public class DialogExample {
    public static void main(String[] args) {

        // Input dialogs
        String food = JOptionPane.showInputDialog("Enter your favorite food:");
        String color = JOptionPane.showInputDialog("Enter your favorite color:");

        // Output dialog
        JOptionPane.showMessageDialog(null,
                "Your favorite food is " + food + 
                " and favorite color is " + color);
    }
}

