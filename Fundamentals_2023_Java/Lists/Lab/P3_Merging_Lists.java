package Lists.Lab;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class P3_Merging_Lists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> list1 = Arrays.stream(scan.nextLine().split(" ")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        List<Integer> list2 = Arrays.stream(scan.nextLine().split(" ")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        int min = Math.min(list1.size(), list2.size());

        List<Integer> result = new ArrayList<>();

        boolean condition = false;

        if(list1.size() > list2.size()){
            for (int i = 0;i <= min; i++) {
                if(!condition){
                    result.add(list1.get(i));
                    condition = true;
                    continue;
                }
                if(condition){
                    result.add(list2.get(i - 1));
                    i--;
                    condition = false;
                }
            }
            for (int i = list2.size() + 1; i < list1.size(); i++) {
                result.add(list1.get(i));
            }
        }
        else {
            for (int i = 0;i < min; i++) {
                if(!condition){
                    result.add(list1.get(i));
                    condition = true;
                    continue;
                }
                if(condition){
                    result.add(list2.get(i - 1));
                    i--;
                    condition = false;
                }
            }
            for (int i = list1.size() - 1; i < list2.size(); i++) {
                result.add(list2.get(i));
            }
        }

        for (int i = 0; i < result.size(); i++){
            System.out.print(result.get(i) + " ");
        }
    }
}
