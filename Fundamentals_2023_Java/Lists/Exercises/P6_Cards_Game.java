package Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P6_Cards_Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> list1 = Arrays.stream(scan.nextLine().split(" ")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(scan.nextLine().split(" ")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        int i = 0;
        while(list1.size() > 0 && list2.size() > 0){

                if(list1.get(i) > list2.get(i)){
                    int cardBetter = list1.get(i);
                    int cardWorse = list2.get(i);
                    list1.remove(i);
                    list1.add(cardBetter);
                    list1.add(cardWorse);
                    list2.remove(i);
                }
                else if(list1.get(i).equals(list2.get(i))){
                    list1.remove(i);
                    list2.remove(i);
                }
                else {
                    int cardBetter = list2.get(i);
                    int cardWorse = list1.get(i);
                    list2.remove(i);
                    list2.add(cardBetter);
                    list2.add(cardWorse);
                    list1.remove(i);
            }
        }
        int sum = 0;
        if(list1.size() != 0){
            for (Integer s: list1){
                sum += s;
            }
            System.out.printf("First player wins! Sum: %d",sum);
        }
        else {
            for (Integer s: list2){
                sum += s;
            }
            System.out.printf("Second player wins! Sum: %d",sum);
        }
    }
}
