package IO_operations;

import java.io.File;
import java.io.IOException;

public class practice1 {
    public static void main(String[] args) {

    File dir = new File("Test2");

    if(!dir.exists()){
        if(dir.mkdir()) System.out.println("Qovluq yaradildi---> " + dir.getAbsolutePath());
    }

    File file = new File(dir.getName() + File.separator + "file.txt");

    if(!file.exists()){
        try{
            if(file.createNewFile()) System.out.println("Fayl yaradildi ---> " + file.getAbsolutePath());

        }catch (IOException e){

            System.out.println("Xeta bas verdi --->  " + e.getMessage());
        }



    }


    }
}
