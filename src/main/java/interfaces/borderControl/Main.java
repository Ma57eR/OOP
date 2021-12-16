package interfaces.borderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Identifiable> identifiables = new ArrayList<>();

        String input = scan.nextLine();

        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");

            if (tokens.length == 2) {
                Robot currentRobot = new Robot(tokens[0], tokens[1]);
                identifiables.add(currentRobot);
            } else {
                Citizen currentCitizen = new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                identifiables.add(currentCitizen);
            }

            input = scan.nextLine();
        }
        String fakeID = scan.nextLine();

        System.out.println(identifiables.stream()
                .map(Identifiable::getId)
                .filter(i -> i.endsWith(fakeID))
                .collect(Collectors.joining(System.lineSeparator())));

    }
}
