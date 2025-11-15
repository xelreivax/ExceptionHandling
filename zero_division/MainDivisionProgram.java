package zero_division;

import javax.swing.JOptionPane;

public class MainDivisionProgram {

    public static void main(String[] args) {

        StringBuilder output = new StringBuilder();

        try {
            int numerator = InputHandler.getInteger("Enter numerator:");
            output.append("Enter numerator: ").append(numerator).append("\n");

            int denominator = InputHandler.getInteger("Enter denominator:");
            output.append("Enter denominator: ").append(denominator).append("\n");

            double result = DivisionCalculator.divide(numerator, denominator);

            output.append("Result: ").append(result).append("\n");

        } catch (NumberFormatException e) {
            output.append("Error: Invalid input! Only integers allowed.\n");

        } catch (ArithmeticException e) {
            output.append("Error: ").append(e.getMessage()).append("\n");

        } catch (Exception e) {
            output.append("Error: ").append(e.getMessage()).append("\n");
        }

        output.append("Computation Complete");

        JOptionPane.showMessageDialog(null, output.toString());
    }
}