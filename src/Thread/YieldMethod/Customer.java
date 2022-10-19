package Thread.YieldMethod;

import javax.swing.text.DefaultEditorKit;

//Yield: bir thread çalışırken aynı önceliğe sahip baska thread lerin de çalışmasını sağlar.
//Sleep metodu böyle bir ayrım yapmaz.
public class Customer extends Thread{
    public String name;

    public Customer(String name) {
        this.name = name;
    }

    public static void main(String[] args) throws InterruptedException {
        Customer customer = new Customer("Zeliha");
        Customer customer1 = new Customer("Gözde");
        Customer customer2 = new Customer("Merve");
        Thread.sleep(1000);  //thread uyuması hayatta olmadıgı anlamına gelmez
        customer.start();
        customer1.start();
      //  customer2.start();


        System.out.println("Müşteri 1 hayatta mı? " +customer.isAlive());
        System.out.println("Müşteri 2 hayatta mı? " +customer1.isAlive());
        System.out.println("Müşteri 3 hayatta mı? " +customer2.isAlive());
        Thread.sleep(1000);

    }

    @Override
    public void run() {
        super.run();
        for(int i=0;i<5;i++){
            System.out.println(name+"-->"+i);
            Thread.yield();  //aynı öncelikteki iki thread de çalışmaya basladı. Static bir metot
        }
    }
}
