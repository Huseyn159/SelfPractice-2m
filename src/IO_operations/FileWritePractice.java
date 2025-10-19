package IO_operations;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritePractice {
    public static void main(String[] args) {
        File dir = new File("Qovluq2");

        if(!dir.exists()){
            if(dir.mkdir()) System.out.println("Qovluq yaradildi --> " + dir.getAbsolutePath());

        }

        File file = new File(dir.getName() + File.separator + "TextFayli.txt");

        if (!file.exists()){
            try{
                if(file.createNewFile()) System.out.println("Fayl ugurla yaradildi");
            }catch (IOException e){
                System.out.println("Xeta ---> " + e.getMessage());
            }


        }

        String filePath = file.getPath();

        try(FileWriter fr = new FileWriter(filePath);
            BufferedWriter yazici = new BufferedWriter(fr)){

            yazici.write("Birinci setir belenciiiye");
            yazici.newLine();
            yazici.write("Bu da ikinci setr");

            System.out.println("Melumatlar fayla ugurla yazildi ---> " + filePath);


        }catch (IOException e){
            System.out.println("XETA ---> " + e.getMessage());
        }
}
}
