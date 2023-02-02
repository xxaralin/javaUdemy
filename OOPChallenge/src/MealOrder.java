public class MealOrder {
    private Burger burger;
    private Drinks drink;
    private SideItem sideItem;

    public MealOrder(Burger burger, Drinks drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }
    public void getCheck(){
        double total= burger.getPrice()+ drink.getPrice()+sideItem.getPrice();
        System.out.printf("Total spending is $ %.3f",total);
    }

    @Override
    public String toString() {
        return  "\nMealOrder-> " +
                 burger.toString() +
                 drink.toString() +
                 sideItem.toString()
                ;
    }
}
