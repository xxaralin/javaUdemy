public class SideItem extends Item{
    public SideItem(String type, String size) {
        super(type,size);
        price = setPrice(type);
    }
    public double setPrice(String type) {
        return switch (type){
            case "Fries"->5.99;
            case "Onion Rings"->7.99;
            case "Cheese Sticks"->8.99;
            case "Cookies"->4.99;
            default ->6.99;
        };

    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\nSideItem" +
                "type='" + type + '\'' +
                ", price=" + price ;
    }
}
