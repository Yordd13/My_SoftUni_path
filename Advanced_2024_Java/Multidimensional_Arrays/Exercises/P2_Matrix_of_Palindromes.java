package Multidimensional_Arrays.Exercises;

import java.util.Scanner;

public class P2_Matrix_of_Palindromes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        String[][] res = new String[rows][cols];

        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res[i][j] = Character.toString(i + 97) + Character.toString(j + 97 + count) + Character.toString(i + 97);
            }
            count++;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
