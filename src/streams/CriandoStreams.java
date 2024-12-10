package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		Stream<String> lang = Stream.of("Java ", "Lua ", "JS\n");
		lang.forEach(print);
		
		String[] maisLang = {"Python ", "Lisp ", "Perl ", "Go\n"};
		Stream.of(maisLang).forEach(print);
		Arrays.stream(maisLang).forEach(print);
		Arrays.stream(maisLang, 1, 3).forEach(print);
		
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
	}

}
