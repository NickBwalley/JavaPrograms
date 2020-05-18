
package gui_sumofnumbers;

import javax.swing.JOptionPane;

public class GUI_SumOfNumbers {

    public static void main(String[] args) {
        String Num1 = JOptionPane.showInputDialog("Enter First Number: ");
        String Num2 = JOptionPane.showInputDialog("Enter Second Number: ");
        
        int Number1 = Integer.parseInt(Num1);
        int Number2 = Integer.parseInt(Num2);
        int Result = Number1 + Number2;
        
        JOptionPane.showMessageDialog(null, "Result is: " +Result, "Addition", JOptionPane.PLAIN_MESSAGE);
        
    }
    
}
