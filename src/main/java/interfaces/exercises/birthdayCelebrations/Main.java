package interfaces.exercises.birthdayCelebrations;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");
        List<Birthable> persons = new ArrayList<>();


        while (!input[0].equals("End")) {

            if (input[0].equals("Citizen")) {
                String name = input[1];
                int age = Integer.parseInt(input[2]);
                String id = input[3];
                String birthDate =  input[4];
                Citizen citizen = new Citizen(name, age, id, birthDate);
                persons.add(citizen);

            } else if (input[0].equals("Pet")) {
                String name = input[1];
                String birthDate = input[2];
                Pet pet = new Pet(name, birthDate);
                persons.add(pet);
            }

            input = scan.nextLine().split("\\s+");
        }
        String year = scan.nextLine();

        boolean isFound = false;

        for (Birthable person : persons) {
            if (person.getBirthDate().endsWith(year)) {
                isFound = true;
                System.out.println(person.getBirthDate());
            }
        }
        if (!isFound) {
            System.out.println("<No output>");
        }

    }
}
