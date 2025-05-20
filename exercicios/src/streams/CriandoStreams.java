package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::println;
		
		Stream<String> langs = Stream.of("Java - ", "Lua - ", "JavaScript\n");
		langs.forEach(print);
		
		String[] outrasLangs = { "Ruby - ", "Lisp - ", "Perl - ", "Go\n"};
		
		Arrays.stream(outrasLangs).forEach(print);
		Stream.of("Python - ", "Rust - ", "Zig - ", "Kotlin\n").forEach(print);
		
		List<String> maisLangs = Arrays.asList("C - ", "C++ - ", "Cobol - ", "PHP\n");
		maisLangs.stream().forEach(print);
		System.out.println("\nStream Paralelo");
		maisLangs.parallelStream().forEach(print);
		
//		Stream.generate(() -> "a").forEach(print);
		Stream.iterate(0, n -> n + 1).forEach(println);
	}
	
}
