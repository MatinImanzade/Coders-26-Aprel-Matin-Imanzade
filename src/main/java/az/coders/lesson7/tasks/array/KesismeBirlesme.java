package az.coders.lesson7.tasks.array;

import az.coders.lesson5.task.Array;

import java.util.Arrays;

public class KesismeBirlesme {
    public static void main(String[] args) {
        int[] arr = {2,4,6};
        int[] arr1 = {6,7,1};

        int[] kesisme = new int[5];
        int[] birlesme = new int [5];


        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr1.length;j++){
                if (arr[i]==arr1[j]){
                    kesisme[i] = arr[i];
                }else if(arr[i]!=arr1[j]){
                    birlesme[i] = arr[i];
                    birlesme[i+1] = arr1[j];
                }
            }
        }


        System.out.println(Arrays.toString(kesisme));
        System.out.println(Arrays.toString(birlesme));
    }
}
