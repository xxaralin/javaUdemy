public class Burger extends Item{
    private int toppings;

    public Burger(String type, int toppings, String size) {
        super(type,size);
        price = setPrice(type, toppings);
        this.toppings = (toppings>3 ? 3 : toppings);
    }

    public double setPrice(String type, int toppings) {
        return switch (type){
            case "1"->15.99+(toppings*3);
            case "2"->14.99+(toppings*3);
            case "3"->16.99+(toppings*3);
            case "4"->17.99+(toppings*3);
            default -> 19.99;
        };
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\nBurger->" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", toppings=" + toppings;
    }
}
