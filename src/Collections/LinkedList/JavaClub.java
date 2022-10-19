package Collections.LinkedList;

import java.util.LinkedList;

public class JavaClub {
    public static void main(String[] args) {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("Zeliha");
        linked.add("Ali");
        linked.add("Ayşe");
        for(String list:linked){
            System.out.println("Üye: "+list);
        }
        System.out.println("2. üye: "+linked.get(1));
        linked.add(0,"Mehmet");
        System.out.println(linked);
    }
}
