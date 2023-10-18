package Exam_Preparation;

import java.util.Scanner;

public class P1_Guinea_Pig {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double food = Double.parseDouble(scan.nextLine());
        double hay = Double.parseDouble(scan.nextLine());
        double cover = Double.parseDouble(scan.nextLine());
        food *= 1000;
        hay *= 1000;
        cover *= 1000;
        double weight = Double.parseDouble(scan.nextLine());
        weight *= 1000;

        boolean outOfFood = false;
        for (int i = 1; i <= 30; i++) {
            food -= 300;
            if(i % 2 == 0){
                hay -= food * 0.05;
            }
            if(i % 3 == 0){
                cover -= weight * (1 * 1.0/3);
            }
            if(food <=0 || hay <= 0 || cover <= 0){
                outOfFood = true;
                break;
            }
        }
        if(outOfFood){
            System.out.println("Merry must go to the pet store!");
        }
        else System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", food / 1000, hay /1000, cover / 1000);
    }
}
