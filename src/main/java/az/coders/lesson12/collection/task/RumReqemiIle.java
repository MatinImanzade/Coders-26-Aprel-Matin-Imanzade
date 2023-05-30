package az.coders.lesson12.collection.task;

import java.util.HashMap;
import java.util.Map;

public class RumReqemiIle {
    public static void main(String[] args) {
        int number = 4;
        System.out.println(getMap(number));
    }

    public static String getMap(int number){
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"I");
        map.put(2,"II ");
        map.put(3,"III");
        map.put(4,"IV");
        return map.get(number);
    }
}
