public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }


    public void startEngine(){
        System.out.println("Car - startEngine");
    }

    public void drive(){
        System.out.println("Car - runEngine");
    }

    protected void runEngine(){
        System.out.println("Car - driving, type is " + getClass().getSimpleName());

    }
}

class GasPoweredCar extends Car{
    private double avgKmPerLitre;
    private int cylinders;


    public GasPoweredCar (String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas - All %d cylinders are fired up, Ready!%n", cylinders);
    }

    @Override
    public void runEngine() {
        super.runEngine();
    }




}

class ElectricCar extends Car{

    private double avgKmPerCharge;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void drive() {
        super.drive();
    }
}

class HybridCar extends Car {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -  %d cylinders are fired up, Ready!%n", cylinders);
        System.out.printf("Hybrid - switch %d kWh battery on, Ready!%n", batterySize);
    }

    @Override
    public void drive() {
        System.out.printf("Hybrid - usage below average: %2f %n", avgKmPerLitre);
    }


}
