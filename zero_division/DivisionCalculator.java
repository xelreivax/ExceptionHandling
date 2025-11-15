package zero_division;

public class DivisionCalculator {

    public static double divide(int a, int b) throws ArithmeticException {

        if (a == 0 || b == 0) {
            throw new ArithmeticException("You cannot divide by zero!");
        }

        return (double) a / b;
    }
}