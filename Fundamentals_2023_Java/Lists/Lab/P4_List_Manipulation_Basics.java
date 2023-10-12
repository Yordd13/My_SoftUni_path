package Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P4_List_Manipulation_Basics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" ")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        String[] input = scan.nextLine().split(" ");

        while(!input[0].equals("end")){
            String action = input[0];
            if(action.equals("Add")){
                numbers.add(Integer.parseInt(input[1]));
            }
            else if(action.equals("Remove")){
                int num = Integer.parseInt(input[1]);

                for (int i = 0; i < numbers.size(); i++) {
                    if(numbers.get(i) == num){
                        numbers.remove(i);
                        break;
                    }
                }
            }
            else if(action.equals("RemoveAt")){
                numbers.remove(Integer.parseInt(input[1]));
            }
            else {
                numbers.add(Integer.parseInt(input[2]),Integer.parseInt(input[1]));
            }

            input = scan.nextLine().split(" ");
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
