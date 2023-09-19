package L1.Basic_Syntax_and_Conditional_Statements_and_Loops.Lab;

import java.util.Scanner;

public class P11_Multiplication_Table_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        int multiplier = Integer.parseInt(scan.nextLine());

        if(multiplier <= 10) {
            for (int i = multiplier; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", num , i , num * i);
            }
        }
        else {
            System.out.printf("%d X %d = %d%n", num , multiplier , num * multiplier);
        }
    }
}
