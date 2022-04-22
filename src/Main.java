import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar hoje = Calendar.getInstance();

        System.out.println(hoje);

        int ano = hoje.get(Calendar.YEAR);
        int mes = hoje.get(Calendar.MONTH);

        System.out.println(ano);
        System.out.println(mes + 1);
    }
}