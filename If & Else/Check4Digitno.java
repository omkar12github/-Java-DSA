import java.util.Scanner;


public class Check4Digitno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int  n = sc.nextInt();
        if(n > 999 && n < 10000)
            System.out.println("4 digit number");
        else
            System.out.println("Not a 4 digit number");
        sc.close();
    }
}


// Q. Write a program to check whether a number is a 4 digit number or not.