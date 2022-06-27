public class ReverseDigit {
    public static void main(String[] args) {

        System.out.println(ReverseDigit(247));
    }
    static int ReverseDigit(int num){
        if(num%10==num){
            return num;
        }
        num*=10;
        return (num%10)+(ReverseDigit(num/10));
    }
}
