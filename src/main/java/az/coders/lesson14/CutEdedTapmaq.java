package az.coders.lesson14;

import java.util.ArrayList;
import java.util.List;

public class CutEdedTapmaq {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(12);

        List<Integer> list1 =  cutEdedTapmaq(list);
        System.out.println(list1);
    }

    public static List<Integer> cutEdedTapmaq(List<Integer> list){
        List<Integer> cutEdedller = new ArrayList<>();
      for (int i = 0;i<list.size();i++){
          if (list.get(i) % 2 == 0){
              cutEdedller.add(list.get(i));
          }

      }
      return cutEdedller;
    }
}

