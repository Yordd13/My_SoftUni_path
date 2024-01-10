package Stacks_and_Queues.Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P6_Recursive_Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        ArrayDeque<Long> stack = new ArrayDeque<>();
        if(n == 0){
            System.out.println(1);
            return;
        }
        else if(n==1){
            System.out.println(1);
            return;
        }
        else {
            stack.push((long) 1);
            stack.push((long) 1);
        }

        for (int i = 2; i <= n; i++) {
            long num1 = stack.pop();
            long num2 = stack.pop();

            stack.push(num1);
            stack.push(num1 + num2);
        }
        System.out.println(stack.peek());

    }
}
