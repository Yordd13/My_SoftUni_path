package L1.Basic_Syntax_and_Conditional_Statements_and_Loops.More_Exercise;

import java.util.Scanner;

public class P5_Messages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tapTimes = Integer.parseInt(scan.nextLine());

        String message = "";

        while(tapTimes > 0){
            int num = Integer.parseInt(scan.nextLine());


            int digits = String.valueOf(num).length();
            int mainDigit = num % 10;

            int offset = (mainDigit - 2) * 3;
            if(mainDigit == 8 || mainDigit == 9){
                offset += 1;
            }

            int letterIndex = (offset + digits - 1);
            letterIndex += 97;
            if(num == 0){
                letterIndex = 32;
            }
            String letter = Character.toString(letterIndex);
            message += letter;

            tapTimes--;
        }
        System.out.println(message);
    }
}