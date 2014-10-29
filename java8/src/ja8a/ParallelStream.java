package ja8a;

import java.util.Random;
import java.util.stream.Stream;


public class ParallelStream {
	
	
	public static void main(String[] args) {
		ParallelStream p = new ParallelStream();
		p.compar1(20,1000000);
	}
	

	public void compar1(int repetition, long numberOf) {
		
		//warmup
//		long numberOfWarmup = 1000000;
//		sumIntSeriell(numberOfWarmup);
//		sumIntParallel(numberOfWarmup);
		
		
		for(int i=1;i<=repetition;i++) {
			
			Stream<Integer> stream1 = getRandomStream(numberOf);
			Stream<Integer> stream2 = getRandomStream(numberOf).parallel();
			
			long t1 = System.nanoTime();
			sumIntSeriell(numberOf, stream1);
			long t2 = System.nanoTime();
			sumIntParallel(numberOf, stream2);
			long t3 = System.nanoTime();
			
			long tser = (t2-t1) / 1000000;
			long tpar = (t3-t2) / 1000000;
			
			System.out.println("seriell  " + tser + ", parallel " + tpar + " (" + i +")");
		}
		

		
		
	}
	
	public void sumIntParallel(long numberOf, Stream<Integer> stream) {
		stream.reduce(0, (x,y) -> x+y);
	}
	
	public void sumIntSeriell(long numberOf, Stream<Integer> stream) {
		stream.reduce(0, (x,y) -> x+y);
	}
	
	
	private Stream<Integer> getRandomStream(long numberOf) {
		return Stream.generate(() -> new Random().nextInt(1000)).limit(numberOf);
	}
	

	

}
