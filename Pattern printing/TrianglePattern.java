import java.util.Scanner;
public class TrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            for (int j = 1; j<= i; j++){ // jitna i hai utna hi j ko print krna hai
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// Q. print like this 
// * 
// * * 
// * * * 
// * * * * 
// * * * * * 
// * * * * * * 
