package Abstract.TrafficLight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] trafficLights = scan.nextLine().split("\\s+");
        int[] trafficLightsOrdinals = new int[trafficLights.length];
        int n = Integer.parseInt(scan.nextLine());

        fillingOrdinals(trafficLights, trafficLightsOrdinals);
        for (int i = 0; i < n; i++) {
            changeLight(trafficLightsOrdinals);
            printChangedLights(trafficLightsOrdinals);
        }

    }

    private static void printChangedLights(int[] trafficLightsOrdinals) {
        for (int trafficLightsOrdinal : trafficLightsOrdinals) {
            System.out.print(TrafficLight.get(trafficLightsOrdinal) + " ");
        }
        System.out.println();
    }

    private static void changeLight(int[] trafficLightsOrdinals) {
        for (int ordinal = 0; ordinal < trafficLightsOrdinals.length; ordinal++) {
            if (trafficLightsOrdinals[ordinal] < 2) {
                trafficLightsOrdinals[ordinal] = trafficLightsOrdinals[ordinal] + 1;
            } else {
                trafficLightsOrdinals[ordinal] = 0;
            }
        }
    }

    private static void fillingOrdinals(String[] trafficLights, int[] trafficLightsOrdinals) {
        for (int i = 0; i < trafficLightsOrdinals.length; i++) {
            for (TrafficLight currentTrafficL : TrafficLight.values()) {
                if (trafficLights[i].equals(currentTrafficL.name())) {
                    trafficLightsOrdinals[i] = currentTrafficL.getTrafficLightNum();
                }
            }
        }
    }
}
