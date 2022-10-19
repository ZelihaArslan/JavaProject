package InterfaceDemo;

public class Main {
    public static void main(String[] args) {
        OutsourceWorker worker = new OutsourceWorker();
        worker.work();
        Worker worker1 = new Worker();
        worker1.pay();
        worker1.eat();

    }
}
