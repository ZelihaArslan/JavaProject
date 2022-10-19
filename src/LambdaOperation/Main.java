package LambdaOperation;

import java.util.Scanner;

interface Islem {
    int islem_yap(int x, int y);

    static String adimi_oku(String a) {
        return a;
    }

    public static void main(String[] args) {
       Islem islem = new Islem() {
           @Override
           public int islem_yap(int x, int y) {
               return x + y;
           }
       };

       Islem islem2 = (x,y) ->x+y;  //input: x,y--lambda operatorü, lambda gövdesi
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        int s1 = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int s2 = scanner.nextInt();
        int sonuc = islem2.islem_yap(s1,s2);
        System.out.println("Sonuç: "+sonuc);
    }
}