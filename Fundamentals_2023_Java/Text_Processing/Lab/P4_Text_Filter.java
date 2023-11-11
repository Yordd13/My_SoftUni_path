package Text_Processing.Lab;

import java.util.Scanner;

public class P4_Text_Filter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] banList = scan.nextLine().split(", ");
        String text = scan.nextLine();

        for (int i = 0; i < banList.length; i++) {
            if(text.contains(banList[i])){
                text = text.replace(banList[i],"*".repeat(banList[i].length()));
                i = 0;
            }
        }
        System.out.println(text);
    }
}
