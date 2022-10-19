package Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2019, Month.APRIL,1,0,0);
        System.out.println("Tanımlanan zaman: "+localDateTime);
        localDateTime=LocalDateTime.now();
        System.out.println("Şu an: "+localDateTime );
        System.out.println("Şu anki tarih: "+localDateTime.toLocalDate());
        System.out.println("Şu anki saat: "+localDateTime.toLocalTime());

        LocalDateTime dun = localDateTime.minusDays(1); //önceki gün
        System.out.println("Dün ayın: "+dun.getDayOfMonth()+" idi");  //ayın gün sayısı
        System.out.println("Dün günlerden "+dun.getDayOfWeek()+" idi"); //haftanın günleri

        System.out.println("Yeni saat tarih: "+localDateTime.format(DateTimeFormatter.ofPattern("HH.mm d.MM.yyyy")));  //tarih ve saat formatlandı
    }
}
