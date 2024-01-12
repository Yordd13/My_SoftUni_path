package Multidimensional_Arrays.Lab;

import java.util.Scanner;

public class P7_Find_The_Real_Queen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[][] matrix = new char[8][8];

        for (int i = 0; i < 8; i++) {
            String[] elements = scan.nextLine().split("\\s+");
            for (int j = 0; j < 8; j++) {
                matrix[i][j] = elements[j].charAt(0);
            }
        }
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                boolean condition = false;
                if(matrix[i][j] == 'q'){
                    int count = 0;
                    for (int k = 0; k < 8; k++) {
                        if(matrix[i][k] == 'q') count++;
                        if(count == 2){
                            condition = true;
                            break;
                        }
                    }
                    if(condition) break;
                    
                    count = 0;
                    for (int k = 0; k < 8; k++) {
                        if(matrix[k][j] == 'q') count++;
                        if(count == 2){
                            condition = true;
                            break;
                        }
                    }
                    if(condition) break;

                    count = 1;
                    for (int k = i + 1; k < 8; k++) {
                        if(count + j == 8){
                            break;
                        }
                            if(matrix[k][j + count] == 'q') {
                                condition = true;
                                break;
                            }
                            count++;
                    }
                    if(condition) break;

                    count = 1;
                    for (int k = i + 1; k < 8; k++) {
                            if(count > j){
                                break;
                            }
                            if(matrix[k][j - count] == 'q') {
                                condition = true;
                                break;
                            }
                            count++;
                    }
                    if(condition) break;

                    count = 1;
                    int count2 = 1;
                        while( i - count >= 0 && j - count2 >= 0){
                        if(matrix[i - count][j - count2] == 'q') {
                            condition = true;
                            break;
                        }
                        count++;
                        count2++;
                    }
                    if(condition) break;

                    count = 1;
                    for (int k = i- 1; k >=0 ; k--) {
                        if(j + count == 8){
                            break;
                        }
                        if(matrix[k][j + count] == 'q'){
                            condition = true;
                            break;
                        }
                        count++;
                    }

                    if(condition) break;

                    System.out.println(i + " " + j);
                    return;
                }
            }
                
            }
        }
    }
