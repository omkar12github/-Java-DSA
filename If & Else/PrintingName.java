import java.util.Scanner;

public class PrintingName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int  num = sc .nextInt();

        if (num % 5 == 0 && num % 3 != 0) {
            System.out.println("Riya");
        }

        else if (num % 3 == 0 && num % 5 != 0 ){
             System.out.println("Banu");
        }
        else if (num % 3 == 0 && num % 5 == 0) {
        System.out.println("Apurva"); }

        else if (num % 3 == 0 || num % 5 == 0){
            System.out.println("Isha");
        }
           
        else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}




// Q. Take positive integer input and 
// print:
// riya    if the number is divisible by 5
// Banu    if the number is divisible by 3
// Apurva  if the number is divisible by both 3 and 5
// Isha    if the number is not divisible by either 3 or 5

