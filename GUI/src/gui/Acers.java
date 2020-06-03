package gui;
import javax.swing.JOptionPane;
public class Acers {
    
    public void guiAddNumbers(){
        String first;
        String second;
        String operator;
        
        first = JOptionPane.showInputDialog("Enter Your First Number: ");
        operator = JOptionPane.showInputDialog("Enter Operator(+,-,*,/): ");
        second = JOptionPane.showInputDialog("Enter Second Numbers: ");
        
        int firstNumber;
        int secondNumber;
        char Op;
        int result;
        
        firstNumber = Integer.parseInt(first);
        secondNumber = Integer.parseInt(second);
        Op = operator.charAt(0);
        
        switch(Op){
            case '+':
                result = firstNumber + secondNumber;
                JOptionPane.showMessageDialog(null, "Answer is: "+result, "Calculator", JOptionPane.PLAIN_MESSAGE);
                break;
            case '-':
                result = firstNumber - secondNumber;
                JOptionPane.showMessageDialog(null, "Answer is: "+result, "Calculator", JOptionPane.PLAIN_MESSAGE);
                break;
            case '*':
                result = firstNumber * secondNumber;
                JOptionPane.showMessageDialog(null, "Answer is: "+result, "Calculator", JOptionPane.PLAIN_MESSAGE);
                break;
            case '/':
                result = firstNumber / secondNumber;
                JOptionPane.showMessageDialog(null, "Answer is: "+result, "Calculator", JOptionPane.PLAIN_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid Operator!..", "Calculator", JOptionPane.PLAIN_MESSAGE);
                
        }
        
    JOptionPane.showMessageDialog(null, "Thank-You: \t Nick Bwalley", "Calculator", JOptionPane.OK_CANCEL_OPTION);
                
        
    }

}
