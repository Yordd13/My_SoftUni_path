package Exam_Preparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P3_Inventory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> items = Arrays.stream(scan.nextLine().split(", ")).collect(Collectors.toList());

        while (true){
            String line = scan.nextLine();
            if(line.equals("Craft!")){
                break;
            }
            String[] input = line.split(" - ");
            String command = input[0];

            switch (command){
                case "Collect":
                    if(!items.contains(input[1])){
                        items.add(input[1]);
                    }
                    break;
                case "Drop":
                    items.remove(input[1]);
                    break;
                case "Combine Items":
                    String[] oldAndNew = input[1].split(":");
                    String oldItem = oldAndNew[0];
                    String newItem = oldAndNew[1];

                    if(items.contains(oldItem)){
                        items.add(items.indexOf(oldItem) +1,newItem);
                    }
                    break;
                case "Renew":
                    if(items.contains(input[1])){
                        items.remove(input[1]);
                        items.add(input[1]);
                    }
                    break;
            }
        }
        System.out.println(String.join(", ",items.stream().map(String::valueOf).collect(Collectors.toList())));
    }
}
