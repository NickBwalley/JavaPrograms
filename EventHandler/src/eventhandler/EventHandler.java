
package eventhandler;

import javax.swing.JFrame;
public class EventHandler {

    public static void main(String[] args) {
        Mango sweet = new Mango();
        sweet.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sweet.setSize(500,400);
        sweet.setVisible(true);
    }
    
}
