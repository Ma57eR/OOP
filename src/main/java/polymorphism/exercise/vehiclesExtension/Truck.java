package polymorphism.exercise.vehiclesExtension;

public class Truck extends VehicleImpl {
    private static final double AC_CONSUMPTION = 1.6;
    private static final double FUEL_TANK_HOLE = 0.95;

    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public void setFuelConsumption(double fuelConsumption) {
        super.setFuelConsumption(fuelConsumption + AC_CONSUMPTION);
    }

//    @Override
//    public String drive(double km) {
//        double distanceConsumption = km * (super.getFuelConsumption());
//        if (this.getFuelQuantity() < distanceConsumption) {
//            return " need refueling";
//        }
//        return String.format(" traveled %.0f km", km);
//    }

    @Override
    public void refuel(double litres) {
        if (this.getFuelQuantity() + litres > getTankCapacity()) {
            System.out.println("Cannot fit fuel in tank");
        } else if (litres <= 0) {
            System.out.println("Fuel must be a positive number");
        }else {
        super.setFuelQuantity(super.getFuelQuantity() + (litres * FUEL_TANK_HOLE)) ;
        }
    }
}
