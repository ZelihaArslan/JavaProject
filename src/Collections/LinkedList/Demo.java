package Collections.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

//Collections.LinkedList: birbirini işaret eder. Ekleme bastan olur.
// Programcının listeyi her iki yönde de geçmesine, yineleme sırasında listeyi değiştirmesine ve yineleyicinin listedeki mevcut konumunu almasına izin veren listeler için bir yineleyici.
public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        addInOrder(placesToVisit,"Sydney");
        addInOrder(placesToVisit,"Melbourne");
        addInOrder(placesToVisit,"Brisbane");
        addInOrder(placesToVisit,"Perth");
        addInOrder(placesToVisit,"Canberra");
        addInOrder(placesToVisit,"Darwin");
        printList(placesToVisit);  //alfabetik sıraya göre ekledi
        addInOrder(placesToVisit,"Alice Springs");
        addInOrder(placesToVisit,"Darwin");
        printList(placesToVisit);
        visit(placesToVisit);

    }
    private static void printList(LinkedList<String> linkedList){
        Iterator<String > i = linkedList.iterator();
        while(i.hasNext()){   //başka bir giriş var mı ? varsa onu yazdırıp bir sonraki değere geçiyor
            System.out.println("Now visiting "+i.next());
        }
        System.out.println("=======================");
    }

    private static boolean addInOrder(LinkedList<String >linkedList,String newCity){
        ListIterator<String> stringListIterator= linkedList.listIterator(); //bir liste oluşturarak onda next,hashnext yöntemleriyle dolaşabiliriz

        while (stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity); //sıradaki kayda geçer karşılastırma yaparak  bize bir sayı verir
            if(comparison ==0){  //0 a eşitse ekleme yapma aynı şehri tekrar ekleme gibi
                System.out.println(newCity+ " is already included as a destination");
                return false;
            }else if(comparison>0){
                stringListIterator.previous(); //yeni şehri önce ekle
                stringListIterator.add(newCity);
                return true;
            }else if(comparison< 0){
                                            //sıradaki şehri taşı
            }
        }
        stringListIterator.add(newCity);
        return true;
    }
    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward =true;  //ileri geri gitmesi için
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.getFirst() == ""){
            System.out.println("No cities in the itenenary");
            return;
        }else{
            System.out.println("Now visiting "+listIterator.next());
            printMenu();
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Holiday ( Vacation ) over");
                    quit = false;
                case 1:
                    if(!goingForward){  // gerçek mevüden önce ilerlemediğimizden emin olmak için bir test
                        if(listIterator.hasNext()){ //ileri gidip gitmediğini kontrol ediyoruz
                            listIterator.next();
                        }
                        goingForward =true; // ileri gidiyor
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now visiting "+listIterator.next());
                    }else {
                        System.out.println("Reached the end of the list");
                        goingForward =false;   // ilerleme olmaz çünkü listenin sonuna ulaştık
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){  // geri gitmek için önceki kayıt varsa önce ona girer
                            listIterator.previous();
                        }
                        goingForward = false; //ilerleme olmaz listenin
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting "+listIterator.previous());
                    }else{
                        System.out.println("We are at the start of the list");
                        goingForward = true;  // ilk girişe ulşatık , ileriyi gösterek bu yüzden tekrar ileriyi gösterek otomatik olarak yönü değiştiriyoruz.
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }

        }
    }
    private static void printMenu(){
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 -go to next city\n" +
                "2- go to previous\n" +
                "3- print menu options");
    }
}
