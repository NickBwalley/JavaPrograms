package gui_2;
import javax.swing.JFrame;
public class GUI_2 {

    public static void main(String[] args) {
        Window nicky = new Window();
        nicky.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nicky.setSize(400,300);
        nicky.setLocation(400,100);
        nicky.setVisible(true);
    }

}
