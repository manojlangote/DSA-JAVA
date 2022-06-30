public class TrianglePattern {

    public static void main(String[] args) {
        int num=4;
        Triangle1(num);
        System.out.println();
        Triangle2(num);
    }
    static void Triangle1(int num){
        if(num<=0){
            return;
        }
        for(int i=0;i<num;i++){
            System.out.print("*");
        }
        System.out.println();
        Triangle1(num-1);
    }
    static void Triangle2(int num){
        if(num<=0){
            return;
        }
        Triangle2(num-1);
        for(int i=0;i<num;i++){
            System.out.print("*");
        }
        System.out.println();
    }
}
