package org.example.arge;

public class ElectricCar extends CarSkeleton {

    private double averageKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double averageKmPerCharge, int batterySize) {
        super(name, description);
        this.averageKmPerCharge = averageKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAverageKmPerCharge() {
        return averageKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public String startEngine() {
        runEngine(this);
        return getName() + " car starting";
    }

    @Override
    public String drive() {
        return "noob CAR running";
    }

}
