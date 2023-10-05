package L4.Methods.Exercise;

import java.util.Scanner;

public class P8_Factorial_Division {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long num1 = Integer.parseInt(scan.nextLine());
        long num2 = Integer.parseInt(scan.nextLine());

        double output = getFactorial(num1) * 1.0/ getFactorial(num2);
        System.out.printf("%.2f",output);
    }
    public static long getFactorial(long num){
        long result = 1;
        while (num > 1) {
            result *= num;
            num--;
        }
        return result;
    }
}
