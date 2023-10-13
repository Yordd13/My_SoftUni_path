package Lists.Exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P2_Change_List {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" ")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        String[] input = scan.nextLine().split(" ");

        while (!input[0].equals("end")){
            switch (input[0]){
                case "Delete":
                    int num1 = Integer.parseInt(input[1]);
                    numbers.removeAll(Collections.singleton(num1));
                    break;
                case "Insert":
                    num1 = Integer.parseInt(input[1]);
                    int num2 = Integer.parseInt(input[2]);
                    numbers.add(num2,num1);
                    break;
            }

            input = scan.nextLine().split(" ");
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
