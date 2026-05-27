import java.util.Scanner;
public class Pyramidmethod2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // method 2  without using math
        int n = sc.nextInt();
        int nsp = n-1, nst = 1;  //nsp- no. of spaces, nst- no. of stars
        for(int i = 1; i<=n; i++){
            for(int j = 1;j<=nsp; j++){ //spaces
                System.out.print("  ");
            }
            for(int j = 1; j<= nst; j++){ //
                System.out.print("* ");
            
            }
            System.out.println();
            nsp--;  // it should change only once after completing one row 
            nst+=2;
        }
        sc.close();
    }
}



    //           * 
    //         * * * 
    //       * * * * * 
    //     * * * * * * * 
    //   * * * * * * * * * 