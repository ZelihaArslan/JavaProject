package methodOverloading;

public class DortIslem {

    //Method overloading  aynı method farklı parametreler alarak işlem yapabilir
    public int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public int topla(int sayi1, int sayi2, int sayi3){
        return sayi1 + sayi2;
    }
}
