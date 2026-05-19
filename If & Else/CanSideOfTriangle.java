import java.util.Scanner;

public class CanSideOfTriangle {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter 1st side:");
        int a = sc.nextInt();
        System.out.print("Enter 2nd side:");
        int b = sc.nextInt();
        System.out.print("Enter 3rd side:");
        int c = sc.nextInt();

        if(a+b > c && b+c > a && a+c > b)
            System.out.println("Yes");
        else
            System.out.println("No");
        
     

        sc.close();


    }
}



// Q. Take 3 positive integers input and tell if they can be the sides of a triangle or not.