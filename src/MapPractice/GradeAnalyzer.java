package MapPractice;

import java.util.HashMap;
import java.util.Map;

public class GradeAnalyzer {
    public static void main(String[] args) {

        Map<String,Double> students = new HashMap<>();
        students.put("Ali",85.0);
        students.put("Ramin",92.0);
        students.put("Orxan",73.0);
        students.put("Sara",88.0);

        String lowestStudent = " ";
        String bestStudent = " ";
        double topGrade = 0;
        double lowestGrade = 100;
        double sum = 0;
        for (Map.Entry<String,Double> entry : students.entrySet()){
            sum+=entry.getValue();
            if (entry.getValue()>topGrade){
                topGrade=entry.getValue();
                bestStudent = entry.getKey();
            }if (entry.getValue()<lowestGrade){
                lowestGrade = entry.getValue();
                lowestStudent = entry.getKey();
            }

        }
        double avarage = sum/students.size();
        System.out.println("Average = "+ avarage);
        System.out.println("Top student: " + bestStudent + "("+topGrade+")");
        System.out.println("Lowest: " + lowestStudent + "("+lowestGrade+")");


    }
}
