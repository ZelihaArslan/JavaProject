import java.util.Random;
import java.util.Scanner;

public class PredictionGame {
    public static void main(String[] args){
        short tahmin_hakki=6;
        String message="Sayı tahmin oyununa hoşgeldiniz\n"
                +"Tahmin edilecek sayı 0 ile 20 arasındadır ve 6 tahmin hakkı vardır.\n"
                +"Tahmin bitince sonlanır.\n"
                +"Eğer isterseniz tekrar rastgele bir sayı atayarak oyunu tekrar başlatabilirsiniz.";
        while (true){
            System.out.println(message);
            Random random = new Random();
            int tahmin_edilecek_sayi= random.nextInt(20); //random rastgele deger al
            Scanner scanner = new Scanner(System.in);
            for(int i=tahmin_hakki;i>0;i++){
                int tahmin_edilen_sayi = scanner.nextInt();
                if(tahmin_edilecek_sayi == tahmin_edilen_sayi){
                    String message2 ="Tebrikler sayıyı dogru tahmin ettiniz\n"
                            +"Tekrar oynamak için 1 e cıkmak için 0 a tuşlayın";
                    System.out.println(message2);
                    int cevap = scanner.nextInt();
                    if(cevap==0){
                        System.out.println("Çıkış yapılıyor");
                        return;
                    }else{
                        break;
                    }
                } else if ((tahmin_edilecek_sayi!=tahmin_edilen_sayi)) {
                    System.out.println("Hatalı bir tahmin"+ "Kalan tahmin hakkı: "+(i-1));
                    if(i==1){
                        String message3="Tahmin hakkı bitti\n"
                                +"Oynamak için 1 e cımak için 0 a tıkla";
                        System.out.println(message3);
                        int cevap= scanner.nextInt();
                        if(cevap==0){
                            System.out.println("çıkış yapılıyor");
                            return;
                        }
                        else{
                            break;
                        }
                    }

                }
            }
        }

    }
    static void tahminOrani(int tahmin_edilen_sayi,int tahmin_edilecek_sayi){

    }
}
