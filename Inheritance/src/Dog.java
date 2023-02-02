public class Dog extends Animal{
    private String earShape;
    private String tailShape;

    public Dog(){
        super("mutt","big",50.0);
    }
    public Dog(String type, double weight){
        this(type, weight,"Perky", "Curled");
    }
    public Dog(String type,  double weight, String earShape, String tailShape) {
        super(type, weight<15 ? "small" : (weight<35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public void makeNoise(){
        bark();
    }
    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("Dogs walk shit and piss");
        if(speed=="slow"){
            walk();
        }else{
            run();
            bark();
        }
    }

    public void bark(){
        System.out.println("havhav");
    }

    public void run(){
        System.out.println("doggie runs");
    }

    public void walk(){
        System.out.println("doggie walks too");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
}
