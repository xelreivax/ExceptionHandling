package handle6;

import javax.swing.JOptionPane;

public class BankMain {

    public static void main(String[] args) {

        Account account = new Account(1000);
        StringBuilder output = new StringBuilder();

        try {
            String prompt = "Current balance: " + account.getBalance() + "\nEnter withdrawal amount:";
            String input = JOptionPane.showInputDialog(prompt);
            double amount = Double.parseDouble(input);

            output.append("Current balance: ").append(account.getBalance()).append("\n");
            output.append("Enter withdrawal amount: ").append(amount).append("\n");

            account.withdraw(amount);

            output.append("Withdrawal successful. Remaining balance: ")
                  .append(account.getBalance()).append("\n");

        } catch (InsBalanceEx e) {
            output.append("Transaction error: ").append(e.getMessage()).append("\n");

        } catch (NumberFormatException e) {
            output.append("Transaction error: Invalid amount entered!\n");

        } finally {
            output.append("Transaction completed.");
        }

        JOptionPane.showMessageDialog(null, output.toString());
    }
}