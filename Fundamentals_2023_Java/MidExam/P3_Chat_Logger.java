package MidExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P3_Chat_Logger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        List<String> output = new ArrayList<>();
        while (true){

            String[] input = scan.nextLine().split(" ");
            String command = input[0];
            if(command.equals("end")){
                break;
            }

            switch (command){
                case "Chat":
                    output.add(input[1]);
                    break;
                case "Delete":
                        output.remove(input[1]);
                    break;
                case "Edit":
                    if(output.contains(input[1])){
                        output.set(output.indexOf(input[1]),input[2]);
                    }
                    break;
                case "Pin":
                    if(output.contains(input[1])){
                        output.remove(input[1]);
                        output.add(input[1]);
                    }
                    break;
                case "Spam":
                    for (int i = 1; i < input.length; i++) {
                        String spam = input[i];
                        output.add(spam);
                    }
                    break;
            }
        }
        for (String s : output) {
            System.out.println(s);
        }
    }
}
