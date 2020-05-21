package gui;
import javax.swing.JOptionPane;
public class Acers {
    
    public void jOptionPopUp(){
        String firstNumber;
        String secondNumber;
        int first;
        int second;
        int result;
        
        firstNumber = JOptionPane.showInputDialog(null, "Enter First Number: ");
        secondNumber = JOptionPane.showInputDialog(null, "Enter Second Number: ");
        
        first = Integer.parseInt(firstNumber);
        second = Integer.parseInt(secondNumber);
        result = first + second;
        
        JOptionPane.showMessageDialog(null, "Answer: "+result, "Results", JOptionPane.PLAIN_MESSAGE);
        
    }

}
