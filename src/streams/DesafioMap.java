package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();
		Function<String, Integer> binariParaInt = s -> Integer.parseInt(s, 2);
		
		nums.stream()
			.map(Integer::toBinaryString) // Converte número para string binária... 6 => "110"
			.map(inverter) // Inverte a string... "110" => "011"
			.map(binariParaInt) // Converte de volta para inteiro => "011" => 3
			.forEach(System.out::println);
	}

}
