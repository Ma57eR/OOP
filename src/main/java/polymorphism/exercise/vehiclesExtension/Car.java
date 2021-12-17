package polymorphism.exercise.vehiclesExtension;

public class Car extends VehicleImpl {
private static final double AC_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    //По този начин, директно ще създаваме обекта с по-висока консумация
    public void setFuelConsumption(double fuelConsumption) {
        super.setFuelConsumption(fuelConsumption + AC_CONSUMPTION);
    }

//    @Override
//    public String drive(double km) {
//        double distanceConsumption = km * (super.getFuelConsumption());
//        if (this.getFuelQuantity() < distanceConsumption) {
//            return " need refueling";
//        }
//        return String.format("" +
//                " traveled %.0f km", km);
//    }


}
