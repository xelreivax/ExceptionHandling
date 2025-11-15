package zero_division;

import javax.swing.JOptionPane;

public class InputHandler {

    public static int getInteger(String message) throws NumberFormatException {
        String input = JOptionPane.showInputDialog(message);
        return Integer.parseInt(input);
    }
}