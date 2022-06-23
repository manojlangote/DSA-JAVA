public class SumOfDigit {
    public static void main(String[] args) {
        int num = 1234;
        int ans = Sum(num);
        System.out.println("Sum of digits: " + num + " is -> " + ans);
        ans = product(num);
        System.out.println("Product of digits: " + num + " is " + ans);
    }

    static int Sum(int num) {
        if (num == 0) {
            return 0;
        }
        int rem = num % 10;
        num /= 10;
        return rem + Sum(num);
    }

    //VVIMP concept return true if only single digit is remained (num%10==num)
    static int product(int num) {
        if (num % 10 == num) { //num%10 ==n only when single digit is remain so we will return that digit
            return num;
        }
        return (num % 10) * (product(num / 10));
    }
}
