import java.util.Scanner;
public class Npattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n :");
        int n = sc.nextInt();

        for(int i = 1, j = n; i <= j; i++, j--){
            System.out.println(i);

            if(i != j) {
                System.out.println(j);
            }

        }
        sc.close();
    }
}


// Take 'n' as input from user and print the following sequences
// 1
// n
// 2
// n-1
// 3
// n-2
// ....