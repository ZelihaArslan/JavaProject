package Thread;

public class Officer extends Thread {
    public String isim;

    public Officer(String isim) {
        this.isim = isim;
    }

    @Override
    public void run() {
        super.run();
        for(int i=0;i<3;i++){
            System.out.println(isim + "--> "+this.getPriority()+"--- "+i+" çalışıyor");
        }
    }
}
