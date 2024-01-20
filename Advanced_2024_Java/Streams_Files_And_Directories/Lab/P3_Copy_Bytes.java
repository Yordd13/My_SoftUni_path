package Streams_Files_And_Directories.Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P3_Copy_Bytes {
    public static void main(String[] args) {

        String inputPath = "C:\\Users\\yordd\\OneDrive\\Работен плот\\input.txt";
        String outputPath = "C:\\Users\\yordd\\OneDrive\\Работен плот\\Problem3.txt";

        try (FileInputStream fileInputStream = new FileInputStream(inputPath)){
            FileOutputStream fileOutputStream = new FileOutputStream(outputPath);

            int oneBite = fileInputStream.read();
            while (oneBite >= 0){
                if((char) oneBite == ' ' || oneBite == 10){
                    fileOutputStream.write(oneBite);
                }
                else{
                    String el = String.valueOf(oneBite);
                    for (int i = 0; i < el.length(); i++) {
                        fileOutputStream.write(el.charAt(i));
                    }
                }
                oneBite = fileInputStream.read();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
