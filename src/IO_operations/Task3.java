package IO_operations;

import java.io.*;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {



    File dir = new File("my_app_data");

    if(!dir.exists()){
        if(dir.mkdir()) System.out.println("Qovluq yaradildi: " + dir.getName());
    }else {
        System.out.println("Qovluq movcuddur --> " + dir.getAbsolutePath());
    }

    File file = new File(dir,"data.txt");

    try {
        if (!file.exists()) {
            if (file.createNewFile()) System.out.println("Fayl Yaradildi: " + file.getName());
        }else {
            System.out.println("Fayl movcuddur -- > " + file.getAbsolutePath());
        }
    }catch (IOException e ){
        System.out.println("Xeta --> " + e.getMessage());
    }

    try(FileWriter fw = new FileWriter(file.getPath());
        BufferedWriter bw = new BufferedWriter(fw)){
        bw.write("Ilk yeni setr");
        bw.newLine();
        bw.write("Ikinci setr yeni");

    }catch(IOException e){
        System.out.println("Xeta --> " + e.getMessage());
    }

    try(FileReader fr = new FileReader(file.getPath());
        BufferedReader br = new BufferedReader(fr)){

        int lineCount = 1;
        String line;
        while((line = br.readLine())!=null){
            System.out.println(lineCount + "-ci setr--> " +line);
            lineCount++;

        }


    }catch (IOException e){
        System.out.println("Xeta --> " + e.getMessage());
    }

        Scanner sc = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println("Emeliyyat Secin:\n1-Qovluqu sil\n2-File-i sil\n3-Sistemden cixis");
        int choice = sc.nextInt();
        sc.close();

        switch (choice){
            case 1 -> {
                System.out.println(dir.getName() + " Silindi...");
                file.delete();
                dir.delete();

            }
            case 2 -> {
                System.out.println(file.getName() + " Silindi...");
                file.delete();
            }
            case 3 ->{
                System.out.println("Sondurulur...");
                System.exit(0);
            }
        }

}

}
