package Objects_and_Classes.Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class P2_Sum_Big_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        BigInteger result = BigInteger.valueOf(1);

        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);
    }
}
