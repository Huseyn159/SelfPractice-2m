package MixedPractice;

public class StudentMain {
    public static void main(String[] args) {



    StudentManager manager = new StudentManager();
    Student st1 = new Student("Tofiq",75.6);
    Student st2 = new Student("Cavad",98.6);
    Student st3 = new Student("Cavad",74.5);
    Student st4 = new Student("Oruc",98.6);
    Student st5 = new Student("Oruc",98.6);


    manager.addStudent(st1);
    manager.addStudent(st2);
    manager.addStudent(st3);
    manager.addStudent(st4);
    manager.addStudent(st5);

        manager.showAll();




}
}
