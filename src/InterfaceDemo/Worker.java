package InterfaceDemo;
//bizim çalışanımız
public class Worker implements Workable,Eatable,Payable{

    @Override
    public void eat() {
        System.out.println("yemek saatleri");
    }

    @Override
    public void pay() {
        System.out.println("Ödeme günleri");
    }

    @Override
    public void work() {
        System.out.println("Çalışma saatleri");
    }
}
