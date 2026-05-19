
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        if(n%2 == 0){ // generally { } is used when we have to print two or more statements but here we have only one statement to print so we can avoid using { }
            System.out.println("Even"); 
        }
        else{
            System.out.println("Odd");
        }
        sc.close();
    }
}
