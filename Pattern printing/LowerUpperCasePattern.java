import java.util.Scanner;
public class LowerUpperCasePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            char ch;
            if(i % 2 !=0) // print alternate one lowercase and uppercase
                ch = (char)(96+ i); // lowercase
            else
                ch = (char)(64+i); // Uppercase

            for(int j = 1; j<= n; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}


// Ascii value start from
// a = 97
// A = 65

//print like this 
// a a a a a a 
// B B B B B B 
// c c c c c c 
// D D D D D D 
// e e e e e e 
// F F F F F F 