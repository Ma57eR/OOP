package Encapsulation.Exercices.pizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    public void setWeight(double weight) {
        if (weight > 50) {
            throw new IllegalArgumentException(this.toppingType + " weight should be in the range [1..50].");
        }

        this.weight = weight;
    }

    public void setToppingType(String toppingType) {
        if (!isInToppingList(toppingType)) {
            throw new IllegalArgumentException("Cannot place " + toppingType + " on top of your pizza");
        }
        this.toppingType = toppingType;
    }

    private boolean isInToppingList(String toppingType) {
        return toppingType.equals("Meat") || toppingType.equals("Veggies") || toppingType.equals("Cheese") || toppingType.equals("Sauce");
    }

    public double calculateCalories() {
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
