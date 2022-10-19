package Thread;

public class Sleep extends Thread {

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 100; i++) {
            System.out.println("İş parçacığı uyuyor.");
            try {
                Thread.sleep(3000);  //iş parcacıgının belirli bir süre uyuması
            } catch (InterruptedException e) {
                System.out.println("Çalışma sırasında hata oluştu");

            }
        }
    }

    public static void main(String[] args) {
        Sleep sleep = new Sleep();
        sleep.start();
        sleep.interrupt();  //uyuyan bir thread i uyandırmak için start dan sonra çalışır.
    }

}
