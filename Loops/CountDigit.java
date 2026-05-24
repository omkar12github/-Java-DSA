import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        if(n == 0) n = 1;  // for 0 count as 1 
        int count = 0;

        while(n != 0 ){  // the code will be running untill n becomes 0.
            n /=10;
            count++;
        }
        System.out.println(count);


        sc.close();


    }

    
}
