package Encapsulation.Exercices.pizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dought;
    private List<Topping> toppings;

    public Pizza(String name, int numOfToppings) {
        this.name = name;
        this.setToppings(numOfToppings);
        this.toppings = new ArrayList<>();
    }

    private void setToppings(int toppings) {
    }

    private void setName(String name) {
        this.name = name;
    }

    public void setDought(Dough dought) {
        this.dought = dought;
    }

    public String getName() {
        return name;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public Double getOverallCalories() {
        return (this.dought.calculateDoughCalories() + this.toppings.stream().mapToDouble(Topping::calculateToppingCalories).sum()) * 2;
    }
}
