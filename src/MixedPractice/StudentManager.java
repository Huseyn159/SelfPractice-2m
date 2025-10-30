package MixedPractice;

import java.util.Set;
import java.util.TreeSet;

public class StudentManager {
    Set<Student> students = new TreeSet<>();

    public void addStudent(Student st){
        if(students.add(st)){
            System.out.println("✅ Added: " + st);
        }
        else {
            System.out.println("⚠️ Already exists  : " + st);
        }


    }
    public void showAll(){
        System.out.println("🎓 Sorted students:");
        for (Student s : students){
            System.out.println(" - " + s);
        }
    }
}
