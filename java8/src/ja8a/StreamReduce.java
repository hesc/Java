package ja8a;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamReduce {

	
	public static void main(String args[]) {
		
		
		final List<String> demoValues = Arrays.asList("A", "B", "C", "D", "E", "fdsgfd");
		System.out.println(demoValues.stream().reduce(String::concat));
		
		
//		System.out.println(demoValues.stream()
//			.reduce("X_", (v1,v2)->{
//			System.out.println("v1 -> " + v1);
//			System.out.println("v2 -> " + v2);
//			return v1.concat(v2)+"_";
//			}));
		
	}

	

}
