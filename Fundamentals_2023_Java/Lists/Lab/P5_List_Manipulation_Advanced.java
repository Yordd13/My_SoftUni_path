package Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P5_List_Manipulation_Advanced {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" ")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        String[] input = scan.nextLine().split(" ");

        while(!input[0].equals("end")){
            String action = input[0];
            switch (action){
                case "Contains":
                    int num = Integer.parseInt(input[1]);
                    boolean isNumInList = numbers.contains(num);

                    if(isNumInList) System.out.println("Yes");
                    else System.out.println("No such number");

                    break;
                case "Print":
                    String action2 = input[1];
                    if(action2.equals("even")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if(numbers.get(i) % 2 == 0){
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    else {
                        for (int i = 0; i < numbers.size(); i++) {
                            if(numbers.get(i) % 2 != 0){
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (int i = 0; i < numbers.size(); i++) {
                        sum += numbers.get(i);
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    action2 = input[1];
                    int num2 = Integer.parseInt(input[2]);
                    switch (action2){
                        case "<":
                            for (int i = 0; i < numbers.size(); i++) {
                                if(numbers.get(i) < num2){
                                    System.out.print(numbers.get(i) + " ");
                                }
                            }
                            break;
                        case ">":
                            for (int i = 0; i < numbers.size(); i++) {
                                if(numbers.get(i) > num2){
                                    System.out.print(numbers.get(i) + " ");
                                }
                            }
                            break;
                        case "<=":
                            for (int i = 0; i < numbers.size(); i++) {
                                if(numbers.get(i) <= num2){
                                    System.out.print(numbers.get(i) + " ");
                                }
                            }
                            break;
                        case ">=":
                            for (int i = 0; i < numbers.size(); i++) {
                                if(numbers.get(i) >= num2){
                                    System.out.print(numbers.get(i) + " ");
                                }
                            }
                            break;
                    }
                    System.out.println();
                    break;
            }

            input = scan.nextLine().split(" ");
        }
    }
}
