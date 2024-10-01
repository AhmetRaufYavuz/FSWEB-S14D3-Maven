package org.example.arge;

public class HybridCar extends CarSkeleton{

    private double averageKmPerLiter;
    private int batterySize;
    private int cylinders;


    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.averageKmPerLiter = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAverageKmPerLiter() {
        return averageKmPerLiter;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }


    @Override
    public String startEngine() {
        runEngine(this);
        return getName() + " car starting";
    }

    @Override
    public String drive() {
        return "half noob CAR running";
    }


}
