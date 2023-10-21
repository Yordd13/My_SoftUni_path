package Exam_Preparation;

import java.util.Scanner;

public class P1_Counter_Strike {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int energy = Integer.parseInt(scan.nextLine());

        int counterWins = 0;
        while(true){

            String input = scan.nextLine();
            if(input.equals("End of battle")){
                break;
            }
            int distance = Integer.parseInt(input);

            if(distance <= energy){
                energy -= distance;
            }
            else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", counterWins, energy);
                return;
            }
            counterWins++;

            if(counterWins % 3 == 0){
                energy += counterWins;
            }
        }

        System.out.printf("Won battles: %d. Energy left: %d", counterWins, energy);
    }
}
