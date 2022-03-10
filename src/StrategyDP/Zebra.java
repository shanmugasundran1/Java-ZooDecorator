package StrategyDP;

import javax.swing.JLabel;

public class Zebra extends Equus{

    public Zebra(JLabel zebra) {
        equusDisplayStrategy = new DisplayZebra(zebra);
        equusHideStrategy = new HideZebra(zebra);
    }
}
