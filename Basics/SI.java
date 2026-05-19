import java.util.Scanner;
public class SI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int  p = 69, r = 5, t = 8;
        double si = p * r* t / 100.0 ; // 27.6 if we take any one of the value as double then it will give us the correct answer
        System.out.println("Simple Interest is: " + si);
        sc.close();
    }
}
