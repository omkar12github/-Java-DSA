import java.util.Scanner;
public class NumberSpiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        for(int i = 1; i<=2*n-1; i++){
            for(int j = 1; j<=2*n-1; j++){
                // main logic
                int a = i, b = j;
                if(i>n) a = 2*n - i;
                if(j>n) b = 2*n - j;
                System.out.print(Math.min(a, b)+ " ");
                // we can also print using ternary operator
                // System.out.print(((i<j) ? i : j)+ " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}


// 4
// 1 1 1 1 1 1 1 
// 1 2 2 2 2 2 1 
// 1 2 3 3 3 2 1 
// 1 2 3 4 3 2 1 
// 1 2 3 3 3 2 1 
// 1 2 2 2 2 2 1 
// 1 1 1 1 1 1 1 