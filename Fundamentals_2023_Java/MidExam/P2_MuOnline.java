package Exam_Preparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P2_MuOnline {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int health = 100;
        int bitcoins = 0;

        List<String> input = Arrays.stream(scan.nextLine().split("\\|")).collect(Collectors.toList());

        int bestRoom = 0;
        for (int i = 0; i < input.size(); i++) {
            bestRoom++;
            String[] room = input.get(i).split(" ");

            String action = room[0];
            int num = Integer.parseInt(room[1]);

            switch (action){
                case "potion":
                    if(health < 100){
                        if(num > 100 - health){
                            num = 100 - health;
                            health += 100 - health;
                        }
                        else {
                            health += num;
                        }
                        System.out.printf("You healed for %d hp.%n", num);
                        System.out.printf("Current health: %d hp.%n", health);
                    }
                    else {
                        System.out.println("You healed for 0 hp.");
                    }
                    break;
                case "chest":
                    bitcoins += num;
                    System.out.printf("You found %d bitcoins.%n", num);
                    break;
                default:
                    health -= num;
                    if(health <= 0){
                        System.out.printf("You died! Killed by %s.%n", action);
                        System.out.printf("Best room: %d",bestRoom);
                        return;
                    }
                    else {
                        System.out.printf("You slayed %s.%n", action);
                    }
                    break;
            }
        }
        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d%n",bitcoins);
        System.out.printf("Health: %d%n",health);
    }
}
