import java.util.Scanner;

public class NumberTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

         for(int i = 1; i<=n; i++){ // 2 loop inside single loop
            for(int j = 1; j<=n-i; j++){ // for space
                System.out.print("  ");
            }
            for(int j = 1; j<=i; j++){ // for *
                System.out.print(j+ " ");  // same as * flipped traingle only replace * with j.
            }
            System.out.println();
        }
        sc.close();
    }
}
