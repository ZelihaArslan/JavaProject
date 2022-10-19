package Thread.Runnable;
//bu sınıfta extend ederek Runnable arayüzüyle thread leri kullanabildik., birden fazla kez belli periyotlarla çalışmasını istersek runnable kullanabiliriz.
public class Professor extends Docent{
    public Professor(String name) {
        super(name);
    }
    void work(){
        System.out.println(name+" görevinin başında");
    }
}
