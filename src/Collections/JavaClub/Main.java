package Collections.JavaClub;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> a1 = new ArrayList<>();
        ArrayList<String> a2 = new ArrayList<String>();
        a1.add("Zeliş");
        a1.add("Merve");
        a1.add("Ali");
        for (String s:a1)
             {
                 System.out.println("Üye: "+s);
        }
        System.out.println("");
        a1.remove(2);
        a1.add("Esra");
        for(int i=0;i<a1.size();i++){
            System.out.println("Üye: "+a1.get(i));
        }
    }
}
