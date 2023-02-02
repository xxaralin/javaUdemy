import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DayOfTheWeek weekday=DayOfTheWeek.SAT;
        System.out.println(weekday);
        System.out.printf("Name is %s, ordinal value is %d%n",weekday.name(),weekday.ordinal());

        for(int i=0;i<10;i++){
            weekday=getRandomDay();
            System.out.printf("Name is %s, ordinal value is %d%n",weekday.name(),weekday.ordinal());
        }

    }

    public static DayOfTheWeek getRandomDay(){
        int randomInt=new Random().nextInt(7);
        var allDays=DayOfTheWeek.values();

        return allDays[randomInt];
    }
}