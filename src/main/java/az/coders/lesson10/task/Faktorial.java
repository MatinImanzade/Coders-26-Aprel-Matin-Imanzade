package az.coders.lesson10.task;

import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {

        System.out.println(getFactorial(new Scanner(System.in).nextInt()));

    }

    public static int getFactorial(int i){
        int factorial = 1;
        if (i<=0){
            return 1;
        }

        return factorial * i * getFactorial(i-1);
    }
}
