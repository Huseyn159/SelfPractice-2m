package MixedPractice;

public class TodoMain {
    public static void main(String[] args) {
    TodoManager<String> todo1 = new TodoManager<>();

    todo1.addTask("Learning Java");
    todo1.addTask("Generic Practice");
    todo1.addTask("Call Friends");
    todo1.addTask("Learning Java");

    todo1.showAll();

    todo1.removeTask("Learning Java");



    }
}
