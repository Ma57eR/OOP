package polymorphism.exercise.WildFarm;

public class Mouse extends Mammal {

    public Mouse(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void eat(Food food) {
        if (food.getClass().getSimpleName().equals("Meat")) {
            System.out.println(getClass().getSimpleName() + "s are not eating that type of food!");
        } else {
            this.setFoodEaten(food.getQuantity());
        }
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }
}
