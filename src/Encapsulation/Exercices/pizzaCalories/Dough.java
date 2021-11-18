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

    //: the dough can be white or wholegrain
    //and in addition it can be crispy, chewy or homemade

    private void setWeight(double weight) {
        this.weight = weight;
    }

    private void setFlourType(String flourType) {
        this.flourType = flourType;
    }

    private void setBakingTechnique(String bakingTechnique) {
        this.bakingTechnique = bakingTechnique;
    }
    //Dough Modifiers
    //•	White – 1.5;
    //•	Wholegrain – 1.0;
    //•	Crispy – 0.9;
    //•	Chewy – 1.1;
    //•	Homemade – 1.0;
    public double calculateDoughCalories() {
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
