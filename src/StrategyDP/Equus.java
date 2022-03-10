package StrategyDP;

public abstract class Equus {
	EquusDisplayStrategy equusDisplayStrategy;
	EquusHideStrategy equusHideStrategy;
  

	public void displayBehaviour(){
    	equusDisplayStrategy.display();
    }
	
	public void hideBehaviour(){
    	equusHideStrategy.hide();
    }
	
	public void setEquusDisplayStrategy(EquusDisplayStrategy equusDisplayStrategy) {
		this.equusDisplayStrategy = equusDisplayStrategy;
	}
}
