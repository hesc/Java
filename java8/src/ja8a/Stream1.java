package ja8a;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream1 {

	
	public static void main(String args[]) {
	
		createStreams();
	}

	
	static void createStreams() {

		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		stream.forEach(p -> System.out.println(p));
		
		IntStream i = new Random().ints(0, 100);
		i.limit(100).forEach(System.out::println);

	}

	static void filter1() {
		List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
		features.forEach(n -> System.out.println(n));

		System.out.println("\n\n");

		features.stream().filter(s -> s.startsWith("L")).forEach(System.out::println);
		;

		List<String> filteredFeatures = features.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
		System.out.println("\n\nfilteredFeatures");
		filteredFeatures.stream().forEach(s -> System.out.println(s));
	}

}
