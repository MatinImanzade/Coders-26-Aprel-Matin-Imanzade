package az.coders.lesson5.task;

import java.util.Random;
import java.util.Scanner;

public class NumberFind {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("0 ile 100 arasinda eded texmin edin :");
        int number = random.nextInt(0, 100);
        int userTexmin = -2;

        while (userTexmin != number) {

            int texmin = scanner.nextInt();

            if (texmin == number) {
                userTexmin = texmin;
                System.out.println("Tapdiniz : " + number);
            } else if (texmin < number) {
                System.out.println("higher");
            } else {
                System.out.println("lower");
            }

        }
    }
}
