package L4.Methods.Lab;

import java.util.Scanner;

public class P5_Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("%.2f",ReturnPrice(scan.nextLine(), Integer.parseInt(scan.nextLine())));

    }
    public static double ReturnPrice(String product, int quantity){
        double priceOne = 0;
        switch (product){
            case "coffee":
                priceOne = 1.50;
                break;
            case "water":
                priceOne = 1.00;
                break;
            case "coke":
                priceOne = 1.40;
                break;
            case "snacks":
                priceOne = 2.00;
                break;
        }
        return priceOne * quantity;
    }
}
