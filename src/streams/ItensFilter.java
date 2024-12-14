package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ItensFilter {
	public static void main(String[] args) {
		
		Itens i1 = new Itens("Arroz", 1.000, 2025);
		Itens i2 = new Itens("Feijão", 2.000, 2026);
		Itens i3 = new Itens("Soja", 0.850, 2026);
		Itens i4 = new Itens("Macarão", 1.900, 2028);
		Itens i5 = new Itens("Aveia", 1.500, 2027);
		
		List<Itens> itens = Arrays.asList(i1, i2, i3, i4, i5);
		
		Predicate<Itens> condi = i -> i.peso >= 1.000 && i.validade >= 2025 && i.validade <= 2027;
		//Predicate<Itens> validadeIdeal = i -> i.validade >= 2026;
		Function<Itens, String> mensagem = i -> "O item: " + i.nome + ", está dentro das exigências";
		
		itens.stream()
		.filter(condi)
		//.filter(pesoIdeal)
		//.filter(validadeIdeal)
		.map(mensagem)
		.forEach(System.out::println);
	}

}
