package aula89SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Aula89SimpleDateFormat {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a z");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MMM/yyyy hh:mm:ss a z");
        SimpleDateFormat sdf3 = new SimpleDateFormat("d/M/y");
        SimpleDateFormat sdf4 = new SimpleDateFormat("dd/MMM/yyyy");
        SimpleDateFormat sdf5 = new SimpleDateFormat("dd/MMM/yyyy hh");

        Calendar data = new GregorianCalendar(2010, 5, 4, 14, 32, 25);

        System.out.println(sdf.format(data.getTime()));
        System.out.println(sdf2.format(data.getTime()));
        System.out.println(sdf3.format(data.getTime()));
        System.out.println(sdf4.format(data.getTime()));
        System.out.println(sdf5.format(data.getTime()));

        Date hoje = new Date();

        System.out.println(sdf.format(hoje));

        String d = sdf.format(hoje);

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        String minhaData = "20/02/2000";

        try {
            Date minhaDataEmDate = sdf1.parse(minhaData);

            System.out.println(minhaDataEmDate);

            System.out.println(sdf.format(minhaDataEmDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
