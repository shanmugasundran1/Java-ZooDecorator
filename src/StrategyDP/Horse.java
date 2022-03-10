package StrategyDP;

import javax.swing.JLabel;

public class Horse extends Equus{
    
    public Horse(JLabel horse) {
        equusDisplayStrategy = new DisplayHorse(horse);
        equusHideStrategy = new HideHorse(horse);
    }
}
