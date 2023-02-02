import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {
//        String[] items = {"apples","bananas","milk","eggs"};
//        List<String> list = List.of(items);
//        System.out.println(list);
//
//        ArrayList<String> groceries=new ArrayList<>(list);
//        groceries.add("yogurt");
//        System.out.println(groceries);
//
//        ArrayList<String> moreGroceries=new ArrayList<>(
//                List.of("pickles","mustard","cheese"));
//        moreGroceries.add("corn");
//        System.out.println(moreGroceries);


        String[] originalArray=new String[]{"First", "Second", "Third"};
        var originalList= Arrays.asList(originalArray);

        originalList.set(0,"one");
        System.out.println("list : "+originalList);
        System.out.println("array : "+Arrays.toString(originalArray));

        originalList.sort(Comparator.naturalOrder());
        System.out.println("array : "+Arrays.toString(originalArray));


        List<String> newList=Arrays.asList("Monday","Tuesday", "Wednesday","Thursday");
        System.out.println(newList);



    }
}
