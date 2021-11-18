package Encapsulation.Exercices.pizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] pizzaInfo = scan.nextLine().split("\\s+");
        String[] doughInfo = scan.nextLine().split("\\s+");

        Pizza pizza = new Pizza(pizzaInfo[1], Integer.parseInt(pizzaInfo[2]));
        Dough dough = new Dough(doughInfo[1], doughInfo[2], Integer.parseInt(doughInfo[3]));
        pizza.setDough(dough);

        String[] toppingInfo = scan.nextLine().split("\\s+");
        while (!toppingInfo[0].equals("END")) {
            String type = toppingInfo[1];
            int weight = Integer.parseInt(toppingInfo[2]);
            Topping topping = new Topping(type, weight);
            pizza.addTopping(topping);
            toppingInfo = scan.nextLine().split("\\s+");
        }




        System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());
    }
}
