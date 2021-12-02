package Inheritance.exercises.animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String[] input = null;

        while (true) {
            String animalType = null;
            input = scan.nextLine().split("\\s+");
            if (input[0].equals("Beast!")) {
                break;
            }
            animalType = input[0];

            String[] animalInfo = scan.nextLine().split("\\s+");
            if (animalInfo.length < 3) {
                System.out.println("Invalid input!");
            } else {
                createAnimal(animalType, animalInfo);
            }

        }


    }

    private static void createAnimal(String animalType, String[] animalInfo) {
        try {

            switch (animalType) {
                case "Dog":
                    Dog dog = new Dog(animalInfo[0], Integer.parseInt(animalInfo[1]), animalInfo[2]);
                    System.out.println(dog);
                    break;
                case "Frog":
                    Frog frog = new Frog(animalInfo[0], Integer.parseInt(animalInfo[1]), animalInfo[2]);
                    System.out.println(frog);
                    break;
                case "Cat":
                    Cat cat = new Cat(animalInfo[0], Integer.parseInt(animalInfo[1]), animalInfo[2]);
                    System.out.println(cat);
                    break;
                case "Kitten":
                    Kitten kitten = new Kitten(animalInfo[0], Integer.parseInt(animalInfo[1]), animalInfo[2]);
                    System.out.println(kitten);
                    break;
                case "Kittens":
                    Kittens kittens = new Kittens(animalInfo[0], Integer.parseInt(animalInfo[1]), animalInfo[2]);
                    System.out.println(kittens);
                    break;
                case "Tomcat":
                    Tomcat tomcat = new Tomcat(animalInfo[0], Integer.parseInt(animalInfo[1]), animalInfo[2]);
                    System.out.println(tomcat);
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
