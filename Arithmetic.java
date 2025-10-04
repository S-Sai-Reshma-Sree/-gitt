public class Arithmetic{
    public static void main(String[] args) {
        // Declare two integer variables
        int number1 = 20;
        int number2 = 5;

        // Perform arithmetic operations
        int sum = number1 + number2;
        int difference = number1 - number2;
        int product = number1 * number2;

        // For division, casting to double ensures floating-point result
        double quotient = (double) number1 / number2;

        // Print the results
        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);
        System.out.println("Addition (Sum): " + sum);
        System.out.println("Subtraction (Difference): " + difference);
        System.out.println("Multiplication (Product): " + product);
        System.out.println("Division (Quotient): " + quotient);
    }
}