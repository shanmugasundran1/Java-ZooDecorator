package StrategyDP;

import javax.swing.JLabel;

public class Donkey extends Equus {

    public Donkey(JLabel donkey) {
        equusDisplayStrategy = new DisplayDonkey(donkey);
        equusHideStrategy = new HideDonkey(donkey);
    }
}
