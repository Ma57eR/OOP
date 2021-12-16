package polymorphism.exercise.vehiclesExtension;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] tokens = scan.nextLine().split(" ");
        double quantity = Double.parseDouble(tokens[1]);
        double consumption = Double.parseDouble(tokens[2]);
        double tankCapacity = Double.parseDouble(tokens[3]);
        Vehicle car = new Car(quantity, consumption, tankCapacity);

        tokens = scan.nextLine().split(" ");
        quantity = Double.parseDouble(tokens[1]);
        consumption = Double.parseDouble(tokens[2]);
        tankCapacity = Double.parseDouble(tokens[3]);
        Vehicle truck = new Truck(quantity, consumption, tankCapacity);

        tokens = scan.nextLine().split(" ");
        quantity = Double.parseDouble(tokens[1]);
        consumption = Double.parseDouble(tokens[2]);
        tankCapacity = Double.parseDouble(tokens[3]);
        Vehicle bus = new Bus(quantity, consumption, tankCapacity);

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
                    } else if (vehicle.equals("Truck")) {
                        System.out.println(truck.drive(distanceOrLitres));
                    } else {
                        System.out.println(bus.drive(distanceOrLitres));
                    }
                    break;
                case "Refuel":
                    if (vehicle.equals("Car")) {
                        car.refuel(distanceOrLitres);
                    } else if (vehicle.equals("Truck")) {
                        truck.refuel(distanceOrLitres);
                    } else {
                        bus.refuel(distanceOrLitres);
                    }
                    break;
                case "DriveEmpty":
                    System.out.println(bus.driveEmpty(distanceOrLitres));
            }
        }
        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);
    }
}
