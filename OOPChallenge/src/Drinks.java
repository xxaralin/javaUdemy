public class Drinks extends Item{

    public Drinks(String type, String size) {
        super(type,size);
        this.price = setPrice(size);
    }

    public double setPrice(String size){
        return switch (size){
            case "medium"->15.99;
            case "large"->17.99;
            case "deluxe"->19.99;
            default ->12.99;
        };
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\nDrinks " +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price ;
    }
}
