package Task2;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();
        director.getNamePost();
        worker.getNamePost();
        accountant.getNamePost();
    }
}
