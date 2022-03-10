package FactoryMethodDP;

public abstract class AnimalFactory {

    public Animal callAnimal(String animalType) {
    	Animal animal;
        animal = createAnimal(animalType);
        return animal;
    }
    
    public abstract Animal createAnimal(String animalType);
}
