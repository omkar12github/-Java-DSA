import java.util.Scanner;

public class ProfitAndLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int cp = sc.nextInt(); 
        // int sp = sc.nextInt();
        // if(sp > cp) System.out.println("Profit is: " +(sp-cp));
        // if(cp > sp) System.out.println("Loss is: " +(cp-sp));
        // if(cp == sp) System.out.println("No profit no loss");





        System.out.print("Enter cp: ");
        int cp = sc.nextInt(); // cost price
        System.out.print("Enter sp: ");
        int sp = sc.nextInt(); // selling price
        int profit = sp - cp; 
        int loss = cp - sp;
        if(profit > 0) System.out.println("Profit is: " + profit);
        else if(loss > 0) System.out.println("Loss is: " + loss);
        else System.out.println("No profit no loss");
        
        





        sc.close();
    }
}


// Q.  if cost price and selling price of an item is input through the keyboard, write a program to determine whether the seller has made profit or incurred loss or no profit no loss . Also determine how much profit he made or loss he incurred.