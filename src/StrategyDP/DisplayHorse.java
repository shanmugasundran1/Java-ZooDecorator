package StrategyDP;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class DisplayHorse implements EquusDisplayStrategy{
    private javax.swing.JLabel horse;
    URL urlHorse = getClass().getResource("/Image/Horse.png");
    ImageIcon horseIcon = new ImageIcon(urlHorse);
    
    public DisplayHorse(JLabel horse2) {
        horse = horse2;
    }

    @Override
    public void display() {
    	horse.setIcon(horseIcon);
    	horse.setVisible(true);
    	horse.revalidate();
    }
}
