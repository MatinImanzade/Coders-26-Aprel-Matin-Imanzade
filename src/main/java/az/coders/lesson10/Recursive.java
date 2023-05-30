package az.coders.lesson10;

import java.util.Scanner;

public class Recursive {
    public static void main(String[] args) {

        System.out.println(test(new Scanner(System.in).nextInt()));
    }

    public static int recursiveMetod(int i){ // 3
        if (i == 1){
            return 2;
        }
        return i + recursiveMetod(i-1); // 3 + 2 + rec(1)
    }

    public static int test(int i){
        if (i == 3){
            return 1;
        }
        return i+test(3);
    }
}
