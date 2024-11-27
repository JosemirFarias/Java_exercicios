package lambda;

public class CalculoTeste2 {
    public static void main(String[] args) {

        // Usando lambda
        Calculo calculo = (x, y) -> {
            return x + y;
        };
        System.out.println(calculo.executar(2, 3));

        calculo = (x, y) -> {
            return x * y;
        };
        System.out.println(calculo.executar(2, 3));
    }
}
