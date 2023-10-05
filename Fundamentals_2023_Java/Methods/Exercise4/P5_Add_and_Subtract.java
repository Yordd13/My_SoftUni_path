package L4.Methods.Exercise;

import java.util.Scanner;

public class P5_Add_and_Subtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());

        getSubtract(getSum(num1, num2), num3);
    }

    public static int getSum(int num1, int num2){
        return num1 + num2;
    }
    public static void getSubtract(int num1, int num2){
        System.out.println(num1 - num2);
    }
}
