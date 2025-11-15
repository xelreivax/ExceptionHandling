package handle8;

   import javax.swing.*;

   public class PhoneNumber {
	    public static void main(String[] args) {
	        String input = JOptionPane.showInputDialog("Enter contact number:");
	        try {
	            if(input == null) return;
	            if(!input.startsWith("09") || input.length() != 11)
	                throw new InvalidContactsEx("Invalid contact number format!");
	            JOptionPane.showMessageDialog(null, "Contact number accepted: " + input);
	        } catch(InvalidContactsEx e) {
	            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
	        }
	    }
	}