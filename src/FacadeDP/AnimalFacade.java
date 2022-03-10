package FacadeDP;

import FactoryMethodDP.Animal;
import StrategyDP.Equus;
import javax.swing.JLabel;

public class AnimalFacade {

    Animal tiger;
    Animal lion;
    Equus horse;
    Animal duck;
    Equus donkey;
    Animal swan;
    Equus zebra;
    

 
    public AnimalFacade(Equus horseEquus, Animal duck, Equus donkeyEquus, Animal swan, Equus zebraEquus, Animal tiger, Animal lion) {
        this.horse = horseEquus;
        this.duck = duck;
        this.donkey = donkeyEquus;
        this.swan = swan;
        this.zebra = zebraEquus;
        this.tiger = tiger;
        this.lion = lion;
    }


	public void clickAll(JLabel swanLabel,JLabel duckLabel,JLabel lionLabel,JLabel tigerLabel) {
		tigerLabel.setIcon(tiger.appear());
		tigerLabel.setVisible(true);
		tigerLabel.revalidate();
        
		lionLabel.setIcon(lion.appear());
		lionLabel.setVisible(true);
		lionLabel.revalidate();
                
        horse.displayBehaviour();
        
        duckLabel.setIcon(duck.appear());
        duckLabel.setVisible(true);
        duckLabel.revalidate();
                
        donkey.displayBehaviour();
        
        swanLabel.setIcon(swan.appear());
        swanLabel.setVisible(true);
        swanLabel.revalidate();
        
        zebra.displayBehaviour();

    }

    public void unclickAll(JLabel swanLabel,JLabel duckLabel,JLabel lionLabel,JLabel tigerLabel) {
    	tigerLabel.setIcon(tiger.disappear());
    	tigerLabel.setVisible(false);
    	tigerLabel.revalidate();
        
    	lionLabel.setIcon(lion.disappear());
    	lionLabel.setVisible(false);
    	lionLabel.revalidate();
                
        horse.hideBehaviour();
        
        duckLabel.setIcon(duck.disappear());
        duckLabel.setVisible(true);
        duckLabel.revalidate();
                
        donkey.hideBehaviour();
        
        swanLabel.setIcon(swan.disappear());
        swanLabel.setVisible(true);
        swanLabel.revalidate();
        
        zebra.hideBehaviour();
    }
}
