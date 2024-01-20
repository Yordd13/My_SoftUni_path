package Streams_Files_And_Directories.Exercises;

import java.io.FileInputStream;
import java.io.IOException;

public class P1_Sum_Lines {
    public static void main(String[] args) {
        String path = "C:\\Users\\yordd\\OneDrive\\Работен плот\\input.txt";

        try (FileInputStream fileInputStream = new FileInputStream(path)){
            int oneBite = fileInputStream.read();
            int sum = 0;
            while (oneBite >= 0){
               if(oneBite == 13){
                   System.out.println(sum);
                   sum = 0;
               }
               else if(oneBite == 10){
                   sum = 0;
               }
               else sum += oneBite;
               oneBite = fileInputStream.read();
            }
            System.out.println(sum);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
