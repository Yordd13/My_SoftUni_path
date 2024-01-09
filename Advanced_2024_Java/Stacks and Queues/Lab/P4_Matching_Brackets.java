package Stacks_and_Queues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P4_Matching_Brackets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        ArrayDeque<Integer> stacks = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            if(ch == '('){
                stacks.push(i);
            }
            else if(ch == ')'){
                 int start = stacks.pop();
                 String content = input.substring(start, i + 1);
                System.out.println(content);
            }
        }
    }
}
