package L1.Basic_Syntax_and_Conditional_Statements_and_Loops.Exercise;

import java.util.Scanner;

public class P7_Vending_Machine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double balance = 0;
        String input1 = scan.nextLine();
        while(!input1.equals("Start")){
            double coinInput = Double.parseDouble(input1);
            if(coinInput != 0.1 && coinInput != 0.2 && coinInput != 0.5 && coinInput != 1 && coinInput != 2){
                System.out.printf("Cannot accept %.2f%n", coinInput);
            }
            else balance += coinInput;

            input1 = scan.nextLine();
        }


        String input2 = scan.nextLine();
        while (!input2.equals("End")){

            double price = 0;

            switch (input2){
                case "Nuts":
                    price = 2.0;
                    break;
                case "Water":
                    price = 0.7;
                    break;
                case "Crisps":
                    price = 1.5;
                    break;
                case "Soda":
                    price = 0.8;
                    break;
                case "Coke":
                    price = 1.0;
                    break;
                default:
                    System.out.println("Invalid product");
                    input2 = scan.nextLine();
                    continue;
            }

            if(price > balance){
                System.out.println("Sorry, not enough money");
            }
            else {
                System.out.printf("Purchased %s%n", input2);
                balance -= price;
            }


            input2 = scan.nextLine();
        }

        System.out.printf("Change: %.2f", balance);
    }
}
