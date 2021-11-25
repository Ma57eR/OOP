package interfaces.exercises.foodShortage.person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numOfPeople = Integer.parseInt(scan.nextLine());
        List<Buyer> people = new ArrayList<>();

        while (numOfPeople-- > 0) {
            String input = scan.nextLine();
            String[] tokens = input.split("\\s+");

            addingPerson(people, tokens);


        }

        String buyerName = scan.nextLine();


        while (!buyerName.equals("End")) {
            for (Buyer person : people) {

                if (person.getName().equals(buyerName)) {
                    person.buyFood();
                }
            }
            buyerName = scan.nextLine();
        }
        int totalPurchasedFood = 0;
        for (Buyer person : people) {
            totalPurchasedFood+= person.getFood();
        }
        System.out.println(totalPurchasedFood);



    }

    private static void addingPerson(List<Buyer> people, String[] tokens) {
        if (tokens.length == 4) {
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            String id = tokens[2];
            String birthDate = tokens[3];
            Citizen citizen = new Citizen(name, age, id, birthDate);
            people.add(citizen);
        } else if (tokens.length == 3) {
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            String group = tokens[2];
            Rebel rebel = new Rebel(name, age, group);
            people.add(rebel);
        }
    }
}
