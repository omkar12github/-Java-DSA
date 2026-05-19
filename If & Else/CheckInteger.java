import java.util.Scanner;

public class CheckInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");

        double n = sc.nextDouble();

        int x = (int)n; // type casting
        if(n-x == 0) System.out.println("is an Integer");
        else System.out.println("is not an Integer");
      
        sc.close();
        
    }
}
