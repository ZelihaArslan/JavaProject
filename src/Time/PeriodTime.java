package Time;

import javax.swing.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class PeriodTime {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2022, Month.APRIL,10);
        LocalDate localDate1 = localDate.minusWeeks(2);  //2 hafta önce
        System.out.println("Önceki tarih: "+localDate);
        System.out.println("Güncel tarih: "+localDate1);
        int a = Period.between(localDate1,localDate).getDays();
        System.out.println("İki tarih arasındaki fark: "+a);

        LocalTime localTime = LocalTime.of(23,42);
        LocalTime localTime1 = LocalTime.of(10,19);
        long a2 = Duration.between(localTime1,localTime).getSeconds();  //saniye farkı
        JOptionPane.showMessageDialog(null,"Zaman farkı(saniye)"+a2);

        System.out.println(localDate.format(DateTimeFormatter.ofPattern("MMMM.dd.yyyy"))) ;  //formatlanmış tarih
        System.out.println(localTime.format(DateTimeFormatter.ofPattern("HH.mm")));  //formatlanmış saat

    }
}
