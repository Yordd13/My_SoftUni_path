package L3.Arrays.More_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P5_Kamino_Factory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lengthDNA = Integer.parseInt(scan.nextLine());
        int[] output = new int[lengthDNA];

        String input= scan.nextLine();

        int sample = 0;
        int bestSample = 0;
        int best = Integer.MIN_VALUE;
        int leftMostBest = Integer.MIN_VALUE;
        int sumBest = Integer.MIN_VALUE;
        while(!input.equals("Clone them!")){
            sample++;
            int[] currentRow = Arrays.stream(input.split("!+")).mapToInt(e -> Integer.parseInt(e)).toArray();
            int longest = 0;
            int leftMost = 0;
            int sum = 0;

            for (int i = 0; i < lengthDNA; i++) {
                if(i != currentRow.length-1 && currentRow[i+1] + currentRow[i] == 2){
                    if(longest == 0){
                        leftMost = i;
                    }
                    longest++;
                }
                sum += currentRow[i];
            }

            if(best < longest){
                best = longest;
                leftMostBest = leftMost;
                output = currentRow;
                sumBest = sum;
                bestSample = sample;
            }
            else if(best == longest){
                if(leftMostBest > leftMost){
                    output = currentRow;
                    sumBest = sum;
                    bestSample = sample;
                    leftMostBest = leftMost;
                }
                else if(leftMostBest == leftMost){
                    if(sumBest < sum){
                        sumBest = sum;
                        output = currentRow;
                        bestSample = sample;
                    }
                }
            }


            input = scan.nextLine();
        }
        if(sumBest == 0){
            bestSample = 1;
        }

        System.out.printf("Best DNA sample %d with sum: %d.%n",bestSample , sumBest);
        System.out.println(String.join(" ", Arrays.stream(output).mapToObj(e -> String.valueOf(e)).toArray(String[]::new)));
    }
}
