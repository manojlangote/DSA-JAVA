import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {4, 3, 5, 6, 6, 4, 8, 0, 3, 12, 56, 678, -1};
        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(arr));
        sort(arr, arr.length);
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int size) {
        if (size <= 0) {
            return;
        }
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                swap(arr, i, i + 1);
            }
        }
        sort(arr, size - 1);
    }

    static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
