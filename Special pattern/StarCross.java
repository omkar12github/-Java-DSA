import java.util.Scanner;

public class StarCross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
   
        for (int  i = 1; i <= n ; i ++){
            for(int j = 1; j<=n; j++){ 
                if(i == j || i + j == n + 1)  // i == j means row number and column number are same.
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        sc.close();

    }
}
// Q. print 
// *       * 
//   *   *   
//     *     
//   *   *   
// *       * 

// explaination
//  i == j means row number and column number are same. 
//  Examples:
// (1,1)
// (2,2)
// (3,3)
// This creates:\  diagonal.


// i + j == n + 1
// Means: sum of row and column equals n+1
//  For n = 5: n+1=6

// Examples:

// i	j	Sum
// 1	5	6
// 2	4	6
// 3	3	6
// This creates: /  diagonal.