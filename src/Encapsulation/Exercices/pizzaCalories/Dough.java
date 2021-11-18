package Encapsulation.Exercices.pizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.flourType = flourType;
        this.bakingTechnique = bakingTechnique;
        this.weight = weight;
    }


    private void setWeight(double weight) {
        if (weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    private void setFlourType(String flourType) {
        if (!isFlourInList(flourType)) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.flourType = flourType;
    }

    private boolean isFlourInList(String flourType) {
        return flourType.equals("White") || flourType.equals("Wholegrain");
    }

    private void setBakingTechnique(String bakingTechnique) {
        this.bakingTechnique = bakingTechnique;
    }

    public double calculateCalories() {
        return this.weight * this.flourModificator() * this.bakingModificator();
    }
    private double flourModificator() {
        double flourMod = 0.0;
        switch (this.flourType) {
            case "White":
                flourMod = 1.5;
                break;
            case "Wholegrain":
                flourMod = 1.0;
                break;


        }
        return flourMod;
    }
    private double bakingModificator() {
        double bakingMod = 0.0;
        switch (this.bakingTechnique) {
            case "Crispy":
                bakingMod = 0.9;
                break;
            case "Chewy":
                bakingMod = 1.1;
                break;
            case "Homemade":
                bakingMod = 1;
        }
        return bakingMod;
    }

}
