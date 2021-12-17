package polymorphism.exercise.WildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal{
    private String livingRegion;

    protected Mammal(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, 0);
        this.livingRegion = livingRegion;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("##.##");
        return getClass().getSimpleName() + "[" + getAnimalName() +  ", " + df.format(getAnimalWeight()) + ", " + this.livingRegion + ", " + getFoodEaten() + "]";
    }

    public String getLivingRegion() {
        return livingRegion;
    }
}
