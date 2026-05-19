import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // to take input from user
            // Area of circle = pi * r * r

            System.out.print("Enter radius: ");
            double r = sc.nextDouble();
            double a = 3.141592 * r * r;
            System.out.print("Area of circle is: ");
            System.out.print(a);

            sc.close();
        }
    }

