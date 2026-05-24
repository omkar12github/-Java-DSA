import java.util.Scanner;
public class PrintFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int  n = sc.nextInt();

        for( int  i = 1; i <= Math.sqrt(n); i++) {

            if (n % i ==0){
                System.out.print(i + " ");

                if(i != n / i){  // i is not equal to n divided by i,    n / i = 36 / 2 = 18,   2 != 18
                    System.out.print(n / i + " ");
                }
            }

        }
        sc.close();
    }
}


    // Q. print all factors of number  
