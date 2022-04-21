package aula54;

public class TesteEnum {
    public static void main(String[] args) {

        DiaSemana dia = DiaSemana.DOMINGO;

        System.out.println(dia.toString() + " - " + dia.getValor());

        Data data = new Data(1,4,2021,DiaSemana.SEXTA);

        Formulario formulario = new Formulario("Sergio", Formulario.Genero.MASCULINO);

        System.out.println(formulario.getNome());
        System.out.println( formulario.getGenero());

    }
}
