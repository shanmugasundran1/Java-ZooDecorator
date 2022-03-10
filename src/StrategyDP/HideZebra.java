package StrategyDP;

import javax.swing.JLabel;

public class HideZebra implements EquusHideStrategy {

    private javax.swing.JLabel zebra;
    
    public HideZebra(JLabel zebra2) {
        zebra = zebra2;
    }

    @Override
    public void hide() {
    	zebra.setVisible(false);
    	zebra.revalidate();
    }
}
