package Stacks_and_Queues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P2_Simple_Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();

        String input = scan.nextLine();

        String[] tokens = input.split(" ");

        for (String token : tokens) {
            stack.add(token);
        }

        while (stack.size() > 1){
            int first = Integer.parseInt(stack.pop());
            String op = stack.pop();
            int second = Integer.parseInt(stack.pop());

            switch (op){
                case "+":
                    stack.push(Integer.toString(first+second));
                    break;
                case "-":
                    stack.push(Integer.toString(first - second));
                    break;
            }
        }

        System.out.println(stack.peek());
    }
}
