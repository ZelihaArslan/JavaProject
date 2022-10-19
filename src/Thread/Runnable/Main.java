package Thread.Runnable;

public class Main {
    public static void main(String[] args) {
        Professor p1= new Professor("Pınar");
        Thread t1 = new Thread(p1);
        p1.work();
        t1.start();


    }
}
