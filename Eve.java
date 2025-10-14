import java.util.Scanner; // Import the Scanner class to read user input

public class Eve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.print("Enter an integer: "); // Prompt the user for input
        int number = scanner.nextInt(); // Read the integer entered by the user

        // Check if the number is even or odd using the modulo operator
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        scanner.close(); // Close the scanner to release resources
    }
}