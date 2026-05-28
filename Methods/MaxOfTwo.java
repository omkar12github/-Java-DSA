public class MaxOfTwo {
    public static int max(int a, int b , int c ){
        if(a>=b && a>=c) return a;
        else if(b>=a && b>=c) return b; // if we write if condition it also mandatory to write else condition without output shows : missing return statements
        else return c;
    }
    public static void main(String[] args) {
        System.out.println(max(4,2,8));
    }
}
