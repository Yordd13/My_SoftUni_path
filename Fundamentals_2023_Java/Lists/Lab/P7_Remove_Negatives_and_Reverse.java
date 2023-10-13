package Lists.Lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P7_Remove_Negatives_and_Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" ")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) < 0){
                numbers.remove(i);
                i--;
            }
        }

        if(numbers.isEmpty()){
            System.out.println("empty");
        }
        else {
            Collections.reverse(numbers);
            for (int i = 0; i < numbers.size(); i++) {
                System.out.print(numbers.get(i) + " ");
            }
        }
    }
}
