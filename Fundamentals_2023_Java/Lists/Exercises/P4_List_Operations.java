package Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P4_List_Operations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" ")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        String[] input = scan.nextLine().split(" ");

        while (!input[0].equals("End")){
            String action = input[0];
            switch (action){
                case "Add":
                    int num1 = Integer.parseInt(input[1]);
                    numbers.add(num1);
                    break;
                case "Insert":
                    num1 = Integer.parseInt(input[1]);
                    int num2 = Integer.parseInt(input[2]);
                    if(num2 >=0 && num2 < numbers.size()){
                        numbers.add(num2,num1);
                    }
                    else System.out.println("Invalid index");
                    break;
                case "Remove":
                    num1 = Integer.parseInt(input[1]);
                    if(num1 >= 0 && num1 < numbers.size()){
                        numbers.remove(num1);
                    }
                    else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    int count = Integer.parseInt(input[2]);
                    if(input[1].equals("left")){
                        int changeNum = numbers.get(0);
                        for (int i = 1; i <= count; i++) {
                            numbers.remove(0);
                            numbers.add(changeNum);
                            changeNum = numbers.get(0);
                        }
                    }
                    else if(input[1].equals("right")){
                        int changeNum = numbers.get(numbers.size()-1);
                        for (int i = 1; i <= count; i++) {
                            numbers.remove(numbers.size()-1);
                            numbers.add(0,changeNum);
                            changeNum = numbers.get(numbers.size()-1);
                        }
                    }
                    break;
            }

            input = scan.nextLine().split(" ");
        }
        for (int num : numbers){
            System.out.print(num + " ");
        }
    }
}
