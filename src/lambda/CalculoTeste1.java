package lambda;

public class CalculoTeste1 {
    public static void main(String[] args) {

        Calculo calcular = new Soma();
        System.out.println(calcular.executar(2, 5));

        calcular = new Multiplicar();
        System.out.println(calcular.executar(2, 5));

    }
}
