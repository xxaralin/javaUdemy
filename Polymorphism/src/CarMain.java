public class CarMain {
    public static void main(String[] args) {
        Car car1=new Car("Just car");
        runRace(car1);

        Car car2=new HybridCar("Hybrid Car",12.5,20,8);
        runRace(car2);
        // car2.runEngine();

        Object car=Car.getCar("Hybrid");



    }
    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}
