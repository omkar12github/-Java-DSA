import java.util.Scanner;
public class ABCDPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <=n; j++){
                System.out.print((char)(j + 64)+ " ");
            }
            System.out.println();
        }

    }
}


// print the given pattern 

// A B C D  IF N = 4 
// A B C D
// A B C D
// A B C D

// A B C   IF N = 3
// A B C 
// A B C 
// A B C 