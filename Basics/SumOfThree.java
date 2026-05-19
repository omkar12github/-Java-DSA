import java.util.Scanner;
public class SumOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter first numbers: ");
        int a = sc.nextInt();
        System.out.print("Enter second numbers: ");
        int b = sc.nextInt();
        System.out.print("Enter third numbers: ");
        int c = sc.nextInt();

        System.out.print("Sum  is: " + (a + b + c));
        sc.close();
    }
}
