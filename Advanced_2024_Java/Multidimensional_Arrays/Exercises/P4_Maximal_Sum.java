package Multidimensional_Arrays.Exercises;

import java.util.Scanner;

public class P4_Maximal_Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] matrix = new int[rows][cols];


        for (int i = 0; i < rows; i++) {
            String[] el = scan.nextLine().split("\\s+");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(el[j]);
            }
        }

        int maxSum = Integer.MIN_VALUE;
        int[][] res = new int[3][3];
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(i + 3 <= rows && j + 3 <= cols){
                    int sum = 0;
                    for (int k = i; k < i + 3; k++) {
                        for (int l = j; l < j + 3; l++) {
                            sum += matrix[k][l];
                            count2++;
                        }
                        count2 = 0;
                        count1++;
                    }

                    count1 = 0;
                    if(maxSum < sum){
                        for (int k = i; k < i + 3; k++) {
                            for (int l = j; l < j + 3; l++) {
                                res[count1][count2] = matrix[k][l];
                                count2++;
                            }
                            count2 = 0;
                            count1++;
                        }
                        maxSum = sum;
                    }
                    count1 = 0;

                }
            }
        }

        System.out.println("Sum = " + maxSum);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
