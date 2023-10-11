package Lists.Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P1_Sum_Adjacent_Equal_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scan.nextLine().split(" ")).map(e -> Double.parseDouble(e)).collect(Collectors.toList());

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i).equals(numbers.get(i + 1))){
                numbers.set(i, numbers.get(i) + numbers.get(i +1));
                numbers.remove(i + 1);
                i = -1;
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(new DecimalFormat("0.###").format(numbers.get(i)) + " ");
        }
    }
}
