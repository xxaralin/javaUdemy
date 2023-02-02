import java.util.HashMap;
import java.util.Map;

public class Mapss {
    public static void main(String[] args) {
        Map<String,String> myPeople=new HashMap<>();
        myPeople.put("uso","karım, bffim askom");
        myPeople.put("bensu","en eski bffim, mentally ill yoldaşım");
        myPeople.put("yağmur","my gay bff, my emotional support");
        myPeople.put("alperen","my ex");

        System.out.println(myPeople.get("alperen") );

        if(myPeople.remove("alperen","my ex")){
            System.out.println("barıştık?");
            myPeople.put("alperen","manitam, kocam sevgilim");

        }else{
            System.out.println("bokumu yesin");
        }
        for(String key: myPeople.keySet()){
            System.out.println(key+" "+myPeople.get(key));
        }
    }
}
