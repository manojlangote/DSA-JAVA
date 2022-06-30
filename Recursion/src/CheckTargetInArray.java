import sun.security.krb5.internal.tools.Klist;

import java.util.ArrayList;

public class CheckTargetInArray {

    static boolean findTarget(int[] arr, int target, int index) {
        //Base case if target not  found in the list.
        if (index >= arr.length) {
            return false;
        }
        //Return true if target is found.
        if (arr[index] == target) {
            return true;
        }
        return findTarget(arr, target, index + 1);
    }
    static int findIndex(int[] arr, int target, int index) {
        //Base case if target not  found in the list.
        if (index >= arr.length) {
            return -1;
        }
        //Return index if target is found.
        if (arr[index] == target) {
            return index;
        }
        return findIndex(arr, target, index + 1);
    }
    static ArrayList<Integer>list=new ArrayList<>();
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index) {
        //Base case if list is fully traversed
        if (index >= arr.length) {
            return list;
        }
        //add index if target is equal current index value
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1);
    }


    public static void main(String[] args) {

        int[] arr = {1,1,1,2,3,4,5,6,6,6,7};
        int target = 1;
        System.out.println("Found: "+findTarget(arr, target, 0));
        System.out.println("Found at index: "+findIndex(arr,target,0));
        System.out.println("All index of target "+target+" is : "+findAllIndex(arr,target,0));

    }
}
