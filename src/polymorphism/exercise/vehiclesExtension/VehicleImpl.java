package polymorphism.exercise.vehiclesExtension;

import java.text.DecimalFormat;

public  abstract class VehicleImpl implements Vehicle {
        private double fuelQuantity;
        private double fuelConsumption;
        private double tankCapacity;



    protected VehicleImpl(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        setFuelConsumption(fuelConsumption);
        setTankCapacity(tankCapacity);

    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
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
    //Когато Override-нем метод от Интерфейса тук, то не е задължително да го използваме и в наследяващите
    public String drive(double km) {
        double distanceConsumption = km * (this.getFuelConsumption());
        if (this.getFuelQuantity() < distanceConsumption) {
            return getClass().getSimpleName() + " needs refueling";
           // return "Fuel must be positive number";
        }
        setFuelQuantity(getFuelQuantity() - distanceConsumption);
        DecimalFormat df = new DecimalFormat("##.##");
        return getClass().getSimpleName() + " travelled " + df.format(km) + " km";
    }
    public String driveEmpty(double km) {
        return null;
    }

    @Override
    public void refuel(double litres) {
        if (this.getFuelQuantity() + litres > this.tankCapacity) {
            System.out.println("Cannot fit fuel in tank");
        } else if (litres <= 0) {
            System.out.println("Fuel must be a positive number");
        } else {
            this.setFuelQuantity(getFuelQuantity() + litres);
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " +String.format("%.2f", getFuelQuantity());
    }
}
