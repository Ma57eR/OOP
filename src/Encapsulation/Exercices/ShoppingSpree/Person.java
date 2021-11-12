package Encapsulation.Exercices.ShoppingSpree;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new LinkedList<>();
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }
    public void buyProduct(Product product) {
        if(this.money < product.getCost()){
            String message = String.format("%s can't afford %s",this.name,product.getName());
            throw new IllegalArgumentException(message);

        }
        this.products.add(product);
        this.money -= product.getCost();
        System.out.printf("%s bought %s%n",this.name,product.getName());
    }

    public List<Product> getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", name, products.stream().map(Product::getName).collect(Collectors.joining(", ")));
    }
}
