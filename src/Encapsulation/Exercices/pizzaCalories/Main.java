package Encapsulation.Exercices.pizzaCalories;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("Pizza Name", 5);
        Dough dough = new Dough("White", "Crispy", 100);
        Topping topping = new Topping("Meat", 100);
        Topping topping1 = new Topping("Meat", 100);
        Topping topping2 = new Topping("Meat", 100);

        pizza.addTopping(topping);
        pizza.addTopping(topping1);
        pizza.addTopping(topping2);
        pizza.setDought(dough);


        System.out.println(pizza.getOverallCalories());
    }
}
