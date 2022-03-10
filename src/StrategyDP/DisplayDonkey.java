package StrategyDP;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class DisplayDonkey implements EquusDisplayStrategy{
    URL urlDonkey = getClass().getResource("/Image/Donkey.png");
    ImageIcon donkeyIcon = new ImageIcon(urlDonkey);
    private javax.swing.JLabel donkey;
    
    public DisplayDonkey(JLabel donkey) {
        this.donkey = donkey;
    }

    @Override
    public void display() {
    	donkey.setIcon(donkeyIcon);
    	donkey.setVisible(true);
    	donkey.revalidate();
    }
}
