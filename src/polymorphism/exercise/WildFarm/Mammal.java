package polymorphism.exercise.WildFarm;

public abstract class Mammal extends Animal{
    private String livingRegion;

    protected Mammal(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, 0);
        this.livingRegion = livingRegion;
    }

}
