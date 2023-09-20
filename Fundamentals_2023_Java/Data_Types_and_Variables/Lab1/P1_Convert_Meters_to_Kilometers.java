package L2.Data_Types_and_Variables.Lab;

import java.util.Scanner;

public class P1_Convert_Meters_to_Kilometers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int meters = Integer.parseInt(scan.nextLine());

        double kilometers = meters * 1.0 / 1000;

        System.out.printf("%.2f", kilometers);
    }
}
