package Stacks_and_Queues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P1_Browser_History {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        ArrayDeque<String> stack = new ArrayDeque<>();

        while (!input.equals("Home")){

            if(!input.equals("back")){
                stack.push(input);
                System.out.println(input);
            }
            else {
                if(stack.size() <= 1){
                    System.out.println("no previous URLs");
                }
                else{
                    stack.pop();
                    System.out.println(stack.peek());
                }
            }

            input = scan.nextLine();
        }
    }
}
