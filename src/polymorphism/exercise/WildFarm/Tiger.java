package polymorphism.exercise.WildFarm;

public class Tiger extends Felime{

    public Tiger(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);

    }
    //Ядат само месо
    //"{AnimalType} are not eating that type of food!". AnimalType to be in the plural.


    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if (food.getClass().getSimpleName().equals("Meat")) {
            this.setFoodEaten(food.getQuantity());
        } else {
            System.out.println(getClass().getSimpleName() + "s are not eating that type of food!");
        }
    }
}
