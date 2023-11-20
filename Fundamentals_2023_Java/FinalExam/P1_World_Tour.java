package FInalExamPrep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P1_World_Tour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String stops = scan.nextLine();
        List<Character> output = new ArrayList<>();

        for (char ch : stops.toCharArray()){
            output.add(ch);
        }

        while (true){
            String line = scan.nextLine();
            String[] input = line.split(" ");

            if(input[0].equals("Travel")){
                break;
            }

            if(input[0].equals("Add")){
                String[] command = input[1].split(":");
                int index = Integer.parseInt(command[1]);


                String string = command[2];

                if(index >= 0 && index < output.size()){
                    for (int i = string.length() - 1; i >= 0; i--) {
                        output.add(index,string.charAt(i));
                    }
                }

            }
            else if(input[0].equals("Remove")){
                String[] command = input[1].split(":");
                int indexStart = Integer.parseInt(command[1]);
                int indexEnd = Integer.parseInt(command[2]);

                if(indexStart >= 0 && indexStart < output.size() && indexEnd >= indexStart && indexEnd < output.size()){
                    for (int i = indexStart; i <= indexEnd; i++) {
                        output.remove(indexStart);
                    }
                }
            }
            else {
                String[] command = line.split(":");
                String old = command[1];
                String neW = command[2];

                String line1 = "";
                for (char ch : output) {
                    line1 += ch;
                }
                line1 = line1.replaceAll(old,neW);
                output.clear();

                for (char ch : line1.toCharArray()){
                    output.add(ch);
                }
            }


            for (char ch : output) {
                System.out.print(ch);
            }
            System.out.println();
        }
        System.out.print("Ready for world tour! Planned stops: ");
        output.forEach(System.out::print);
    }
}
