package Sets_And_Maps_Advanced.Lab;

import java.util.*;

public class P3_Voina_Number_game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Set<Integer> player1 = new LinkedHashSet<>();
        Set<Integer> player2 = new LinkedHashSet<>();

        String[] elements1 = scan.nextLine().split("\\s+");
        for (int i = 0; i < elements1.length; i++) {
            player1.add(Integer.parseInt(elements1[i]));
        }

        String[] elements2 = scan.nextLine().split("\\s+");
        for (int i = 0; i < elements2.length; i++) {
            player2.add(Integer.parseInt(elements2[i]));
        }


        for (int i = 0; i < 50; i++) {
            int firstNum = player1.iterator().next();
            player1.remove(firstNum);
            int secondNum = player2.iterator().next();
            player2.remove(secondNum);

            if(firstNum > secondNum){
                player1.add(firstNum);
                player1.add(secondNum);
            }
            else if(secondNum > firstNum){
                player2.add(firstNum);
                player2.add(secondNum);
            }

            if(player1.isEmpty()){
                System.out.println("Second player win!");
                return;
            }
            if(player2.isEmpty()){
                System.out.println("First player win!");
                return;
            }
        }

        if(player1.size() > player2.size()){
            System.out.println("First player win!");
        }
        else if(player1.size() < player2.size()){
            System.out.println("Second player win!");
        }
        else System.out.println("Draw!");
    }
}
