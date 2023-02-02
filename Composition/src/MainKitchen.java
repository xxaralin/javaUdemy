public class MainKitchen {
    public static void main(String[] args) {
        SmartKitchen kitchen1=new SmartKitchen();
        System.out.println(kitchen1);
//        kitchen1.getBrewMaster().setHasWorkToDo(true);
//        kitchen1.getBrewMaster().brewCoffee();

        kitchen1.setKitchenState(true,true,true);
        kitchen1.doKitchenWork();

    }
}
