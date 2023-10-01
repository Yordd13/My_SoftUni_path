package L4.Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P11_Math_Operations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        char operator = scan.nextLine().charAt(0);
        int num2 = Integer.parseInt(scan.nextLine());

        System.out.println(new DecimalFormat("0.##").format(ReturnOperation(num1,operator, num2)));

    }
    public static double ReturnOperation(int num1, char operator, int num2){
        double result = 0;
        if(operator == '+'){
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        }
        else result = num1 * 1.0/ num2;
        return result;
    }
}
