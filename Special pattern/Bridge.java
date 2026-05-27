import java.util.Scanner;

public class Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nsp = 1;
        //for first row
        for(int i = 1; i<=2*n-1; i++){
            System.out.print("* ");
        }
        System.out.println();  



        for(int i = 1; i<=n-1; i++){ // n-1 because first row already printed separately
            for(int j = 1; j<=n-i; j++){ // stars
                System.out.print("* ");
            }

            for(int j = 1; j<=nsp; j++){ // spaces
                System.out.print("  ");
            }

            for(int j = 1; j<=n-i; j++){
                System.out.print("* ");
            }

            nsp+=2;
            System.out.println();
        
        }
    sc.close();

    }
}


// * * * * * * * * *  
// * * * *   * * * *  
// * * *       * * *  
// * *           * * 
// *               * 