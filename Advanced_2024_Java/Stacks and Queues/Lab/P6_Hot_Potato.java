package Stacks_and_Queues.Lab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class P6_Hot_Potato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] kids = scan.nextLine().split("\\s+");

        ArrayDeque<String> queue = new ArrayDeque<>();

        Collections.addAll(queue,kids);

        int num = Integer.parseInt(scan.nextLine());
        int num2 = num;

        while (queue.size() > 1){


            if(num == 1){
                System.out.println("Removed " + queue.peek());
                queue.poll();
                num = num2;
                continue;
            }

            String kid = queue.poll();
            queue.offer(kid);
            num--;

        }
        System.out.println("Last is " + queue.peek());

    }
}
