import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExamples {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit=new LinkedList<>();
        //var placesToVisit=new LinkedList<String>();

        placesToVisit.add("Venice");
        placesToVisit.add(0,"New York");

        System.out.println(placesToVisit);
        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

        removeElements(placesToVisit);
        System.out.println(placesToVisit);

        getElements(placesToVisit);

        printItinerary(placesToVisit);

        printItinerary3(placesToVisit);
        testIterator(placesToVisit);
        testListIterator(placesToVisit);



    }
    private static void addMoreElements(LinkedList<String> list){
        list.addFirst("Bursa");
        list.addLast("Kahire");
        //Queue methods
        list.offer("London");
        list.offerLast("Sydney");
        list.offerFirst("Edinburgh");
        //Stack methods
        list.push("Padua");
    }

    private static void removeElements(LinkedList<String> list){
        //list.remove(4);
        list.remove("Bursa");
        //list.remove(); -> içind bir şey olmazsa ilk elemanı remove eder
        //list.removeFirst()-> self explanatory
        //list.removeLast()-> self explanatory

        //same for poll, pollFirst, pollLast

        String p1 = list.pop();
        System.out.println(p1+" was popped");

    }

    private static void getElements(LinkedList<String> list){
        System.out.println("Retrived elemenet: "+list.get(3));
        System.out.println("First element: "+list.getFirst());
        System.out.println("Last element: "+list.getLast());
        System.out.println("Index of Kahire: "+list.indexOf("Kahire"));
        System.out.println("Last index of London: "+list.lastIndexOf("London "));

        System.out.println("Element from element(): "+ list.element());
        System.out.println("Element from peek(): "+ list.peek());
        System.out.println("Element from peekFirst(): "+ list.peekFirst());
        System.out.println("Element from PeekLast(): "+ list.peekLast());

    }

    public static void printItinerary(LinkedList<String> list){
        System.out.println("Journey begins from "+list.getFirst());
        for(int i= 1;i< list.size();i++){
            System.out.println("--> from: "+list.get(i-1)+" to "+list.get(i)  );
        }
        System.out.println("Journey ends in "+list.getLast());
    }
    public static void printItinerary2(LinkedList<String> list){
        System.out.println("Journey begins from "+list.getFirst());
        String prevTown=list.getFirst();
        for (String town:list) {
            System.out.println("--> from: "+prevTown+" to "+town);
            prevTown=town;
        }
        System.out.println("Journey ends in "+list.getLast());
    }
    public static void printItinerary3(LinkedList<String> list){
        System.out.println("Journey begins from "+list.getFirst());
        String prevTown=list.getFirst();
        ListIterator<String> iterator= list.listIterator(1);
        while(iterator.hasNext()){
            var town=iterator.next();
            System.out.println("--> from: "+prevTown+" to "+town);
            prevTown=town;
        }

        System.out.println("Journey ends in "+list.getLast());
    }
    private static void testIterator(LinkedList<String> list){
        var iterator= list.iterator();
        while (iterator.hasNext()){
            if(iterator.next().equals("London")){
                //iterator.remove();
            }
            //System.out.println(iterator.next());
        }
        System.out.println(list);
    }

    private static void testListIterator(LinkedList<String> list){
        var iterator= list.listIterator();
        while (iterator.hasNext()){
            if(iterator.next().equals("London")){
                iterator.add("Berlin");
            }
            //System.out.println(iterator.next());
        }
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println(list);
    }
}
