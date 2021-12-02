package Encapsulation.Exercices.ShoppingSpree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] personInfo = scan.nextLine().split(";");
        List<Person> people = new ArrayList<>();

        for (String value : personInfo) {
            String[] personData = value.split("=");
            String name = personData[0];
            double money = Double.parseDouble(personData[1]);
            Person currentPerson = new Person(name, money);
            people.add(currentPerson);
        }

        String[] productInfo = scan.nextLine().split(";");
        List<Product> products = new ArrayList<>();

        for (String s : productInfo) {
            String[] productData = s.split("=");
            String name = productData[0];
            double cost = Double.parseDouble(productData[1]);
            Product currentProduct = new Product(name, cost);
            products.add(currentProduct);
        }

        String purchase = scan.nextLine();

        while (!purchase.equals("END")) {
            String buyerName = purchase.split(" ")[0];
            String foodType = purchase.split(" ")[1];
            double foodCost = 0;
            Product currentProduct = new Product(foodType, foodCost);

            for (Product product : products) {
                if (product.getName().equals(foodType)) {
                    foodCost = product.getCost();
                    currentProduct = product;
                }
            }

            for (Person person : people) {
                if (person.getName().equals(buyerName)) {
                    person.buyProduct(currentProduct);
                }
            }
            purchase = scan.nextLine();
        }

        people.forEach(p -> {
            if (p.getProducts().size() == 0) {
                System.out.println(p.getName() + " – Nothing bought");
            } else {
                System.out.print(p);

            }
            System.out.println();
        });

    }
}
