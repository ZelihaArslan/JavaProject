package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//Stream:Listeler ve Dizilerde çok daha kolay ve temiz kod yazılarak işlem yapılabilmektedir.
//Ardışık düzeni işlemek için tek bir iş parçacığı kullanan paralel olmayan stream.
public class Data {
    public static void main(String[] args) {
        List<Integer> sayilar = Arrays.asList(12,44,55,84,66,89,56);
        Stream<Integer>sayilarA = sayilar.stream();
        Stream<Integer>kucuk=sayilarA.filter(s->s<48); //48 den küçük sayılar
        kucuk.forEach(s-> System.out.println(s+"\n"));

        List<String >name = new ArrayList<>();
        name.add("Merve");
        name.add("Mehmet");
        name.add("Ali");
        name.add("Ayşe");
        System.out.println("");
        name.stream().limit(2).forEach(System.out::println); //ilk 2 ismi ekrana yazar
        System.out.println("");
        name.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);  //harf sırası yapar küçükten büyüğe

        System.out.println("");
        ArrayList<Integer> sayilar2 = new ArrayList<>();
        sayilar2.add(22);
        sayilar2.add(55);
        sayilar2.add(86);
        sayilar2.add(22);

        sayilar2.stream().distinct().forEach(System.out::println); //stream üzerinde, tekrar eden verileri siler

    }
}
