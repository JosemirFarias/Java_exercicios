package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class CarroFilter {
	public static void main(String[] args) {
		
		Carro c1 = new Carro("Toyota", "Branco", 2024, 98.000);
		Carro c2 = new Carro("Fiat", "Branco", 2024, 60.000);
		Carro c3 = new Carro("Volkswagen", "Branco", 2024, 90.000);
		Carro c4 = new Carro("Hyundai", "Branco", 2023, 100.000);
		Carro c5 = new Carro("Honda", "Preto", 2024, 105.000);
		
		List<Carro> carros = Arrays.asList(c1, c2, c3, c4, c5);
		
		Predicate<Carro> corIdeal = c -> c.cor.equalsIgnoreCase("branco");
		Predicate<Carro> precoIdeal = c -> c.preco >= 90.000;
		Predicate<Carro> anoIdeal = c -> c.ano == 2024;
		Function<Carro, String> mensagem = c -> "Carro ideal: " + c.marca;
		
		carros.stream()
		.filter(corIdeal)
		.filter(precoIdeal)
		.filter(anoIdeal)
		.map(mensagem)
		.forEach(System.out::println);
	}

}
