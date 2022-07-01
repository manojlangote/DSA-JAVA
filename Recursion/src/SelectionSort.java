import java.util.Arrays;

public class SelectionSort {
    static int count = 0; //Optional

    public static void main(String[] args) {
        int[] arr = {4, 3, 4, 8, 0, 3, 12, 56, 678, -1};
        System.out.println("Before Selection Sorting");
        System.out.println(Arrays.toString(arr));
        sort(arr, arr.length);
        System.out.println("After Selection  Sorting");
        System.out.println(Arrays.toString(arr));
        System.out.println("Swap count: "+count); //Optional
    }

    static void sort(int[] arr, int size) {
        if (size <= 0) {
            return;
        }
        int maxInd = 0;
        for (int i = 1; i < size; i++) {
            if (arr[i] > arr[maxInd]) {
                maxInd = i;
            }
        }
        if (maxInd != size-1) {
            count++;
            swap(arr, maxInd, size - 1); //Index needs to be handled carefully.
        }
        sort(arr, size - 1);
    }

    static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

}
