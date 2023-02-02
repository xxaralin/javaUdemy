public class Main {
    public static void main(String[] args) {
        Burger burger1 = new Burger("1",2,"small");
        Drinks drink1 = new Drinks("Cola","small");
        SideItem sideItem1 = new SideItem("Fries","small");

        MealOrder mealOrder=new MealOrder(burger1,drink1,sideItem1);
        mealOrder.getCheck();
        System.out.println(mealOrder.toString());
    }
    public class Hamburger {
        private String name;
        private String meat;
        private String breadRollType;
        private double price;

        public Hamburger(String name, String meat, String breadRollType, double price) {
            this.name = name;
            this.meat = meat;
            this.breadRollType = breadRollType;
            this.price = price;
        }
    }
}