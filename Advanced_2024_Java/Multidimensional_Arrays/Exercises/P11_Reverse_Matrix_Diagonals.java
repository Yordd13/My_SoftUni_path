package Multidimensional_Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P11_Reverse_Matrix_Diagonals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];
        
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] el = scan.nextLine().split(" ");
            matrix[i] = new int[el.length];
            for (int j = 0; j < el.length; j++) {
                matrix[i][j] = Integer.parseInt(el[j]);
            }
        }


        int counter = rows - 1 + cols - 1;
        while (true){
            for (int i = rows - 1; i >= 0; i--) {
                for (int j = cols - 1; j >= 0; j--) {
                    if(i + j == counter) System.out.print(matrix[i][j] +  " ");
                }
            }

            System.out.printf("%n");
            if(counter == 0){
                return;
            }
            counter--;
        }
    }
}
