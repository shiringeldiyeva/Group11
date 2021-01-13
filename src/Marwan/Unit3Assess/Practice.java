package Marwan.Unit3Assess;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Practice {

    public static void main(String[] args) {

        LocalDate d1 = LocalDate.now();
        LocalTime t1 = LocalTime.now();
        LocalDate myDob = LocalDate.of(1986, 04, 13);
        LocalDate hisDob = LocalDate.of(1986, 05, 13);


        LocalDateTime dt = LocalDateTime.of(1986, 5, 11, 5, 4, 3, 5000);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM/EEEE/YYY");
        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm:ss:a");

        System.out.println(myDob.isBefore(hisDob));

        LocalDate newDate = LocalDate.of(1990,4,15);
        LocalTime newTime = LocalTime.of(5,40,55);
        System.out.println(newTime.plusHours(1).format(tf));

        System.out.println(newDate.plusMonths(10).format(df));


        System.out.println(dt.format(df));
        System.out.println(t1.format(tf));
    }
}
