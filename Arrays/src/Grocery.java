import java.util.ArrayList;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "Dairy", 1);
    }
}

public class Grocery{
    public static void main(String[] args) {
//        GroceryItem[] groceryArray=new GroceryItem[3];
//        groceryArray[0]=new GroceryItem("Milk");
//        groceryArray[1]=new GroceryItem("Apples","Fruit",6);
//        groceryArray[2]=new GroceryItem("Eggs","Dairy",30);

        //System.out.println(Arrays.toString(groceryArray));


        ArrayList<GroceryItem> groceryList=new ArrayList<>();
        groceryList.add(new GroceryItem("Butter","Dairy",2));
        groceryList.add(new GroceryItem("Apples","Fruit",6));
        groceryList.set(0,new GroceryItem("oragne"));

        System.out.println(groceryList);

        groceryList.remove(1);
        System.out.println(groceryList);

    }

}

