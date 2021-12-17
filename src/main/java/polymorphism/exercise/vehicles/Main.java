package polymorphism.exercise.vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] tokens = scan.nextLine().split(" ");
        double quantity = Double.parseDouble(tokens[1]);
        double consumption = Double.parseDouble(tokens[2]);
        Vehicle car = new Car(quantity, consumption);

        tokens = scan.nextLine().split(" ");
        quantity = Double.parseDouble(tokens[1]);
        consumption = Double.parseDouble(tokens[2]);
        Vehicle truck = new Truck(quantity, consumption);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(" ");
            String command = input[0];
            String vehicle = input[1];
            double distanceOrLitres = Double.parseDouble(input[2]);

            switch (command) {
                case "Drive":
                    if (vehicle.equals("Car")) {
                        System.out.println(car.drive(distanceOrLitres));
                    } else {
                        System.out.println(truck.drive(distanceOrLitres));
                    }
                    break;
                case "Refuel":
                    if (vehicle.equals("Car")) {
                        car.refuel(distanceOrLitres);
                    } else {
                        truck.refuel(distanceOrLitres);
                    }
                    break;
            }
        }
        System.out.println(car);
        System.out.println(truck);
    }
}
