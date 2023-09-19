package L1.Basic_Syntax_and_Conditional_Statements_and_Loops.Lab;

import java.util.Scanner;

public class P6_Foreign_Languages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String language = scan.nextLine();

        switch (language){
            case "USA":
                System.out.println("English");
                break;
            case "England":
                System.out.println("English");
                break;
            case "Spain":
                System.out.println("Spanish");
                break;
            case "Argentina":
                System.out.println("Spanish");
                break;
            case "Mexico":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}
