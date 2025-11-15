package zero_division;


public class DivisionCalculator {

    public static double divide(int numerator, int denominator) throws ArithmeticException {

        if (numerator == 0 || denominator == 0) {
            throw new ArithmeticException("Division by zero!");
        }

        return (double) numerator / denominator;
    }
}