package Stacks_and_Queues.Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P5_Balanced_Parentheses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<Character> stack = new ArrayDeque<>();

        String input = scan.nextLine();
        if(input.length() % 2 != 0){
            System.out.println("NO");
            return;
        }
        else if(input.isEmpty()){
            System.out.println();
            return;
        }

        for (int i = 0; i < input.length(); i++) {
            char el = input.charAt(i);
            if(el == '(' || el == '{' || el == '[') stack.push(el);
            else {
                if(stack.isEmpty()){
                    System.out.println("NO");
                    return;
                }
                else {
                    char el1 = stack.pop();
                    if(el1 == '(' && el == ')' || el1 == '{' && el == '}' || el1 == '[' && el == ']'){
                        continue;
                    }
                    else {
                        System.out.println("NO");
                        return;
                    }
                }
            }
        }
        System.out.println("YES");
    }
}
