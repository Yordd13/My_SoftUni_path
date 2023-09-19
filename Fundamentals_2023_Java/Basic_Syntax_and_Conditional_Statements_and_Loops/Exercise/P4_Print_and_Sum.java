package L1.Basic_Syntax_and_Conditional_Statements_and_Loops.Exercise;

import java.util.Scanner;

public class P4_Print_and_Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startNum = Integer.parseInt(scan.nextLine());
        int endNum = Integer.parseInt(scan.nextLine());

        int sum = 0;
        for (int i = startNum; i <= endNum; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.printf("%nSum: %d", sum);
    }
}
