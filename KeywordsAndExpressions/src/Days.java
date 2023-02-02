public class Days {
    public static void printDayOfWeek(int day) {
        String dayOfWeek= switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> {yield "Invalid Day";}
        };
        System.out.println(dayOfWeek);
    }

    public static void main(String[] args) {
        printDayOfWeek(7);
        printNumberInWord(0);
    }


public static void printNumberInWord(int num){
    String word="";

    switch(num){
        case 0 :
            word="ZERO";
        case 1 :
            word="ONE";
        case 2 :
            word="TWO";
        case 3 :
            word="THREE";
        case 4 :
            word="FOUR";
        case 5 :
            word="FIVE";
        case 6 :
            word="SIX";
        case 7 :
            word="SEVEN";
        case 8 :
            word="EIGHT";
        case 9 :
            word="NINE";
        default :
            word="OTHER";

    }
    System.out.println(word);
}


}
