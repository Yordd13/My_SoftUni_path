package Stacks_and_Queues.Exercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class P1_Reverse_Numbers_with_a_Stack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] numbers = scan.nextLine().split("\\s+");
        ArrayDeque<String> stack = new ArrayDeque<>();

        Collections.addAll(stack,numbers);

        while (!stack.isEmpty()){
            System.out.print(stack.pollLast() + " ");
        }
    }
}
