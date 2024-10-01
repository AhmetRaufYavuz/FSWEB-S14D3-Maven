package org.example.arge;

public class CarSkeleton {

    private String name;
    private  String description;

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String startEngine() {
        System.out.println("classname : " + getClass().getSimpleName());
        return getName()+ " engine started!";
    }


    public String drive() {
        System.out.println("classname : " + getClass().getSimpleName());
        this.runEngine(this);
        return getName()+ " is driving!";

    }


    protected void runEngine(CarSkeleton carSkeleton) {

        if (carSkeleton instanceof ElectricCar){
            double avgKmPerCharge=((ElectricCar) carSkeleton).getAverageKmPerCharge();
            int batterySize=((ElectricCar) carSkeleton).getBatterySize();
            System.out.println("Noob car is starting, no need to cover your ears! with Capacity: " + batterySize +" and efficiency: "+ avgKmPerCharge);

        } else if (carSkeleton instanceof  GasPoweredCar) {
            double avgKmPerLiter = ((GasPoweredCar) carSkeleton).getAverageKmPerLiter();
            int cylinders = ((GasPoweredCar) carSkeleton).getCylinders();
            System.out.println("Real car is starting, cover your ears! with : " + cylinders +" cylinder engine and efficiency: "+ avgKmPerLiter);

        } else if (carSkeleton instanceof  HybridCar) {
            int batterySize = ((HybridCar) carSkeleton).getBatterySize();
            double avgKmPerLitre = ((HybridCar) carSkeleton).getAverageKmPerLiter();
            int cylinders = ((HybridCar) carSkeleton).getCylinders();
            System.out.println("Half Real car is starting, cover your ears! with : " + cylinders +" cylinder engine and efficiency: "+ avgKmPerLitre + " and battery: " + batterySize);


        }else {
            System.out.println("böyle bir araba yoq!");
        }

    }

}
