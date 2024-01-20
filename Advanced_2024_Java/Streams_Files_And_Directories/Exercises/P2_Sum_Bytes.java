package Streams_Files_And_Directories.Exercises;

import java.io.FileInputStream;
import java.io.IOException;

public class P2_Sum_Bytes {
    public static void main(String[] args) {
        String path = "C:\\Users\\yordd\\OneDrive\\Работен плот\\input.txt";

        try (FileInputStream fileInputStream = new FileInputStream(path)){
            int oneBite = fileInputStream.read();
            long sum = 0;
            while (oneBite >= 0){
                sum += oneBite;
                if(oneBite == 13){
                    sum -= 13;
                }
                else if(oneBite == 10){
                    sum -= 10;
                }
                oneBite = fileInputStream.read();
            }
            System.out.println(sum);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
