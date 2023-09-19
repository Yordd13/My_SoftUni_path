package L1.Basic_Syntax_and_Conditional_Statements_and_Loops.Lab;

import java.util.Scanner;

public class P4_Back_In_30_Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        minutes += 30;

        if(minutes >= 60){
            minutes -= 60;
            hours++;
            if(hours == 24) hours = 0;
        }

        if(minutes >= 10){
            System.out.printf("%d:%d", hours, minutes);
        }
        else System.out.printf("%d:0%d", hours , minutes);
    }
}
