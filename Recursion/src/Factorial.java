public class Factorial {
    public static void main(String[] args) {

        System.out.println("Factorial: "+factorial(5));
    }
    static int factorial(int num){
        if(num ==1){
            return 1;
        }
        return num*factorial(num-1);
    }
}
