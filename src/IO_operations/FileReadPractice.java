package IO_operations;

import java.io.*;
import java.util.Scanner;

public class FileReadPractice {
    public static void main(String[] args) {

        String filePath = "Qovluq2/Textfayli.txt";


        try(FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)){

            String setr;
            System.out.println("Faylin mezmunu: ");
            while((setr = br.readLine()) != null){
                System.out.println(setr);
            }

        }catch (IOException e ){
            System.out.println("XETAAA--> " + e.getMessage());
        }




    }
}
