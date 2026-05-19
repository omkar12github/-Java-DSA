
import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        // if(n>=0) {
        //     System.out.println(n);
        // } else{
        //     System.out.println(-n);
        // }
       
        // using only if statement
        if(n< 0) n = -n; // if n is negative then we will make it positive by multiplying it with -1
        System.out.println(n);
        sc.close();
        
    }
    
}


// Q. Take integer input and print its absolute value of that integer.