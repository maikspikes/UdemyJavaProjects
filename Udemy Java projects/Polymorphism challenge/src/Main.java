public class Main {
    public static void main(String[] args) {
        Car car = new Car("2022 Blue Ferrari");
        runRace(car);

        Car ferrari = new GasPoweredCar("Gas Ferrari", 15.3, 8);
        runRace(ferrari);

        Car tesla = new ElectricCar("Model S", 400.6, 60);
        runRace(tesla);

        Car fiatPanda = new HybridCar("panda xxl", 13.5, 40, 6);
        runRace(fiatPanda);

    }

    public static void runRace(Car car) {
        car.startEngine();
        car.runEngine();
        car.drive();
    }
}
