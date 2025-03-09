package school.mjc.stage0.module3.task4;

public class FormulaCreator {
    public static void main(String[] args) {
        // Declaring necessary variables
        double a = 2.0;  // Example value
        double b = 3.0;  // Example value

        // First expression inside parentheses
        double firstExpression = (9 * Math.pow(a, 2)) - (5 * b) + 2 + a - 7;

        // Second expression inside parentheses (fraction)
        double secondExpression = (a + b - 4 * a * b) / 2;

        // Final formula result
        double result = firstExpression * secondExpression;

        // Printing the result
        System.out.println("Result: " + result);
    }
}
