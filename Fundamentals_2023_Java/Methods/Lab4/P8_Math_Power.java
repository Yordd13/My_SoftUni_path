package L4.Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P8_Math_Power {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(new DecimalFormat("0.####").format(ReturnNumRaised(Double.parseDouble(scan.nextLine()),Integer.parseInt(scan.nextLine()))));

    }

    public static double ReturnNumRaised(double num, int times){
        double multiplyNum = num;
        for (int i = 1; i < times; i++) {
            num *= multiplyNum;
        }
        return num;
    }
}
