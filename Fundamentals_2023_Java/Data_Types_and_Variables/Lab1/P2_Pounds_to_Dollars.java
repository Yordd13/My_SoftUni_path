package L2.Data_Types_and_Variables.Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class P2_Pounds_to_Dollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigDecimal poundsBritish = new BigDecimal(scan.nextLine());
        BigDecimal dollars = poundsBritish.multiply(BigDecimal.valueOf(1.36));

        System.out.printf("%.3f", dollars);
    }
}
