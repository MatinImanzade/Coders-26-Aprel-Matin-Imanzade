package az.coders.lesson3;

import java.util.List;
import java.util.Scanner;

public class MiniProject { //Stringin deyise bilen versiyasi

    public static void main(String[] args) {

//        int[][][] arr = new int[2][3][4];
//
//// İlk boyut
//        arr[0] = new int[][]{
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12}
//        };
//
//// İkinci boyut
//        arr[1] = new int[][]{
//                {13, 14, 15, 16},
//                {17, 18, 19, 20},
//                {21, 22, 23, 24}
//        };
//
//// 3D dizideki bir elemanı yazdıralım
//        System.out.println(arr[0][1][2]); // çıktı: 7



        String alpha = "";
        for(char current = 'a'; current <= 'z'; current++)
            alpha += current;
         System.out.println(alpha);
    }

    public static void convert (){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a=" + a + "b=" + b);


    }

    public static void convert(int a, int b) {   // a = 1,  b = 2
        a = a + b; // a = 3
        b = a - b; // b = 1
        a = a - b; // a = 2
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
