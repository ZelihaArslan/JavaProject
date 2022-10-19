package Thread;

public class Employeer extends Thread {
    public String name;
    public int task_count;

    public Employeer(String name, int task_count) {
        this.name = name;
        this.task_count = task_count;
    }

    @Override
    public void run() {
        super.run();
        if (task_count == 0) {  //belirli bir koşula göre threadler in çalışması
            return;
        }
        for (int i = 0; i < task_count; i++) {
            System.out.println(name + "-->" + i + " çalışıyor");
        }

    }

    public static void main(String[] args) {
        Employeer employeer = new Employeer("Aylin",3);
        Employeer employeer1 = new Employeer("Ali",5);
        Employeer employeer2 = new Employeer("Sibel",4);

        employeer.start();
        employeer1.start();
        employeer2.start();
        System.out.println("Thread'ler çalışmaya basladı");
    }
}