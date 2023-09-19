package L1.Basic_Syntax_and_Conditional_Statements_and_Loops.Lab;

import java.util.Scanner;

public class P9_Sum_of_Odd_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int sum = 0;
        for (int i = 1; i < n * 2; i += 2) {
            System.out.println(i);
            sum += i;
        }
        System.out.printf("Sum: %d", sum);
    }
}
