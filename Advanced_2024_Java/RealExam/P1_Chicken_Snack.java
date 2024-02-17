package RealExam;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P1_Chicken_Snack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<Integer> moneyStack = new ArrayDeque<>();

        String[] moneyInput = scan.nextLine().split(" ");

        for (String s : moneyInput){
            moneyStack.push(Integer.parseInt(s));
        }

        ArrayDeque<Integer> priceQueue = new ArrayDeque<>();

        String[] priceInput = scan.nextLine().split(" ");

        for (String s : priceInput){
            priceQueue.offer(Integer.parseInt(s));
        }

        int countBoughtFood = 0;
        while (!moneyStack.isEmpty() && !priceQueue.isEmpty()){
            int money = moneyStack.pop();
            int price = priceQueue.poll();

            if(money == price){
                countBoughtFood++;
            }
            else if(money > price){
                countBoughtFood++;
                int change = money - price;
                if(moneyStack.isEmpty()){
                    moneyStack.push(change);
                }
                else{
                    int money2 = moneyStack.pop();
                        money2 += change;
                        moneyStack.push(money2);
                }
            }
        }

        if(countBoughtFood >= 4){
            System.out.printf("Gluttony of the day! Henry ate %d foods.",countBoughtFood);
        }
        else if(countBoughtFood != 0){
            if(countBoughtFood == 1){
                System.out.printf("Henry ate: %d food.",countBoughtFood);
            }
            else {
                System.out.printf("Henry ate: %d foods.",countBoughtFood);
            }
        }
        else {
            System.out.println("Henry remained hungry. He will try next weekend again.");
        }
    }
}
