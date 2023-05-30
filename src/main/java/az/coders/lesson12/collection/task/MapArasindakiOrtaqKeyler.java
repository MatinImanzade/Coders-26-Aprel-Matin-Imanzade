package az.coders.lesson12.collection.task;

import java.util.*;

public class MapArasindakiOrtaqKeyler {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap();
        Map map2 = new HashMap();

        map1.put(1,"salam");
        map1.put(2,"sagol");
        map2.put(1,"necesen");



        System.out.println(getOrtaqKey(map1,map2));


    }

   public static Set<Integer> getOrtaqKey(Map<Integer,String > map1, Map<Integer,String > map2){
        Set<Integer> mainSet = new HashSet<>();

        Set<Integer> set1 = map1.keySet();
        Set<Integer> set2 = map2.keySet();

        for (Integer key : set1){
            if (map2.containsKey(key)){
                mainSet.add(key);
            }
        }



        return mainSet;
    }


}
