package az.coders.lesson8.task;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 1, 4, 3, 1};
        boolean tapildi = numberFindAtArray(arr,3);

        if (tapildi){
            System.out.println("Axtardiginiz eded massivde movcuddur");
        }else {
            System.err.println("Eded massivde movcud deyil");
        }

    }

    public static boolean numberFindAtArray(int[] arr,int findingNumber){

        Arrays.sort(arr);  // 1,1,2,3,4,4,6,8
        int length = arr.length;
        int middleLenth = length/2;

        boolean tapildi = false;

        for (int i = 1;i<middleLenth;i++){
            if (findingNumber < arr[middleLenth-i]){
                if (findingNumber == arr[middleLenth-i]){
                    tapildi = true;
                    break;
                }
            }else {

            }

        }

        return tapildi;
    }
}