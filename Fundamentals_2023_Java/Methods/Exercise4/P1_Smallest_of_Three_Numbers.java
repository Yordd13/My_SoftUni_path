package L4.Methods.Exercise;

import java.util.Scanner;

public class P1_Smallest_of_Three_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        getLowest(num1,num2,num3);

    }

    public static void getLowest(int num1, int num2, int num3){
        if(num1 < num2 && num1 < num3){
            System.out.println(num1);
        }
        else if(num2 < num1 && num2 < num3){
            System.out.println(num2);
        }
        else System.out.println(num3);
    }

}
