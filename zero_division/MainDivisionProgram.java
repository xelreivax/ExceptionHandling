package zero_division;

import javax.swing.JOptionPane;

public class MainDivisionProgram {

    public static void main(String[] args) {

        try {
            int num1 = InputHandler.getInteger("Enter the first integer:");
            int num2 = InputHandler.getInteger("Enter the second integer:");

            double result = DivisionCalculator.divide(num1, num2);

            JOptionPane.showMessageDialog(null,
                "Result: " + num1 + " / " + num2 + " = " + result);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                "Invalid Input! Please enter integer values only.");

        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null,
                "Error: " + e.getMessage());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                "Unexpected Error: " + e.getMessage());
        }
    }
}