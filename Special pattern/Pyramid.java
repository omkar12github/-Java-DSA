import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Method 1 
        for(int i = 1; i<= n;i++){ // rows/lines 
            for(int j = 1; j<=n-i; j++){ // print spaces before stars
                System.out.print("  ");
            }
            for(int j = 1; j<= 2*i-1; j++){  // 2*i - 1 it creates 1,3,5,7...
                System.out.print("*" + " "); 
            }
            System.out.println();
        }
        sc.close();
    }
}


// A pyramid needs odd number of stars.
//           * 
//         * * * 
//       * * * * * 
//     * * * * * * * 
//   * * * * * * * * * 
// * * * * * * * * * * * 
