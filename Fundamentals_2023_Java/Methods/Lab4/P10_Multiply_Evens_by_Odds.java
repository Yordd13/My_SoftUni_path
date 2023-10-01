package L4.Methods.Lab;

import java.util.Scanner;

public class P10_Multiply_Evens_by_Odds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        num = Math.abs(num);

        ReturnSumOddAndEven(num);

    }
    public static int getSumEven(int num){
        int result = 0;
        while (num != 0){
            if((num % 10) % 2 == 0){
                result += (num % 10);
            }
            num /= 10;
        }
        return result;
    }

    public static int getSumOdd(int num){
        int result = 0;

        while (num != 0){
            if((num % 10) % 2 != 0){
                result += (num % 10);
            }
            num /= 10;
        }
        return result;
    }

    public static void ReturnSumOddAndEven(int n){
        int sumOdd = getSumOdd(n);
        int sumEven = getSumEven(n);

        System.out.println(sumEven * sumOdd);
    }
}
