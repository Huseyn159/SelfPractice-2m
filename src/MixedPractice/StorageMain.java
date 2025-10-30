package MixedPractice;

public class StorageMain {
    public static void main(String[] args) {
        Storage<String> names = new Storage<>();
        Storage<Integer> id = new Storage<>();

        names.addItem("Notebook");
        names.addItem("Notebook");
        names.addItem("PC");
        names.addItem("Mouse");
        id.addItem(123);
        id.addItem(63);
        id.addItem(632);

        names.showItems();
        id.showItems();
        names.removeItem("Mouse");
        names.removeItem("Apple");
        names.showItems();
    }
}
