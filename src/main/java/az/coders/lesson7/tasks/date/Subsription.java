package az.coders.lesson7.tasks.date;

import java.time.LocalDate;
import java.util.Scanner;

public class Subsription {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Odeyeceyiniz miqdari deyin");
        int amount = scanner.nextInt();

        LocalDate expireDate = getSubscription(amount);
        if (expireDate != null){
            System.out.println("Abuneliyin bitme tarixi :" + expireDate);
        }else {
            System.out.println("Abunelik vaxti duzgun qeyd olunmuyub");
        }
    }

    public static LocalDate getSubscription(int amount) {

        LocalDate expireDate;
        if (amount == 5) {
            expireDate = LocalDate.now().plusWeeks(1);
        } else if (amount == 15) {
            expireDate = LocalDate.now().plusMonths(1);
        } else if (amount == 25) {
            expireDate = LocalDate.now().plusMonths(2);
        } else if (amount == 60) {
            expireDate = LocalDate.now().plusYears(1);
        }else {
            System.out.println("Girdiyiniz qiymete uygun abunelik yoxdur");
            expireDate = null;
        }


        return expireDate;
    }
}
