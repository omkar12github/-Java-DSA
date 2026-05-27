import java.util.Scanner;
public class OddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int odd =1;

        for(int i =1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(odd+ " ");
                odd += 2;
            }
            System.out.println();
        }
        sc.close();
    }
}


// 1 
// 3 5 
// 7 9 11 
// 13 15 17 19 
// 21 23 25 27 29 