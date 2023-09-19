package L1.Basic_Syntax_and_Conditional_Statements_and_Loops.Exercise;

import java.util.Scanner;

public class P8_Triangle_of_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int x = 1;
        for (int rows = 1; rows <= n; rows++) {
            for (int num = rows; num >= 1 ; num--) {
                System.out.print(x + " ");
            }
            System.out.println();
            x++;
        }
    }
}
