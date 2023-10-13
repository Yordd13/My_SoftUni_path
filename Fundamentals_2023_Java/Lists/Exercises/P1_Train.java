package Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P1_Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scan.nextLine().split(" ")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scan.nextLine());

        String[] input = scan.nextLine().split(" ");

        while(!input[0].equals("end")){
            if(input[0].equals("Add")){
                wagons.add(Integer.parseInt(input[1]));
            }
            else {
                int num = Integer.parseInt(input[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    if(num + wagons.get(i) <= maxCapacity){
                        int num1 = wagons.get(i);
                        wagons.remove(i);
                        wagons.add(i,num1 + num);
                        break;
                    }
                }
            }

            input = scan.nextLine().split(" ");
        }
        for (int i = 0; i < wagons.size(); i++) {
            System.out.print(wagons.get(i) + " ");
        }
    }
}
