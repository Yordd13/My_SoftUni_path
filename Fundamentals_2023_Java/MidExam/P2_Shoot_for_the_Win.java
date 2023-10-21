package Exam_Preparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P2_Shoot_for_the_Win {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scan.nextLine().split(" ")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        int shotTargets = 0;
        while (true){

            String line = scan.nextLine();
            if(line.equals("End")){
                break;
            }

            int index = Integer.parseInt(line);

            if(index >= 0 && index < list.size() && list.get(index) != -1){
                shotTargets++;
                int variable = list.get(index);
                list.set(index,-1);
                for (int i = 0; i < list.size(); i++) {
                    if(list.get(i) > variable && list.get(i) != -1){
                        list.set(i,list.get(i) - variable);
                    }
                    else if(list.get(i) != -1){
                        list.set(i,variable + list.get(i));
                    }
                }
            }
        }
        System.out.print("Shot targets: " +shotTargets +" -> ");
        System.out.print(String.join(" ",list.stream().map(String::valueOf).collect(Collectors.toList())));
    }
}
