package L1.Basic_Syntax_and_Conditional_Statements_and_Loops.More_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P1_Sort_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numSort = new int[3];

        for (int i = 0; i < numSort.length; i++) {
            numSort[i] = Integer.parseInt(scan.nextLine());
        }
        Arrays.sort(numSort);

        for (int i = numSort.length - 1; i >= 0; i--) {
            System.out.println(numSort[i]);
        }
    }
}
