package GenericClassPractice.BankAccountInterestCalculator;

public class StudentAccount extends BankAccount{
    private String universityName;
    private String studentName;

    public StudentAccount(double balance, String universityName, String studentName) {
        super(balance);
        this.universityName = universityName;
        this.studentName = studentName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
