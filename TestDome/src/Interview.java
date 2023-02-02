import java.util.Arrays;
import java.util.HashMap;

public class Interview {
    public static void main(String[] args) {
       String s="ABCERTYUFGHNHSDGHJCD";
        System.out.println(reaccuringLetter(s));



    }
    public static String reaccuringLetter(String s){
        String[] splitted=s.split("");
        System.out.println(Arrays.toString(splitted));
        HashMap<String,Integer>mapss=new HashMap<>();

        for(String letter:splitted ){
            if(mapss.containsKey(letter)){
                return letter;
            }else{
                mapss.put(letter,1);
            }
        }
        return null;
    }


}
