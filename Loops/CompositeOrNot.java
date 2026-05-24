
import java.util.Scanner;
public class CompositeOrNot {
    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     System.out.print("Enter Number: ");
     int n = sc.nextInt();

     for(int i = 2; i<= n -1; i++){
        if(n % i == 0) {  // means we found i as a factor of n
            System.out.print("Composite number");
            break; // it is used to break the loop

        }
     }
       sc.close();
        
    }
}


// WAP to print if number is composite or not 


// if we do not use break it will print like this 

// Enter Number: 66
// Composite number 
// Composite number 
// Composite number 
// Composite number 
// Composite number 
// Composite number 