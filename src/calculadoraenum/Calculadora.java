package calculadoraenum;

public class Calculadora {

    enum Operacao{

        SOMAR("+"){
            public double executarOperacao(double num1, double num2){
                return num1 + num2;
            }
        },
        SUBTRAIR("-"){
            public double executarOperacao(double num1, double num2){
                return num1 - num2;
            }
        },
        MULTIPLICAR("*") {
            public double executarOperacao(double num1, double num2) {
                return num1 * num2;
            }
        },
        DIVIDIR("/") {
            public double executarOperacao(double num1, double num2) {
                return num1 / num2;
            }
        };


        private String simbolo;

        Operacao(String simbolo){
            this.simbolo = simbolo;
        }

        public abstract double executarOperacao(double num1, double num2);


        public String toString(){
            return this.simbolo;
        }

    }






    public static void main(String[] args) {

        double num1 = 10.0;
        double num2 = 2.0;
        System.out.println( Operacao.DIVIDIR.toString());

       for (Operacao op : Operacao.values()){
           System.out.print(num1 + " ");
           System.out.print(op.toString() + " ");
           System.out.print(num2 + " = ");
           System.out.println(op.executarOperacao(num1,num2));
       }

    }
}
