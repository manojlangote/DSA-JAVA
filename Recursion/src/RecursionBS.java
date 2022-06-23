public class RecursionBS {
    public static void main(String[] args) {

        int []arr={1,2,3,4,5,6,7,8,9,10};
        int target=7;
        System.out.println("Index: "+BS(arr,target,0,arr.length-1));
    }
    static int BS(int arr[], int target, int start, int end){
        //Base case
        if(start>end){
            return -1;
        }
         //Body Part which is temporary for perticular function call
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }else if(arr[mid]>target){
            end=mid-1;
        }else{
            start=mid+1;
        }
        return BS(arr,target,start,end);
    }
}
