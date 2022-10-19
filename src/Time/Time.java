package Time;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Time {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(4,30,18);
        System.out.println("Saat: "+localTime.getHour());
        System.out.println("Dakika: "+localTime.getMinute());
        System.out.println("Saniye: "+localTime.getSecond());

        localTime=LocalTime.now();
        System.out.println("Anlık saat: "+localTime);
        LocalTime localTime1 = LocalTime.parse("10:10");
        System.out.println(localTime1);

        for(String z: ZoneId.getAvailableZoneIds()){
            System.out.println(z); //sistemde tanımdı saat dilimleri

        }
        System.out.println("");
        System.out.println("Mevcut saat dilimi: "+ZoneId.systemDefault());
        System.out.println(ZonedDateTime.now(ZoneId.of("America/Merida"))); //yerel saati bulur

    }
}
