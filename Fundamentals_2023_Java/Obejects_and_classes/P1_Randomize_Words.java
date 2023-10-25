package Objects_and_Classes.Lab;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Random;

public class P1_Randomize_Words {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> input = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());
        List<String> output = new ArrayList<>();

        Random rnd = new Random();

        for (int pos1 = 0; pos1 < input.size(); pos1++) {
            int pos2 = rnd.nextInt(input.size());
            output.add(input.get(pos2));
            input.remove(pos2);
            pos1--;
        }

        for (String word : output){
            System.out.println(word);
        }
    }
}
