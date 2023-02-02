public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }
    public void startEngine(){
        System.out.println("Engine is starting");
    }
    public void drive(){
        System.out.println("Here we go, driving "+getClass().getSimpleName());
        runEngine();
    }
    protected void runEngine(){
        System.out.println("Car-> Engine is runningg");
    }
    public static Car getCar(String description){
        return switch (description.toUpperCase().charAt(0)){
            case 'H'->new HybridCar(description);
            case 'G'->new GasPoweredCar(description);
            case 'E'->new ElectricCar(description);
            default -> new Car(description);
        };
    }
}

class GasPoweredCar extends Car{
    private double avgKmPerLitre;
    private int cylinders=6 ;

    public GasPoweredCar(String description){
        super(description);
    }
    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = 6;
    }
    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("Gas-> Running the engine with just gas");
    }
}

class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int batterySize;
    public ElectricCar(String description){
        super(description);
    }
    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("Electric-> Running the engine with electric");
    }
}

class HybridCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;
    public HybridCar(String description){
        super(description);    }

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("Hybrid-> Running the engine with electric AND gas");
    }
}