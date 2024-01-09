package Stacks_and_Queues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P5_Printer_Queue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        ArrayDeque<String> queue = new ArrayDeque<>();

        while (!input.equals("print")){

            if(!input.equals("cancel")){
                queue.offer(input);
            }
            else {
                if(!queue.isEmpty()){
                    System.out.printf("Canceled %s%n", queue.peek());
                    queue.poll();
                }
                else{
                    System.out.println("Printer is on standby");
                }
            }

            input = scan.nextLine();
        }

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
