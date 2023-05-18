package az.coders.lesson8.task;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // Hedef eleman bulunamadı
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 12;
        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Hedef eleman bulunamadı.");
        } else {
            System.out.println("Hedef eleman " + result + ". indekste bulundu.");
        }
    }
}

