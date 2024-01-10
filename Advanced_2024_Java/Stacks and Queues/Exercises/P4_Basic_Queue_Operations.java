package Stacks_and_Queues.Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P4_Basic_Queue_Operations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        String[] controls = scan.nextLine().split("\\s+");
        int n = Integer.parseInt(controls[0]);
        int s = Integer.parseInt(controls[1]);
        int x = Integer.parseInt(controls[2]);

        String[] numbers = scan.nextLine().split("\\s+");

        for (int i = 0; i < n; i++) {
            queue.offer(Integer.parseInt(numbers[i]));
        }
        while (!queue.isEmpty() && s > 0){
            queue.poll();
            s--;
        }

        if(queue.contains(x)){
            System.out.println("true");
        }
        else {
            int min = Integer.MAX_VALUE;

            if(queue.isEmpty()){
                min = 0;
            }
            else {
                while (!queue.isEmpty()) {
                    int el = queue.poll();
                    if (el < min) min = el;
                }
            }
            System.out.println(min);
        }
    }
}
