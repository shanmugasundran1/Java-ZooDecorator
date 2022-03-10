package FactoryMethodDP;

public class BirdFactory extends AnimalFactory {

    @Override
    public Animal createAnimal(String animalType) {
        if (animalType == "swan") {
            return Swan.getSwanInstance();
        }
            else if (animalType == "duck") {
                return Duck.getDuckInstance();
        } else {
            return null;
        }
    }

}