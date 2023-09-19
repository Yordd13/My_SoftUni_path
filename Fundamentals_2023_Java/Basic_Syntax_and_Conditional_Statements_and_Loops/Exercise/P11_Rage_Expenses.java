package L1.Basic_Syntax_and_Conditional_Statements_and_Loops.Exercise;

import java.util.Scanner;

public class P11_Rage_Expenses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scan.nextLine());
        double priceHeadset = Double.parseDouble(scan.nextLine());
        double priceMouse = Double.parseDouble(scan.nextLine());
        double priceKeyboard = Double.parseDouble(scan.nextLine());
        double priceDisplay = Double.parseDouble(scan.nextLine());

        double priceAll = 0;
        int trashKeyboard = 0;
        for (int i = 2; i <= lostGamesCount ; i++) {
            boolean headsetTrash = false;
            boolean mouseTrash = false;
            if(i % 2 == 0){
                headsetTrash = true;
                priceAll += priceHeadset;
            }
            if(i % 3 == 0){
                mouseTrash = true;
                priceAll += priceMouse;
            }
            if(mouseTrash && headsetTrash){
                priceAll += priceKeyboard;
                trashKeyboard++;
            }
            if(trashKeyboard % 2 == 0 && trashKeyboard != 0){
                priceAll += priceDisplay;
                trashKeyboard = 0;
            }
        }

        System.out.printf("Rage expenses: %.2f lv.", priceAll);
    }
}
