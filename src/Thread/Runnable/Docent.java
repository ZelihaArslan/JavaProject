package Thread.Runnable;

public class Docent implements Runnable{
        public String name;

    public Docent(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            for(int i=0;i<=5;i++){
                System.out.println("Profesör ders anlatıyor--->"+i);
            }
        }catch (Exception e){
            System.out.println("Hata oluştu "+e);
        }
    }
}
