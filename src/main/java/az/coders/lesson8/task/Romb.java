package az.coders.lesson8.task;

import java.util.Scanner;

public class Romb {
//    public static void main(String[] args) {
//        String star = "*";
//
//        for (int i = 0; i<8;i++){
//            for (int j = 0;j<i;j++){
//                System.out.print(" ");
//            }
//
//            for (int k = 0;)
//            System.out.print(star);
//
//        }
//
//    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        // Üst kısmı oluşturma
        for (int i = 1; i <= size; i++) {
            // Boşlukları bas
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }

            // Yıldızları bas
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Alt kısmı oluşturma
        for (int i = size - 1; i >= 1; i--) {
            // Boşlukları bas
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }

            // Yıldızları bas
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
