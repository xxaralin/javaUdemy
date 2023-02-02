public class Time {
    public static String getDurationString(int seconds){
        if(seconds<0){
            return "invalid values";
        }
        else{
            int hour=seconds/3600;
            int reminderSeconds=seconds%3600;
            int minutes=reminderSeconds/60;
            reminderSeconds=reminderSeconds%60;
            return hour+" hours "+minutes+" minute "+reminderSeconds+" minutes";
        }
    }
    public static String getDurationString(int minutes, int seconds){
        if(minutes<=0 || seconds<=0 || seconds>=59){
            return "invalid values";
        }
        else{
            int minToSec=minutes*60;
            return getDurationString(minToSec+seconds);
        }

    }

    public static void main(String[] args) {
        System.out.println(getDurationString(9547));
        System.out.println(getDurationString(987,47));

    }
}
