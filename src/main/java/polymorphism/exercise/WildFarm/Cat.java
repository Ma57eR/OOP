package polymorphism.exercise.WildFarm;

import java.text.DecimalFormat;

public class Cat extends Felime {
    private String breed;
    public Cat(String animalName, String animalType, double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("##.##");
        return getClass().getSimpleName() + "[" + getAnimalName() + ", " + this.breed + ", " + df.format(getAnimalWeight()) + ", " + getLivingRegion() + ", " + getFoodEaten() + "]";
    }
}
