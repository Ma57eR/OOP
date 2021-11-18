package Encapsulation.Exercices.pizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        this.toppingType = toppingType;
        this.weight = weight;
    }

    //toppings can be of type meat, veggies, cheese or sauce

    //Toppings Modifiers
    //•	Meat – 1.2;
    //•	Veggies – 0.8;
    //•	Cheese – 1.1;
    //•	Sauce – 0.9;

    public double calculateToppingCalories() {
        double toppingMod = 0.0;
        switch (this.toppingType) {
            case "Meat":
                toppingMod = 1.2;
                break;
            case "Veggies":
                toppingMod = 0.8;
                break;
            case "Cheese":
                toppingMod = 1.1;
                break;
            case "Sauce":
                toppingMod = 0.9;
                break;
        }

        return this.weight * toppingMod;

    }
}
