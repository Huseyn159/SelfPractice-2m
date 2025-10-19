package IO_operations;

import java.io.File;
import java.io.IOException;

public class IO_streams {

    public static void main(String[] args) {

        File dir = new File("my_app_data");

        if(!dir.exists()){
            if(dir.mkdir())  System.out.println("Qovluq yaradildi: " + dir.getName());
        }

        File file = new File(dir.getName() + File.separator + "data.txt");

        if(!file.exists()){
            try{
                if (file.createNewFile()){
                    System.out.println("Fayl yaradildi: " + file.getName());
                }
            }catch (IOException e){
                System.out.println("Fayl yaradilerken xeta bas verdi: " + e.getMessage());

            }
        }

        System.out.println("Fayln tam yolu: " + file.getAbsolutePath());

        System.out.println("Bu bir fayldir? " + file.isFile());

        System.out.println("Qovluqdur? " + file.isDirectory());



    }

}
