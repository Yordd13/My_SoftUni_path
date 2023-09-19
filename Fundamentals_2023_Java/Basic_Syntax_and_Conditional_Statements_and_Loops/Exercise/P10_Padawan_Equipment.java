package L1.Basic_Syntax_and_Conditional_Statements_and_Loops.Exercise;

import java.util.Scanner;

public class P10_Padawan_Equipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double balance = Double.parseDouble(scan.nextLine());
        int studentsAmount = Integer.parseInt(scan.nextLine());
        double priceSaber = Double.parseDouble(scan.nextLine());
        double priceRobe = Double.parseDouble(scan.nextLine());
        double priceBelt = Double.parseDouble(scan.nextLine());

        int freeBelts = studentsAmount / 6;

        double priceAll = priceSaber * Math.ceil(studentsAmount * 1.10) + priceRobe * studentsAmount + priceBelt * (studentsAmount - freeBelts);

        if(priceAll <= balance){
            System.out.printf("The money is enough - it would cost %.2flv.", priceAll);
        }
        else System.out.printf("George Lucas will need %.2flv more.", priceAll - balance);
    }
}
