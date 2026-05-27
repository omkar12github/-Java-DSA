import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int nsp = n-1, nst = 1;  //nsp- no. of spaces, nst- no. of stars
        for(int i = 1; i<=n; i++){
            for(int j = 1;j<=nsp; j++){ //spaces
                System.out.print("  ");
            }
            for(int j = 1; j<= nst; j++){ //
                System.out.print("* ");
            
            }
            nsp--;  // it should change only once after completing one row 
            nst+=2;
            System.out.println();
        }


        nsp =1;
        nst = 2*n-3; // logic changed
        for(int i = 1; i<=n; i++){
            for(int j = 1;j<=nsp; j++){ 
                System.out.print("  ");
            }
            for(int j = 1; j<= nst; j++){ //
                System.out.print("* ");
            
            }          
            nsp++; //changed 
            nst-=2; // changed
             System.out.println();
        }

     sc.close();

    }
}
