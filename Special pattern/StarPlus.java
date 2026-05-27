
import java.util.Scanner;
public class StarPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

       while(true) { // first it check number is odd ?

            System.out.print("Enter odd number: ");
            n = sc.nextInt();

            if(n % 2 == 1)
                break;

            System.out.println("Please re-enter an odd number"); 
        }
  
        for (int  i = 1; i <= n ; i ++){
            for(int j = 1; j<=n; j++){
                int mid = n/2 + 1;
                if(i == mid || j == mid)
                System.out.print("* ");
            else
                System.out.print("  ");
            }
            System.out.println();
        }

        sc.close();
}
}


