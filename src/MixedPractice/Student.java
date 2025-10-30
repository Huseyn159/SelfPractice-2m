package MixedPractice;



public class Student implements Comparable<Student> {
    private  String name;
    private  double grade;

    public Student(String name, Double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }


    @Override
    public int compareTo(Student other) {
        int gradeCompare =  Double.compare(this.grade, other.grade);
        if(gradeCompare == 0 ) {
            return this.name.compareToIgnoreCase(other.name);

        }
        return gradeCompare;
    }

    @Override
    public String toString() {
        return name + " (" + grade + ")";
    }


}
