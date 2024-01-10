package Stacks_and_Queues.Exercises;


import java.util.ArrayDeque;
import java.util.Scanner;

public class P3_Maximum_Element {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] commands = scan.nextLine().split("\\s+");
            if(commands[0].equals("1")){
                stack.push(Integer.parseInt(commands[1]));
            }
            else if(commands[0].equals("2") && !stack.isEmpty()){
                stack.pop();
            }
            else if(commands[0].equals("3")){
                int max = Integer.MIN_VALUE;

                    for(Integer currNum : stack){
                        if(currNum > max){
                            max = currNum;
                        }
                    }

                System.out.println(max);
            }
        }
    }
}
