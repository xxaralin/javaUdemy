import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ArrayListChallenge {
    public static void main(String[] args) {
        List<String> arrayList= new ArrayList<>();
        boolean flag=true;
        while(flag){
            System.out.print("Available actions:" +
                    "\n0 - to shutdown" +
                    "\n1 - to add item(s) to list (comma delimited list)" +
                    "\n2 - to remove any items (comma delimited list)}\n");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            switch (input) {
                case "0" -> {
                    System.out.println("Shutting Down...");
                    flag=false;
                }
                case "1" -> addItem(arrayList);
                case "2" -> removeItems(arrayList);
            }
        }
    }
    public static void addItem(List<String> arrayList){
        System.out.println("Write the items you want to add");
        Scanner adding=new Scanner(System.in);
        String str=adding.nextLine();
        String[] splits=str.split(",");

        for(int i=0;i< splits.length;i++){
            if(arrayList.contains(splits[i])){
                System.out.println(splits[i]+" is already on the list");
            }else{
                arrayList.add(splits[i]);
            }
        }

        arrayList.sort(Comparator.naturalOrder());
        System.out.println(arrayList);

    }
    public static void removeItems(List<String> arrayList){
        System.out.println("Write the items you want to remove");
        Scanner removing=new Scanner(System.in);
        String str=removing.nextLine();
        String[] splits=str.split(",");

        for(int i=0;i< splits.length;i++){
            arrayList.remove(splits[i]);
        }


        arrayList.sort(Comparator.naturalOrder());
        System.out.println(arrayList);

    }
}
