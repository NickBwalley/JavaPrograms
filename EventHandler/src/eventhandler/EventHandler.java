
package eventhandler;

import javax.swing.JFrame;
public class EventHandler {

    public static void main(String[] args) {
        Apples candy = new Apples();
        candy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        candy.setSize(300,200);
        candy.setVisible(true);
    }
    
}
