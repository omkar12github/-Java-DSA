import java.util.Scanner;

public class AlphaNumericPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            for(int j = 1;j<= i; j++ ){
                if(i % 2 != 0)
                     System.out.print(j + " ");
                else
                    System.out.print((char)(j+64)+ " ");
            }
            System.out.println();
        }
        
    }
    
}
// concept
//if(i % 2 != 0)
// odd row → print numbers
// even row → print alphabets

// Q. print Alphanumeric pattern
// 1 
// A B 
// 1 2 3 
// A B C D 
// 1 2 3 4 5 
// A B C D E F 
// 1 2 3 4 5 6 7 