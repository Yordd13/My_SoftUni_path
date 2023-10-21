import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class test2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> list = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());

        int moves = 0;
        while (true){
            String line = scan.nextLine();

            if(line.equals("end")){
                break;
            }

            moves++;
            String[] input = line.split(" ");
            int index1 = Integer.parseInt(input[0]);
            int index2 = Integer.parseInt(input[1]);

            if(index1 == index2 || index1 < 0 || index1 >= list.size() || index2 < 0 || index2 >= list.size()){
                String addElement = "-" + moves + "a";
                list.add(list.size()/2, addElement);
                list.add(list.size()/2, addElement);
                System.out.println("Invalid input! Adding additional elements to the board");
                continue;
            }

            if(list.get(index1).equals(list.get(index2))){
                System.out.printf("Congrats! You have found matching elements - %s!%n", list.get(index1));
                list.remove(index1);
                if(index2 == 0){
                    list.remove(index2);
                }
                else list.remove(index2 - 1);
            }
            else {
                System.out.println("Try again!");
            }
            if(list.isEmpty()){
                System.out.printf("You have won in %d turns!%n", moves);
                return;
            }
        }
        System.out.println("Sorry you lose :(");
        System.out.println(String.join(" ", list.stream().map(String::valueOf).collect(Collectors.toList())));
    }
}
