package fundamentos;

public class Temperatura {

    public static void main(String[] args) {

        //Declaração de constante
        final double FATOR = 5.0 / 9.0;
        double AJUSTE = 32;

        //Cálculo da temperatura com variaveis
        double fahrenheit = 86;
        double celsius = (fahrenheit - AJUSTE) * FATOR;

        //Exibição da temperatura
        System.out.println("A temperatura de " + fahrenheit + "°F equivale a " + celsius + "°C.");
    }

}
