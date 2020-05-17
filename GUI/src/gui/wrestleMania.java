
package gui;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class wrestleMania extends JFrame{
    private JLabel TagTeamChampions;
    
    public wrestleMania(){
        super("WrestleMania!");
        setLayout(new FlowLayout());
        TagTeamChampions = new JLabel("Jimmy Uso and Jay Uso");
        TagTeamChampions.setToolTipText("The USOS");
        add(TagTeamChampions);
    }
}
