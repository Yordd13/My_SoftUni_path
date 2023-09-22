package L2.Data_Types_and_Variables.Exercise;

import java.util.Scanner;

public class P5_Print_Part_Of_ASCII_Table {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());

        for (int i = start; i <= end; i++) {
            System.out.print(Character.toString(i) + " ");
        }
    }
}
