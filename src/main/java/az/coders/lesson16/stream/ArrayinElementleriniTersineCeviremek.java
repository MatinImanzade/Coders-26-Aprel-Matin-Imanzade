package az.coders.lesson16.stream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayinElementleriniTersineCeviremek {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};

        Integer[] reversedArray = Arrays.stream(array)  //geriye İntStream qaytarir
                .collect(Collectors.toList())
                .stream()
                .sorted((a, b) -> -1)
                .toArray(Integer[]::new);

        System.out.println(Arrays.toString(reversedArray));




//        Stream<String> streamGenerated =
//                Stream.generate(() -> "element").limit(10);
//        System.out.println(streamGenerated);
    }
}
