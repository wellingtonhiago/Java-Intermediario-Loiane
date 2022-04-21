package aula55;

import aula53.DiaSemana;

public class TesteEnum2 {
    public static void main(String[] args) {

        //Importado enumerador DiaSemana da aula 53

        //Retorna o proprio dia da semana
        System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));

        //Transformando String em uma instancia do enumerador
        DiaSemana dia = Enum.valueOf(DiaSemana.class, "SEGUNDA");
        System.out.println(dia);

    }
}
