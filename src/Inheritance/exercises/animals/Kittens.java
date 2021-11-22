package Inheritance.exercises.animals;

public class Kittens extends Cat{
    public Kittens(String name, int age, String gender) {
        super(name, age, "Female");
    }

    @Override
    public String produceSound() {
        return "Meow";
    }
}
