package polymorphism.exercise.vehiclesExtension;

import java.text.DecimalFormat;

public class Bus extends VehicleImpl {
    private static final double CONS_WITH_PEOPLE = 1.4;

    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }
    @Override
    public String drive(double km) {
        double distanceConsumption = km * (this.getFuelConsumption() + CONS_WITH_PEOPLE);
        if (this.getFuelQuantity() < distanceConsumption) {
            return "Fuel must be positive number";
        }
        setFuelQuantity(getFuelQuantity() - distanceConsumption);
        DecimalFormat df = new DecimalFormat("##.##");
        return getClass().getSimpleName() + " travelled " + df.format(km) + " km";
    }
    @Override
    public String driveEmpty(double km) {
        double distanceConsumption = km * (this.getFuelConsumption());
        if (this.getFuelQuantity() < distanceConsumption) {
            return getClass().getSimpleName() + " needs refueling";

        }
        setFuelQuantity(getFuelQuantity() - distanceConsumption);
        DecimalFormat df = new DecimalFormat("##.##");
        return getClass().getSimpleName() + " travelled " + df.format(km) + " km";
    }

}

