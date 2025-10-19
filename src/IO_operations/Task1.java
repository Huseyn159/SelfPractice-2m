package IO_operations;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("story.txt")){
            fw.write("Salam, bu Java dünyasıdır.\n");
            fw.write("Bu ikinci sətirdir.\n");
            fw.write("Oxumağa davam et!\n");

        }catch (IOException e){
            System.out.println("XETA --> " + e.getMessage());
        }

        try(FileReader fr = new FileReader("story.txt")){

            int ch;
            while ((ch = fr.read()) != -1){
                System.out.print((char)ch);
            }

        }catch (IOException e){
            System.out.println("XETA --> " + e.getMessage());
        }

    }
}
