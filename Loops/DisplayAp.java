
import java.util.Scanner;

public class DisplayAp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        for( int  i = 2; i<= 3*n-1;i+=3){
            System.out.print(i+ " ");
        }
        sc.close();
         
    }

}


// Display this AP - 2,5,8,11... upto'n' terms
// print 10 terms

// an = a +(n-1)d
//      2 + (n-1)3
//      2+ 3n - 3
//      3n -1