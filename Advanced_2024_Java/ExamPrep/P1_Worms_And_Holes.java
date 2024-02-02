package ExamPrep;

import java.util.*;
import java.util.stream.Collectors;

public class P1_Worms_And_Holes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<Integer> wormsStack = new ArrayDeque<>();

        List<Integer> wormsInput = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        for (Integer integer : wormsInput) {
            wormsStack.push(integer);
        }

        ArrayDeque<Integer> holesQueue = new ArrayDeque<>();
        List<Integer> holesInput = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        for (Integer integer : holesInput) {
            holesQueue.offer(integer);
        }

        int countMatches = 0;
        while (true){
            if(wormsStack.peek() == holesQueue.peek()){
                wormsStack.pop();
                holesQueue.poll();
                countMatches++;
            }
            else {
                int worm = wormsStack.peek();
                holesQueue.poll();
                wormsStack.pop();
                wormsStack.push(worm-3);

                if(wormsStack.peek() <= 0){
                    wormsStack.pop();
                }
            }
            if(wormsStack.isEmpty() || holesQueue.isEmpty()){
                break;
            }
        }

        if(countMatches != 0){
            System.out.printf("Matches: %d%n",countMatches);
        }
        else {
            System.out.println("There are no matches.");
        }

        if(!wormsStack.isEmpty()){
            System.out.print("Worms left: ");
            while (!wormsStack.isEmpty()){
                if(wormsStack.size() == 1){
                    System.out.print(wormsStack.pop() + "\n");
                }
                else {
                    System.out.print(wormsStack.removeLast() + ", ");
                }

            }
        }
        else if(countMatches == wormsInput.size()){
            System.out.println("Every worm found a suitable hole!");
        }
        else {
            System.out.println("Worms left: none");
        }

        if(holesQueue.isEmpty()){
            System.out.println("Holes left: none");
        }
        else {
            System.out.print("Holes left: ");
            while (!holesQueue.isEmpty()){
                if(holesQueue.size() == 1){
                    System.out.print(holesQueue.poll() + "\n");
                }
                else System.out.print(holesQueue.poll() + ", ");
            }
        }

    }
}
