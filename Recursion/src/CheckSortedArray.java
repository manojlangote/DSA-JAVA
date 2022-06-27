public class CheckSortedArray {

    static boolean checkSorted(int []arr, int size){
        if(size<=1){
            return true;
        }
        return arr[size-1]>arr[size-2] && checkSorted(arr,size-1);

    }

    public static void main(String[] args) {
        int []arr={1,2,3,4,7};
        System.out.println(checkSorted(arr,5));

    }
}
