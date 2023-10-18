package Exam_Preparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P2_Shopping_List {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> shopList = Arrays.stream(scan.nextLine().split("!")).collect(Collectors.toList());

        while (true){
            String line = scan.nextLine();
            if(line.equals("Go Shopping!")){
                break;
            }

            String[] input = line.split(" ");
            String command = input[0];

            switch (command){
                case "Urgent":
                    if(!shopList.contains(input[1])){
                        shopList.add(0,input[1]);
                    }
                    break;
                case "Unnecessary":
                        shopList.remove(input[1]);
                    break;
                case "Correct":
                    String oldItem = input[1];
                    String newItem = input[2];

                    if(shopList.contains(oldItem)){
                        int index = shopList.indexOf(oldItem);
                        shopList.set(index,newItem);
                    }
                    break;
                case "Rearrange":
                    if(shopList.contains(input[1])){
                        shopList.remove(input[1]);
                        shopList.add(input[1]);
                    }
                    break;
            }
        }
        System.out.println(String.join(", ", shopList.stream().map(String::valueOf).collect(Collectors.toList())));
    }
}
