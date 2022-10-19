package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapKent {
    public static void main(String[] args) {
      Map<Integer,String > kent = new HashMap<>();
      kent.put(34,"İstanbul");
      kent.put(06,"Ankara");
      kent.put(35,"İzmir");
      kent.put(01,"Adana");
      kent.put(07,"Antalya");
      for(Integer i:kent.keySet()){
          System.out.println("Plaka: "+i+ "-->"+"Kent: "+kent.get(i));
      }
      kent.remove(01);
        System.out.println("");
        System.out.println("Kentler: "+kent);
        kent.put(34,"Edirne"); //istanbul yerine edirne
        System.out.println("");
        System.out.println("Kentler: "+kent);
        System.out.println("İzmir depolandı mı?  "+kent.containsKey(35));

        for(Map.Entry<Integer,String> m2:kent.entrySet()){
          //map içinde tanımlanan entrySet sayesinde map arayüzünü set arayüzüne dönüştürebiliriz.
          // Entry içinde tanımlanan getKey ve getValue ile degerler alınabilir.
          System.out.println("Plaka: "+m2.getKey()+"-->"+"Kent: "+m2.getValue());
        }


    }
}
