package ja8a;

import java.util.Random;
import java.util.stream.Stream;


public class RandomSort {
	
	
	public void sort() {
		Stream<Double> s = Stream.generate(Math::random);
		
		s.limit(100).peek(System.out::println).map(Math::round).peek(System.out::println).sorted().forEach(System.out::println);
//		s.limit(100).peek(System.out::println);
		
	}
	
	public void integerSort() {
		long numberOf = 200;
		int sum = Stream.generate(() -> new Random().nextInt(1000)).limit(numberOf).peek(System.out::println).reduce(0, (x,y) -> x+y);
		
		double avg = sum / numberOf;
		System.out.println("Sum: " + sum +", avgt.: " + avg);
		
	}
	
	
	

	public static void main(String[] args) {

		RandomSort rs = new RandomSort();
		rs.integerSort();
	}

}
