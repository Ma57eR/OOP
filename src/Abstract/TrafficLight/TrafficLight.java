package Abstract.TrafficLight;

public enum TrafficLight {
    RED(0),
    GREEN(1),
    YELLOW(2);

    private final int TrafficLightNum;


    TrafficLight(int trafficLightNum) {
        this.TrafficLightNum = trafficLightNum;

    }

    public int getTrafficLightNum() {
        return TrafficLightNum;
    }

    public static TrafficLight get(int index) {
        return TrafficLight.values()[index];
    }
}
