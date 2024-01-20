package Streams_Files_And_Directories.Lab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class P5_Write_Every_Third_Line {
    public static void main(String[] args) throws IOException {

        String root = System.getProperty("user.dir");

        String inputPath = root + "C:\\Users\\yordd\\OneDrive\\Работен плот\\Problem4.txt";
        String outputPath = root + "C:\\Users\\yordd\\OneDrive\\Работен плот\\Problem5.txt";


            List<String> data = Files.readAllLines(Paths.get(inputPath));

            for (int i = 0; i < data.size(); i++) {
                if((i + 1) % 3 == 0){
                    Files.writeString(Paths.get(outputPath),data.get(i) + System.lineSeparator(),StandardOpenOption.APPEND);
                }
            }

        }


    }

