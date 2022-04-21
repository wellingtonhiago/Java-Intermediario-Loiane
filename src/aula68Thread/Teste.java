package aula68Thread;

public class Teste {
    public static void main(String[] args) {

        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("Carro 1", 900);
        //Thread t1 = new Thread(thread1);
        //t1.start();

        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("Carro 2", 900);

        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("Carro 3", 900);
    }

}
