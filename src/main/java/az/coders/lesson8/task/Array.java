package az.coders.lesson8.task;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 1, 4, 3, 1};

    }

    public static boolean numberFindAtArray(int[] arr,int findingNumber){

        Arrays.sort(arr);  // 1,1,2,3,4,4,6,8
        int length = arr.length;
        int middleLenth = length/2;



        Scanner scanner = new Scanner(System.in);
        int axtarilanReqem = scanner.nextInt();
        boolean tapildi = false;

        while (!tapildi){
            if (axtarilanReqem == arr[middleLenth-1]);

        }

        return tapildi;
    }
}