package handle7;

import javax.swing.*;

public class ProdApp {
    public static void main(String[] args) {
        String[] products = {"Laptop","Phone","Tablet","Headphones","Camera"};
        double[] prices = {1200,800,400,150,600};

        while(true){
            try{
                String input = JOptionPane.showInputDialog("Enter product index (0-4):");
                if(input==null) break;
                int index = Integer.parseInt(input);
                JOptionPane.showMessageDialog(null,"Product: "+products[index]+"\nPrice: $"+prices[index]);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Error: Please enter a numeric index!");
            }catch(ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null,"Error: Index out of range!");
            }
        }
        JOptionPane.showMessageDialog(null,"Inventory lookup complete.");
    }
}