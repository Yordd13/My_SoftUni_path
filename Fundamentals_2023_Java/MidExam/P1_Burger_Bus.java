package MidExam;

import java.util.Scanner;

public class P1_Burger_Bus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int citiesAmount = Integer.parseInt(scan.nextLine());

        double totalProfit = 0;
        for (int i = 1; i <= citiesAmount; i++) {
            String name = scan.nextLine();
            double moneyEarned = Double.parseDouble(scan.nextLine());
            double expenses = Double.parseDouble(scan.nextLine());

            if(i % 5 == 0){
               moneyEarned *= 0.90;
            } else if (i % 3 == 0) {
                expenses *= 1.50;
            }
            double profit = moneyEarned - expenses;

            totalProfit += profit;
            System.out.printf("In %s Burger Bus earned %.2f leva.%n", name, profit);
        }
        System.out.printf("Burger Bus total profit: %.2f leva.%n",totalProfit);
    }
}
