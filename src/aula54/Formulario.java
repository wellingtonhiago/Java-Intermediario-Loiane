package aula54;

public class Formulario {

    enum Genero{
        FEMININO('F'), MASCULINO('M');

        private char valor;

        Genero(char valor){
            this.valor = valor;
        }
    }

    private String nome;
    private Genero genero; //Foi criado a enum dentro da classe Formulario (logo a cima) para ser criado esse atributo

    public Formulario() {
    }

    public Formulario(String nome, Genero genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
