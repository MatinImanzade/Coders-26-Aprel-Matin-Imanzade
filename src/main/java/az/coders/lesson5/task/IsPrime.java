package az.coders.lesson5.task;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        System.out.println(isPrime());


    }

    public static boolean isPrime(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isPrime = true;

        if (number<2){
            System.out.println("Eded yanlis daxil ");
        }

        for (int i = 2;i<number;i++){
            if (number % i == 0){
                isPrime = false;
            }else {
                isPrime = true;
            }
        }

       return isPrime;

    }
}
