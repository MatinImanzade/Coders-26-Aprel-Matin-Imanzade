package az.coders.lesson12.collection.task;

import java.util.HashMap;
import java.util.Map;

public class StringdeEnCoxIstifadeOlunanHerfiTapmaq {
    public static void main(String[] args) {
        String str = "Salammmm";
        System.out.println(getStr(str));
    }

    /**
     * map ile yazilis
     * @param str
     * @return
     */

    public static Map getStr(String str){

        Map<Integer,Character> map = new HashMap();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)){
                    map.put(i+1, str.charAt(i));
                }
            }
        }


        return map;
    }

    /**
     *
     * @param str
     * @return
     *
     * map olmadan yazilis
     */

    public static String getSTR(String str){
        int count = 0;


        return str;
    }
}
