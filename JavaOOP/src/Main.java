public class Main {
    public static void main(String[] args) {
    Car car= new Car();
    car.describeCar();
    car.setMake("Tesla");
    car.setModel("Model x");
    car.setColor("Red");
    car.setDoors(4);
    car.setConvertible(false);
    car.describeCar();

    System.out.println(car.getMake()+" "+car.getModel());

    }
}