package Thread.Join;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Telephone telephone = new Telephone(1);
        Television television = new Television(2);
        telephone.start();
       // telephone.join(1000,5000000);  //önce 1 numaralı,1 sn sonra  2 numaralı cihaz çalışmaya baslar. Sırasıyla

        television.start();
    }
}
