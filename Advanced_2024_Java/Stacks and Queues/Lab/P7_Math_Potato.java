package Stacks_and_Queues.Lab;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class P7_Math_Potato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] kids = scan.nextLine().split("\\s+");

        PriorityQueue<String> queue = new PriorityQueue<>();

        Collections.addAll(queue,kids);

        int num = Integer.parseInt(scan.nextLine());

        int cycle = 1;
        while (queue.size() > 1){
            for (int i = 0; i < num; i++) {
                queue.offer(queue.poll());
            }

            if(isPrime(cycle)){
                System.out.println("Prime " + queue.peek());
            }
            else {
                System.out.println("Removed " + queue.peek());
                queue.poll();
            }
            cycle++;
        }
        System.out.println("Last is " + queue.peek());
    }
    public static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<=num/2;i++)
        {
            if((num%i)==0)
                return  false;
        }
        return true;
    }
}
