package polymorphism.exercise.vehicles;

public class Truck extends VehicleImpl{
    private static final double AC_CONSUMPTION = 1.6;
    private static final double FUEL_TANK_HOLE = 0.95;

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
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
        super.setFuelQuantity(super.getFuelQuantity() + (litres * FUEL_TANK_HOLE)) ;
    }
}
