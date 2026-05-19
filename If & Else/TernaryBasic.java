import java.util.Scanner;

public class TernaryBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        // if(num % 2 == 0)  System.out.println("Even");
        
        // else System.out.println("Odd");
        

        // condition ? value_if_true : value_if_false

        System.out.println(num % 2 == 0 ? "Even" : "Odd");

        sc.close();
    


    }
}


// ternary operator is a short hand of if-else statement. It is also called conditional operator. It takes three operands and evaluates to a value based on the condition. The syntax of ternary operator is: condition ? value_if_true : value_if_false