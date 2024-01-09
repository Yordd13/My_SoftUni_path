package Stacks_and_Queues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P3_Decimal_To_Binary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        if(num == 0){
            stack.push(0);
        }

        while (num != 0){
            if(num % 2 == 0){
                stack.push(0);
            }
            else stack.push(1);
            num /= 2;
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }

    }
}
