import java.util.Scanner;
public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int m = sc.nextInt();
        int n = sc.nextInt();

        for(int i = 1; i <= m; i++) { // how much lines 
            for(int j =1; j <= n; j++) {  // how many * will be printed in each line
                if(i == 1 || i == m || j == 1 || j == n)
                    System.out.print("* ");
                else
                System.out.print("  "); //  type space for vacant space
            }

            System.out.println(); // it will move to next line 
        }

        sc.close();
    }
}
