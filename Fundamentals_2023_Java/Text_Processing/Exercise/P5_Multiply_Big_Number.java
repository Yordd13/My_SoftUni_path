package Text_Processing.Exercises;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class P5_Multiply_Big_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigDecimal num1 = new BigDecimal(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());

        num1 = num1.multiply(BigDecimal.valueOf(num2));
        System.out.println(num1);
    }
}
