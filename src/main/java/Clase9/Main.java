package Clase9;

import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Esto es Date: "+date);
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Fecha formateada: "+sdf.format(date));
        System.out.println("Esto es un Calendar: "+calendar);
        LocalDate localDate = LocalDate.now();
        System.out.println("Esto es un LocalDate : "+localDate);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Esto es un LocalDateTime : "+localDateTime);
        System.out.println("Esto es un LocalDateTime menos 1 dia : "+localDateTime.minusDays(1));
        LocalTime localTime = LocalTime.now();
        System.out.println("Esto es un localTime : "+localTime);
        //ZoneId zonaLondres = ZoneId.of("Europe/London");
        ZoneId zoneBogota = ZoneId.of("America/Bogota");
        ZonedDateTime fechaHoraConZona = (LocalDateTime.now()).atZone(zoneBogota);
        System.out.println("Esto es un ZonedDateTime : "+fechaHoraConZona);

    }
}
