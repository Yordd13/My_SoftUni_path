package Stacks_and_Queues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P8_Browser_History_Upgrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayDeque<String> queue = new ArrayDeque<>();

        while (!input.equals("Home")){

            if(input.equals("back")){
                if(stack.size() < 2){
                    System.out.println("no previous URLs");
                }
                else{
                    queue.push(stack.pop());
                    System.out.println(stack.peek());
                }
            }
            else if(input.equals("forward")){
                if(queue.isEmpty()){
                    System.out.println("no next URLs");
                }
                else {
                    String curr = queue.pop();
                    System.out.println(curr);
                    stack.push(curr);
                }
            }
            else {
                stack.push(input);
                System.out.println(input);
                queue.clear();
            }

            input = scan.nextLine();
        }
    }
}
