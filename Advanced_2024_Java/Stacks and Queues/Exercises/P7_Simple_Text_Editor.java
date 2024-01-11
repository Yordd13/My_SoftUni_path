package Stacks_and_Queues.Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P7_Simple_Text_Editor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        ArrayDeque<String> stack = new ArrayDeque<>();
        String text = "";

        for (int i = 0; i < n; i++) {
            String[] token = scan.nextLine().split(" ");

            switch (token[0]) {
                case "1":
                    stack.push(text);
                    text += token[1];
                    break;
                case "2":
                    stack.push(text);
                    int count = Integer.parseInt(token[1]);
                    text = text.substring(0, text.length() - count);
                    break;
                case "3":
                    int index = Integer.parseInt(token[1]);
                    System.out.println(text.charAt(index - 1));
                    break;
                case "4":
                    text = stack.pop();
                    break;
            }
        }
    }
}
