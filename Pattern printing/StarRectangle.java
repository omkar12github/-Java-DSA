
import java.util.Scanner;
public class StarRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int cols = sc.nextInt();

        for(int i = 1; i <= row; i++) { // how much lines 
            for(int j =1; j <= cols; j++) {  // how many * will be printed in each line
                System.out.print("* ");
            }

            System.out.println(); // it will move to next line 
        }

        sc.close();
    }
}


// nested loop  - loop inside loop

// Q.  print rectangle 


