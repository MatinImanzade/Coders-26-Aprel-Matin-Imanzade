package az.coders.lesson9.task;

public class SelectedSort {
    public static void main(String[] args) {
        int[] arr = {2,8,3,9,1,0};
        // 0 8 3 9 1 2                  i = 2 3
        // 0 1 3 9 8 2                  length = 6
        // 0 1 2 9 8 3                  j = 3 4
        // 0 1 2 3 8 9
    }

    public static int[] selectedSort(int[] arr){
        for (int i = 0;i<arr.length;i++){
            for (int j = i+1;j<arr.length-i-1;j++){
                if (arr[i]>arr[j]){

                }
            }

        }

        return arr;
    }
}
