package L2.Data_Types_and_Variables.Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class P3_Exact_Sum_of_Real_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        BigDecimal output = new BigDecimal(0);
        for (int i = 0; i < n; i++) {
            BigDecimal number = new BigDecimal(scan.nextLine());
            output = output.add(number);
        }

        System.out.println(output);
    }
}
