package Abstract.Game;

public class Main {
    public static void main(String[] args) {
        WomanGameCalculator gameCalculator = new WomanGameCalculator();
        ManGameCalculator manGameCalculator =  new ManGameCalculator();
        manGameCalculator.hesapla();
        gameCalculator.hesapla();
        gameCalculator.gameOver();

        //yeni bir calculator eklerken daha kullanışlı, abstract lar new'lenemez!
       GameCalculator gameCalculator1 = new KidsGameCalculator();
       gameCalculator1.hesapla();
    }
}
