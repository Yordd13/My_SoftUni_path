import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int peopleAmount = Integer.parseInt(scan.nextLine());
        List<Integer> list = Arrays.stream(scan.nextLine().split(" "))
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());

        boolean emptySpots = false;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == 4){
                continue;
            }
            else {
                int addAmount = 0;
                if(peopleAmount >= 4) addAmount = 4 - list.get(i);
                else addAmount = peopleAmount;
                peopleAmount -= addAmount;
                list.set(i, list.get(i) + addAmount);
            }
            if(list.get(i) < 4){
                emptySpots = true;
                break;
            }
        }
        if(emptySpots && peopleAmount == 0){
            System.out.println("The lift has empty spots!");
            System.out.println(String.join(" ", list.stream().map(String::valueOf).collect(Collectors.toList())));
        }
        else if(peopleAmount != 0){
            System.out.printf("There isn't enough space! %d people in a queue!", peopleAmount);
            System.out.println();
            System.out.println(String.join(" ", list.stream().map(String::valueOf).collect(Collectors.toList())));
        }
        else System.out.println(String.join(" ", list.stream().map(String::valueOf).collect(Collectors.toList())));
    }
}
