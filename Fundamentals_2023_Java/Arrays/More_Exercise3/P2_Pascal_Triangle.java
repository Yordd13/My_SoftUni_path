package L3.Arrays.More_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P2_Pascal_Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int digitsRow = 1;
        int[] row = new int[60];
        int[] row2 = new int[60];
        while(digitsRow < n + 1){

            int[] currentRow = new int[digitsRow];

            if(digitsRow < 3){
                for (int i = 0; i < digitsRow; i++) {
                    currentRow[i] = 1;
                }
                System.out.println(String.join(" ",Arrays.stream(currentRow).mapToObj(e -> String.valueOf(e)).toArray(String[]::new)));
                digitsRow++;
                row2 = currentRow;
                continue;
            }
            else {
                if(digitsRow == 3){
                    currentRow = row2;
                    for (int i = 0; i < digitsRow; i++) {

                        if(i + 1 < digitsRow - 1){
                            currentRow[i] += currentRow[i+1];
                        }
                    }
                    for (int k = 0; k < currentRow.length + 1; k++) {
                        if(k == 0){
                            row[k] = 1;
                        }
                        else {
                            row[k] = currentRow[k-1];
                        }
                    }
                }
                else {
                    for (int i = 1; i < currentRow.length; i++) {
                        currentRow[i] = row[i-1];
                    }
                    currentRow[0] = 1;
                    for (int h = 1; h < currentRow.length; h++) {
                        if(h + 1 < digitsRow){
                            currentRow[h] += currentRow[h+1];
                        }
                    }
                     row = currentRow;
                    }
                }

            digitsRow++;
            for (int i = 0; i < row.length; i++) {
                if(row[i]==0){
                    break;
                }
                else {
                    System.out.print(row[i] + " ");
                }
            }
            System.out.println();
            }

        }
    }
