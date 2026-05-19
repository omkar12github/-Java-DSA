import java.util.Scanner;

public class TernaryInVariable {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();  
        
        // int prasun;
        // if(num % 2 == 0) prasun = 100;
        // else prasun = 0;

        // with ternary operator
        int prasun = num % 2 == 0 ? 100 : 0;

        System.out.println(prasun);

        sc.close();
 

        

        
    }
}
