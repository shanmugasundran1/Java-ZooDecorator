package StrategyDP;

import javax.swing.JLabel;

public class HideDonkey implements EquusHideStrategy {

    private javax.swing.JLabel donkey;
    
    public HideDonkey(JLabel donkey2) {
        this.donkey = donkey2;
    }

    @Override
    public void hide() {
    	donkey.setVisible(false);
    	donkey.revalidate();
    }
}
