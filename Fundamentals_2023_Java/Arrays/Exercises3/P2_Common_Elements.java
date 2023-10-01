package L3.Arrays.Exercises;

import java.util.Scanner;

public class P2_Common_Elements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] row1 = scan.nextLine().split(" ");
        String[] row2 = scan.nextLine().split(" ");

        for (int i = 0; i < row2.length; i++) {

            for (int j = 0; j < row1.length; j++) {
                if(row1[j].equals(row2[i])){
                    System.out.print(row1[j] + " ");
                }
            }
        }
    }
}
