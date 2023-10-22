package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P2_Friend_List_Maintenance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> friends = Arrays.stream(scan.nextLine().split(", ")).collect(Collectors.toList());

        int counterBlacklist = 0;
        int counterLost = 0;
        while (true){
            String line = scan.nextLine();
            if(line.equals("Report")){
                break;
            }
            String[] input = line.split(" ");
            String command = input[0];

            switch (command){
                case "Blacklist":
                    String name = input[1];
                    if(friends.contains(name)){
                        friends.set(friends.indexOf(name),"Blacklisted");
                        System.out.printf("%s was blacklisted.%n", name);
                        counterBlacklist++;
                    }
                    else System.out.printf("%s was not found.%n", name);
                    break;
                case "Error":
                    int index = Integer.parseInt(input[1]);

                    if(index >=0 && index < friends.size() && !friends.get(index).equals("Lost") && !friends.get(index).equals("Blacklisted")){
                        String name1 = friends.get(index);
                        System.out.printf("%s was lost due to an error.%n", name1);
                        friends.set(index,"Lost");
                        counterLost++;
                    }
                    break;
                case "Change":
                    int index1 = Integer.parseInt(input[1]);
                    String newName = input[2];

                    if(index1 >=0 && index1 < friends.size()){
                        String oldName = friends.get(index1);
                        friends.set(index1,newName);
                        System.out.printf("%s changed his username to %s.%n", oldName, newName);
                    }
                    break;
            }
        }
        System.out.printf("Blacklisted names: %d%n",counterBlacklist);
        System.out.printf("Lost names: %d%n",counterLost);
        System.out.println(String.join(" ", friends.stream().map(String::valueOf).collect(Collectors.toList())));
    }
}
