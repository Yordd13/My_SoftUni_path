package Multidimensional_Arrays.Lab;

import java.util.Scanner;

public class P2_Positions_Of {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] indexes1 = scan.nextLine().split("\\s+");
        int rows1 = Integer.parseInt(indexes1[0]);
        int cols1 = Integer.parseInt(indexes1[1]);

        int[][] matrix1 = new int[rows1][cols1];

        for (int row = 0; row < rows1; row++) {
            String[] elements = scan.nextLine().split("\\s+");
            for (int col = 0; col < cols1; col++) {
                matrix1[row][col] = Integer.parseInt(elements[col]);
            }
        }

        int num = Integer.parseInt(scan.nextLine());
        boolean condition = true;

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                if(matrix1[i][j] == num){
                    System.out.println(i + " " + j);
                    condition = false;
                }
            }
        }

        if(condition){
            System.out.println("not found");
        }

    }
}
