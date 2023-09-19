package L1.Basic_Syntax_and_Conditional_Statements_and_Loops.More_Exercise;

import java.util.Scanner;

public class P4_Reverse_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input =scan.nextLine();

        String inputReverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            inputReverse += input.charAt(i);
        }

        System.out.println(inputReverse);
    }
}
