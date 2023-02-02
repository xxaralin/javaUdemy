public class SmartKitchen{
    private CoffeeMaker brewMaster;
    private Refrigerator iceBox;
    private DishWasher dishWasher;

    public SmartKitchen(){
        brewMaster=new CoffeeMaker();
        iceBox=new Refrigerator();
        dishWasher=new DishWasher();
    }
//    public CoffeeMaker getBrewMaster() {
//        return brewMaster;
//    }
//
//    public Refrigerator getIceBox() {
//        return iceBox;
//    }
//
//    public DishWasher getDishWasher() {
//        return dishWasher;
//    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean washerFlag){
        brewMaster.setHasWorkToDo(coffeeFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(washerFlag);
    }
    public void doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}
class Refrigerator{
    private boolean hasWorkToDo;
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void orderFood(){
        if(hasWorkToDo){
            System.out.println("Yemek sipariş ediyorum şu an");
            hasWorkToDo=false;
        }
    }
}
class DishWasher{
    private boolean hasWorkToDo;
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void doDishes(){
        if(hasWorkToDo){
            System.out.println("Bulaşıkları yıkıyorum şu an");
            hasWorkToDo=false;
        }
    }
}
class CoffeeMaker {
    private boolean hasWorkToDo;
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void brewCoffee(){
        if(hasWorkToDo){
            System.out.println("Kahve koyuyorum şu an");
            hasWorkToDo=false;
        }
    }
}