package IO_operations;

import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("story.txt");
            BufferedWriter bw = new BufferedWriter(fw)){

            bw.write("Java çox maraqlıdır.");
            bw.newLine();
            bw.write("BufferedWriter istifadə edirik.");
            bw.newLine();
            bw.write("Sətir-sətir oxuyaq.");

        }catch (IOException e){
            System.out.println("Xeta --> " + e.getMessage());
        }


    try(FileReader fr = new FileReader("story.txt");
           BufferedReader br = new BufferedReader(fr)){

        String line;
        int lineCount = 1;
        while ((line = br.readLine())!= null){
            System.out.println(lineCount + "-ci setr: " + line);
            lineCount ++ ;
        }

    }catch(IOException e){
        System.out.println("Xeta --> " + e.getMessage());
    }


}
}
