public class CheckTargetInArray {

    static boolean CheckTarget(int[] arr, int target, int index) {
        //Base case if target not  found in the list.
        if (index >= arr.length) {
            return false;
        }
        //Return true if target is found.
        if (arr[index] == target) {
            return true;
        }
        return CheckTarget(arr, target, index + 1);
    }

    public static void main(String[] args) {

        int[] arr = {12,345,4565,6643,90};
        int target = 90;
        System.out.println(CheckTarget(arr, target, 0));

    }
}
