package aula55;

import aula54.DiaSemana;

public class TesteEnum {
    public static void main(String[] args) {
        //Importando Enum da aula 54

        // 'values' retorna um array de todos os valores dentro do enumerador.
        DiaSemana[] dias = DiaSemana.values();

        // Imprime os dias da semana do enum da aula 54
        for (int i = 0; i<dias.length; i++){
            System.out.println(dias[i]);
        }

        System.out.println("");
        //for melhorado

        for (DiaSemana dia : DiaSemana.values()){
            System.out.println(dia);
        }
    }
}
