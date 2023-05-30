package az.coders.lesson11.collection.task;

import java.util.LinkedList;
import java.util.List;

public class LinkedListKesismeBirlesme {
    public static void main(String[] args) {

        List<Integer> linkedList1 = new LinkedList<>();
        linkedList1.add(1);
        linkedList1.add(3);
        linkedList1.add(1);
        linkedList1.add(1);

        List<Integer> linkedList2 = new LinkedList<>();
        linkedList2.add(1);
        linkedList2.add(3);
        linkedList2.add(2);
        linkedList2.add(2);

        for (int i = 0;i< linkedList1.size();i++){
            for (int j = 0;j< linkedList2.size();j++){
               if (linkedList1.get(i) == linkedList2.get(j));
                System.out.print("Kesisme :");
                System.out.println(linkedList2.get(i));
            }
        }
    }
}
