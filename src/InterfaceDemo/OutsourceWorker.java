package InterfaceDemo;

public class OutsourceWorker implements Workable{
    @Override
    public void work() {
        System.out.println("Dışardan çalışanlar");
    }
}
