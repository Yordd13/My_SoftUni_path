package L1.Basic_Syntax_and_Conditional_Statements_and_Loops.More_Exercise;

import java.util.Scanner;

public class P3_Gaming_Store {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double balance = Double.parseDouble(scan.nextLine());

        String game = scan.nextLine();
        double spent = balance;


        while(!game.equals("Game Time")){
            boolean isTooExpensive = false;
            switch (game){
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    if(balance >= 39.99){
                        balance -= 39.99;
                    }
                    else {
                        isTooExpensive = true;
                    }
                    break;
                case "CS: OG":
                    if(balance >= 15.99){
                        balance -= 15.99;
                    }
                    else {
                        isTooExpensive = true;
                    }
                    break;
                case "Zplinter Zell":
                    if(balance >= 19.99){
                        balance -= 19.99;
                    }
                    else {
                        isTooExpensive = true;
                    }
                    break;
                case "Honored 2":
                    if(balance >= 59.99){
                        balance -= 59.99;
                    }
                    else {
                        isTooExpensive = true;
                    }
                    break;
                case "RoverWatch":
                    if(balance >= 29.99){
                        balance -= 29.99;
                    }
                    else {
                        isTooExpensive = true;
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    game = scan.nextLine();
                    continue;
            }

            if(isTooExpensive){
                System.out.println("Too Expensive");
                game = scan.nextLine();
                continue;
            }

            System.out.println("Bought " + game);

            if(balance == 0){
                System.out.println("Out of money!");
                return;
            }

            game = scan.nextLine();
        }

        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spent - balance, balance);
    }
}
