package L1.Basic_Syntax_and_Conditional_Statements_and_Loops.Lab;

import java.util.Scanner;

public class P2_Passed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double grade = Double.parseDouble(scan.nextLine());

        if(grade >= 3.00){
            System.out.println("Passed!");
        }
    }
}
