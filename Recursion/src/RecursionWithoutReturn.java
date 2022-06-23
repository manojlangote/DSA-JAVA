public class RecursionWithoutReturn {

    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        if(n<=0){
            return;
        }
        //Print number
        System.out.println(n);
        //Recursive fun call without return statement because function return nothing
        print(--n);
    }
}
