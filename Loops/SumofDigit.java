import java.util.Scanner;


public class SumofDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int sum = 0;

        while(n !=0) {
            sum += n%10;
            n/=10;
        }
        // System.out.println(sum);

        // in  case of negative number i  want to print sum 
        System.out.println((sum > 0 ) ? sum : -sum);  // ternary operator     (condition) ? true_value : false_value
        
    }
}
// print sum of all digit of a number 