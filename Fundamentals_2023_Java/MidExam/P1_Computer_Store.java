package Exam_Preparation;

import java.util.Scanner;

public class P1_Computer_Store {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        double bill = 0;

        while (true){
            if(input.equals("regular") || input.equals("special")){
                break;
            }
            double money = Double.parseDouble(input);
            if(money < 0){
                System.out.println("Invalid price!");
            }
            else bill += money;

            input = scan.nextLine();
        }

        if(bill == 0){
            System.out.println("Invalid order!");
        }
        else {
            System.out.println("Congratulations you've just bought a new computer!");

            System.out.printf("Price without taxes: %.2f$%n", bill);
            System.out.printf("Taxes: %.2f$%n",bill - bill * 0.80);
            System.out.println("-----------");
            bill += 0.20 * bill;
            if(input.equals("special")){
                bill *= 0.90;
            }
            System.out.printf("Total price: %.2f$",bill);
        }

    }
}
