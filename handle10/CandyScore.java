package handle10;

import javax.swing.*;

public class CandyScore {
    public static void main(String[] args) {
        int[] scores = new int[5];
        int total = 0;

        for(int i = 0; i < 5; i++) {
            while(true) {
                try {
                    String input = JOptionPane.showInputDialog("Enter score " + (i+1) + ":");
                    if(input == null) return;
                    int score = Integer.parseInt(input);
                    if(score < 0 || score > 100)
                        throw new SsExzemption("Score must be between 0 and 100!");
                    scores[i] = score;
                    total += score;
                    break;
                } catch(NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error: Please enter a numeric score!");
                } catch(SsExzemption e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                }
            }
        }

        double avg = total / 5.0;
        JOptionPane.showMessageDialog(null, "Average score: " + avg);
    }
}