package school.mjc.stage0.module3.task4;

public class FormulaCreator {
    public static void main(String[] args) {
        // Declaring necessary variables
        double a = 2.0;  // Example value
        double b = 3.0;  // Example value
        // Implementing the formula while maintaining order of operations
        double result = ((9 * (a * a)) - (5 * b) + 2 + a - 7) * ((a + b - (4 * a * b)) / 2);

        // Printing the result
        System.out.println("Result: " + result);
    }
}
