package IO_operations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Task4 {
    public static void main(String[] args) {


        try (FileReader fr = new FileReader("input.txt");
             BufferedReader br = new BufferedReader(fr)){

            int lineCount = 1;
            String line;
            while((line = br.readLine())!=null) {
                System.out.println(lineCount + "-ci setr--> " + line);
                lineCount++;
            }

            }catch (IOException e){
            System.out.println("XETA -> " + e.getMessage());
        }


    }
}
