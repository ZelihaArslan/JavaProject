package Thread;
//Thread: herhangi bir işlemi gerçekleştiren, her iş için ayrı thread oluşturarak ratgele sıralarda oluşarak işlem yapar
// belli bir zaman vererek aynı anda yapabilir
public class Main {
    public static void main(String[] args) {
        Officer officer=new Officer("Görevli1-A");
        Officer officer1 = new Officer("Görevli2-B");
        Officer officer2 = new Officer("Görevli3-C");

        officer.setPriority(Thread.MIN_PRIORITY);
        officer1.setPriority(Thread.NORM_PRIORITY);
        officer2.setPriority(Thread.MAX_PRIORITY);

        officer.start();  //thread lerin çalışma şekli
        officer1.start();
        officer2.start();
        System.out.println("İş parçacıkları(Thread) çalışmaya başladı");

    }
}
