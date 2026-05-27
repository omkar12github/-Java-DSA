import java.util.Scanner;

public class StarTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // logic 1
        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=n; j++){
        //         if(i+j > n) System.out.print( "* " );
        //         else System.out.print("  ");
        //     }
        
        //     System.out.println();
        // }

        for(int i = 1; i<=n; i++){ // 2 loop inside single loop
            for(int j = 1; j<=n-i; j++){ // for space
                System.out.print("  ");
            }
            for(int j = 1; j<=i; j++){ // for *
                System.out.print("* ");
            }
            System.out.println();
        }

       sc.close();
    }
}


//             * 
//           * * 
//         * * * 
//       * * * * 
//     * * * * * 
//   * * * * * * 
// * * * * * * *