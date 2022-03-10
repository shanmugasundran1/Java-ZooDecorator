package FactoryMethodDP;

import java.net.URL;
import javax.swing.ImageIcon;

public class Duck implements Animal {

    private static Duck uniqueDuck;
    URL url = getClass().getResource("/Image/Duck.png");
    ImageIcon duckIcon = new ImageIcon(url);

    public static Duck getDuckInstance() {
        if (uniqueDuck == null) {
        	uniqueDuck = new Duck();
        }
        return uniqueDuck;
    }

    @Override
    public ImageIcon appear() {
        return duckIcon;
    }

    @Override
    public ImageIcon disappear() {
        URL urlDisappear = getClass().getResource("");
        ImageIcon duckIconDisappear = new ImageIcon(urlDisappear);
        return duckIconDisappear;
    }

}
