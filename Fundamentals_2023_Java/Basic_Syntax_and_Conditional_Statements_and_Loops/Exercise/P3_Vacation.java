package L1.Basic_Syntax_and_Conditional_Statements_and_Loops.Exercise;

import java.util.Scanner;

public class P3_Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int people = Integer.parseInt(scan.nextLine());
        String type = scan.nextLine();
        String day = scan.nextLine();

        double bill = 1;
        switch (day){
            case "Friday":
                switch (type){
                    case "Students":
                        bill *= 8.45;
                        break;
                    case "Business":
                        bill *= 10.90;
                        break;
                    case "Regular":
                        bill *= 15;
                        break;
                }
                break;
            case "Saturday":
                switch (type){
                    case "Students":
                        bill *= 9.80;
                        break;
                    case "Business":
                        bill *= 15.60;
                        break;
                    case "Regular":
                        bill *= 20;
                        break;
                }
                break;
            case "Sunday":
                switch (type){
                    case "Students":
                        bill *= 10.46;
                        break;
                    case "Business":
                        bill *= 16;
                        break;
                    case "Regular":
                        bill *= 22.50;
                        break;
                }
                break;
        }

        if(people >= 30 && type.equals("Students")) bill *= 0.85;
        if(people >= 100 && type.equals("Business")) people -= 10;
        if(people >= 10 && people <= 20 && type.equals("Regular")) bill *= 0.95;

        bill *= people;

        System.out.printf("Total price: %.2f", bill);
    }
}
