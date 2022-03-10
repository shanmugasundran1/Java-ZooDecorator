package FactoryMethodDP;

import java.net.URL;
import javax.swing.ImageIcon;

public class Tiger implements Animal {

    private static Tiger uniqueTiger;
    URL url = getClass().getResource("/Image/Tiger.png");
    ImageIcon tigerIcon = new ImageIcon(url);

    public static Tiger gettigerInstance() {
        if (uniqueTiger == null) {
        	uniqueTiger = new Tiger();
        }
        return uniqueTiger;
    }

    @Override
    public ImageIcon appear() {
        return tigerIcon;
    }

    @Override
    public ImageIcon disappear() {
        URL urlDisappear = getClass().getResource("");
        ImageIcon tigerIconDisappear = new ImageIcon(urlDisappear);
        return tigerIconDisappear;
    }
}
