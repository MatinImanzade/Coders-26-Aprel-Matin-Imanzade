package az.coders.lesson11.collection.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListdekiHerReqeminSayinTapmaq {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(4);

        /*
        1 - 3
        2 - 2
        3 - 2
        4 - 1
         */

        System.out.println(numbers);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Hansi ededi axtarmaq isteyirsiniz?");
        int number = scanner.nextInt();

        for (Integer integer: numbers) {

            System.out.println(integer);
        }

    }
}
