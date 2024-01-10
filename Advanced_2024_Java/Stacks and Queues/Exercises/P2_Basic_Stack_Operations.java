package Stacks_and_Queues.Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P2_Basic_Stack_Operations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] controls = scan.nextLine().split("\\s+");
        int n = Integer.parseInt(controls[0]);
        int y = Integer.parseInt(controls[1]);
        int x = Integer.parseInt(controls[2]);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        String[] numbers = scan.nextLine().split("\\s+");
        for (int i = 0; i < n; i++) {
            stack.push(Integer.parseInt(numbers[i]));
        }
        while (!stack.isEmpty() && y > 0){
            stack.pop();
            y--;
        }

        if(stack.contains(x)){
            System.out.println("true");
        }
        else {
            int min = Integer.MAX_VALUE;

            if(stack.isEmpty()){
                min = 0;
            }
            else {
                while (!stack.isEmpty()) {
                    int el = stack.pop();
                    if (el < min) min = el;
                }
            }
            System.out.println(min);
        }
    }
}
