package fundamentos;

// Importar a classe NumberFormat
import java.text.NumberFormat;

// Importar a classe Locale
import java.util.Locale;

public class BalancoTrimestral {
    
    public static void main(String[] args) {
        
        double gastosJaneiro = 15000.0;
        double gastosFevereiro = 23000.0;
        double gastosMarco = 17000.0;

        double gastosTrimestral = gastosJaneiro + gastosFevereiro + gastosMarco;

        // Formatar o valor como moeda
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("pt-BR"));
        String gastosTrimestralFormatado = formatoMoeda.format(gastosTrimestral);

        System.out.println("O gasto trimestral deste ano foi " + gastosTrimestralFormatado);
    }

}
