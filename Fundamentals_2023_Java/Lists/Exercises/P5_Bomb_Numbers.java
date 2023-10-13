package Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P5_Bomb_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scan.nextLine().split(" ")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        String[] bombInfo = scan.nextLine().split(" ");
        int bombNum = Integer.parseInt(bombInfo[0]);
        int bombPower = Integer.parseInt(bombInfo[1]);

        while (list.contains(bombNum)) {
            int indexBomb = list.indexOf(bombNum);
            for (int i = indexBomb - bombPower; i <= indexBomb + bombPower; i++) {
                if (i >= 0 && i < list.size()) {
                    list.remove(i);
                    indexBomb--;
                    i--;
                }
            }
        }

        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        System.out.println(sum);
    }
}
