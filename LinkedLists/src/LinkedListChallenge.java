import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance){
    @Override
    public String toString() {
        return String.format("%s (%d)",name,distance );
    }
}
public class LinkedListChallenge {
    public static void main(String[] args) {
        LinkedList<Place> places =new LinkedList<>();
        makeList(places);
        var iterator=places.listIterator();
        Scanner scanner=new Scanner(System.in);
        boolean flagQuit=false;
        boolean forward=true;

        printMenu();

        while(!flagQuit){
            if(!iterator.hasPrevious()){
                System.out.println("Starting point is: "+iterator.next());
                forward=true;
            }
            if(!iterator.hasNext()){
                System.out.println("Final point is: "+iterator.previous());
                forward=false;
            }
            System.out.println("Enter a value");
            String input=scanner.nextLine().toUpperCase().substring(0,1);
            switch (input){
                case "F"-> {
                    System.out.println("User says forward");
                    if(!forward){
                        forward=true;
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                    }
                    if(iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                }
                case "B"-> {
                    System.out.println("User says back");
                    if(forward){
                        forward=false;
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                    }
                    if(iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                }
                case "L"->System.out.println(places);
                case "M"->printMenu();
                case "Q"->flagQuit=true;
                default -> flagQuit=true;
            }
        }
    }
    private static void printMenu(){
        System.out.println("Available actions(select word or letter): " +
                "\n(F)orvard" +
                "\n(B)ackward" +
                "\n(L)ist places" +
                "\n(M)enu" +
                "\n(Q)uit \n");
    }
    private static void makeList(LinkedList<Place> places){

        Place adelaide=new Place("Adelaide",1374);
        Place aliceSprings=new Place("Alice Springs",2771);
        Place brisbane=new Place("Brisbane",917);
        Place darwin=new Place("Darwin",3972);
        Place melbourne=new Place("Melbourne",877);
        Place perth=new Place("Perth",3923);
        Place adelaide2=new Place("adelaide",1374);


        addPlace(places,adelaide);
        addPlace(places,aliceSprings);
        addPlace(places,brisbane);
        addPlace(places,darwin);
        addPlace(places,melbourne);
        addPlace(places,perth);
        addPlace(places,adelaide2);

        places.addFirst(new Place("Sydney",0));

        System.out.println(places);
    }
    private static void addPlace(LinkedList<Place>list, Place place){
        for(Place p : list){
            if(p.name().equalsIgnoreCase(place.name())){
                System.out.println(place+" already ony the list");
                return;
            }
        }
        int matchIndex=0;
        for(var listPlace:list){
            if(place.distance() < listPlace.distance()){
                list.add(matchIndex,place);
                return;
            }
            matchIndex++;
        }

        list.add(place);
    }
}
