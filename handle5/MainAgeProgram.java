package handle5;

import javax.swing.JOptionPane;

public class MainAgeProgram {

    public static void main(String[] args) {

        StringBuilder output = new StringBuilder();

        try {
            String input = JOptionPane.showInputDialog("Enter your age:");
            int age = Integer.parseInt(input);

            output.append("Enter your age: ").append(age).append("\n");

            AgeValidator.validateAge(age);

            output.append("Access granted.");

        } catch (InvalidAgeEx e) {
            output.append("Error: ").append(e.getMessage()).append("\n");

        } catch (NumberFormatException e) {
            output.append("Error: Invalid input! Please enter a valid number.\n");

        } catch (Exception e) {
            output.append("Error: ").append(e.getMessage()).append("\n");
        }

        JOptionPane.showMessageDialog(null, output.toString());
    }
}
