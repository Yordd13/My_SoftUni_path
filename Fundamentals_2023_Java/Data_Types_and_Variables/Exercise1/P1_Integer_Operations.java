package L2.Data_Types_and_Variables.Exercise;

import java.util.Scanner;

public class P1_Integer_Operations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());
        int num4 = Integer.parseInt(scan.nextLine());

        int result = (num1 + num2) / num3 * num4;
        System.out.println(result);
    }
}
