import java.util.Scanner;


public class CheckMagnitude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        if(Math.abs(n) < 69) System.out.println("Magnitude is smaller than 69");
        else System.out.println("Magnitude is not smaller than 69");
        sc.close();
    }
     

}


// Q. Take integer input and tell if its magnitude is smaller than 69 or not 
