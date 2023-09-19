package L1.Basic_Syntax_and_Conditional_Statements_and_Loops.Exercise;

import java.util.Scanner;

public class P9_Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        double sumAll = 0;
        for (int i = 1; i <= n ; i++) {

            double priceCapsule = Double.parseDouble(scan.nextLine());
            int days = Integer.parseInt(scan.nextLine());
            int capsuleCount = Integer.parseInt(scan.nextLine());

            double orderPrice = ((days * capsuleCount) * priceCapsule);
            sumAll += orderPrice;
            System.out.printf("The price for the coffee is: $%.2f%n", orderPrice);
        }

        System.out.printf("Total: $%.2f", sumAll);
    }
}
