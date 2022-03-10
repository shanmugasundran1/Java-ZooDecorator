package StrategyDP;

import javax.swing.JLabel;

public class HideHorse implements EquusHideStrategy {

    private javax.swing.JLabel horse;
    
    public HideHorse(JLabel horse2) {
        horse = horse2;
    }

    @Override
    public void hide() {
    	horse.setVisible(false);
    	horse.revalidate();
    }
}
