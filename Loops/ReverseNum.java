import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int r = 0;

        while(n!=0){
            r *= 10; // multiply rev by 10
            r += (n%10); // add the last digit 
            n /=10;  // remove the last digit
        }
        System.out.println(r);
        
    }
}


//  n	      n%10	             r
// 1234	        4	             4
// 123	        3	             43
// 12	        2	             432
// 1	        1	             4321
