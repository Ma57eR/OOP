package polymorphism.exercise.vehicles;

import java.text.DecimalFormat;

public  abstract class VehicleImpl implements Vehicle{
        private double fuelQuantity;
        private double fuelConsumption;



        protected VehicleImpl(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        setFuelConsumption(fuelConsumption);
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
    @Override
    //Когато Override-нем метод от Интервейса тук, то не е задължително да го използваме и в наследяващите
    public String drive(double km) {
        double distanceConsumption = km * (this.getFuelConsumption());
        if (this.getFuelQuantity() < distanceConsumption) {
            return getClass().getSimpleName() + " needs refueling";
        }
        setFuelQuantity(getFuelQuantity() - distanceConsumption);
        DecimalFormat df = new DecimalFormat("##.##");
        return getClass().getSimpleName() + " travelled " + df.format(km) + " km";
    }

    @Override
    public void refuel(double litres) {
        this.setFuelQuantity(getFuelQuantity() + litres);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " +String.format("%.2f", getFuelQuantity());
    }
}
