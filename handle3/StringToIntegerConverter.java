package handle3;

import javax.swing.JOptionPane;

public class StringToIntegerConverter {

    public static void main(String[] args) {

        StringBuilder output = new StringBuilder();

        try {
            String input = JOptionPane.showInputDialog("Enter a numeric value:");
            output.append("Enter a numeric value: ").append(input).append("\n");

            int value = Integer.parseInt(input); 
            output.append("Converted integer: ").append(value);

        } catch (NumberFormatException e) {
            output.append("Error: Please enter a valid integer!\n");

        } catch (Exception e) {
            output.append("Error: ").append(e.getMessage()).append("\n");
        }

        JOptionPane.showMessageDialog(null, output.toString());
    }
}
