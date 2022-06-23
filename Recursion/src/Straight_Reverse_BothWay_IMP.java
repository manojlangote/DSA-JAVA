public class Straight_Reverse_BothWay_IMP {

    public static void main(String[] args) {
        fun(5); //Print first and then call recursive fun
        System.out.println();
        funRev(5); // Call recursive function till base case and then do print
        System.out.println();
        funBoth(5);//Print first, call recursive fun till base case and then print again while coming back(Reverse)
    }
    static void fun(int n){
        if(n<=0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    static void funRev(int n){
        if(n==0){
            return;
        }
        //Try to go at last and then print while coming back
        funRev(n-1);
        System.out.println(n);
    }
    static void funBoth(int n){
        if(n<=0){
            return;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }

}
