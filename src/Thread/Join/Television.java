package Thread.Join;

public class Television extends Thread {
    public int number;

    public Television(int number) {
        this.number=number;
    }

    @Override
    public void run() {
        super.run();
        for(int i=0;i<10000;i++){
            System.out.println(number+" numaralı cihaz çalışıyor "+"---> "+i);
        }
    }
}
