package polymorphism.exercise.WildFarm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int line = 1;
        String[] tokens = scan.nextLine().split(" ");

        while (!tokens[0].equals("End")) {
            Animal currentAnimal = null;
//            "{AnimalType} {AnimalName} {AnimalWeight} {AnimalLivingRegion}"
            if (!tokens[0].equals("Cat")) {
                String animalType = tokens[0];
                String animalName = tokens[1];
                double animalWeight = Double.parseDouble(tokens[2]);
                String animalRegion = tokens[3];
                switch (animalType) {
                    case "Mouse":
                        currentAnimal = new Mouse(animalName, animalType, animalWeight, animalRegion);
                        break;
                    case "Tiger":
                        currentAnimal = new Tiger(animalName, animalType, animalWeight, animalRegion);
                        break;
                    case "Zebra":
                        currentAnimal = new Zebra(animalName, animalType, animalWeight, animalRegion);
                        break;
                }
            } else {
                String animalType = tokens[0];
                String animalName = tokens[1];
                double animalWeight = Double.parseDouble(tokens[2]);
                String animalRegion = tokens[3];
                String breed = tokens[4];
                currentAnimal = new Cat(animalName, animalType, animalWeight, animalRegion, breed);
            }

            tokens = scan.nextLine().split(" ");

            String foodType = tokens[0];
            int quantity = Integer.parseInt(tokens[1]);

            Food currentFood;
            if (foodType.equals("Meat")) {
                currentFood = new Meat(quantity);
            } else {
                currentFood = new Vegetable(quantity);
            }
            currentAnimal.eat(currentFood);
            currentAnimal.makeSound();
            System.out.println(currentAnimal);
            tokens = scan.nextLine().split(" ");
        }
    }
}
