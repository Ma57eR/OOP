package Encapsulation.Exercices.pizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int numOfToppings) {
        this.setName(name);
        this.setToppings(numOfToppings);
        this.toppings = new ArrayList<>();
    }

    private void setToppings(int toppings) {
        if (toppings > 10) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
    }

    private void setName(String name) {
        if (name == null || name.length() > 15 || name.equals(" ")) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public String getName() {
        return name;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public Double getOverallCalories() {
        return (this.dough.calculateCalories() + this.toppings.stream().mapToDouble(Topping::calculateCalories).sum()) * 2;
    }
}
