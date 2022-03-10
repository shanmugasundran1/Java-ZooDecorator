package FactoryMethodDP;

public class CatFactory extends AnimalFactory {

    @Override
    public Animal createAnimal(String animalType) {
        if (animalType == "tiger") {
            return Tiger.gettigerInstance();
        } else if (animalType == "lion") {
            return Lion.getLionInstance();
        }
        else
        {
        	return null;
        }
    }

}
