package aula86Date;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Aula86Date {

    public static void main(String[] args) {

        Date hoje = new Date();

        System.out.println(hoje);

        System.out.println("Milisegundos desde 1 Jan 1970 " + hoje.getTime());

        System.out.println(hoje.getDate());

        LocalDate localdate = LocalDate.now();
        System.out.println(localdate);

    }

}
