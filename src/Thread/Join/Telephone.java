package Thread.Join;

public class Telephone extends Thread{
    public int number;

    public Telephone(int number) {
        this.number=number;
    }

    @Override
    public void run() {
        super.run();
        for(int i=0;i<10000;i++){
            System.out.println(number+" numaralı cihaz çalışıyor"+ "--->"+i);
        }
    }

}
