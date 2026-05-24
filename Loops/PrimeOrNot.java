import java.util.Scanner;
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        boolean flag = true; // true means prime

        for(int i = 2; i<= Math.sqrt(n); i++){// Math.sqrt(n) reduce iteration of loop
            if(n % i == 0){
                flag = false;
                break;
            }
             
        }
        if(n ==1) System.out.println("Neither Prime Nor Composite");
        else if (flag == false) System.out.println("Composite number");
        else System.out.println("prime number");

        sc.close();
    }
}
