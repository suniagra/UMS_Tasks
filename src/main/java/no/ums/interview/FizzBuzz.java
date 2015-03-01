package no.ums.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * FizzBuzz generator.
 *
 * @author Ståle Undheim <su@ums.no>
 */
public interface FizzBuzz {

    /**
     * Given an intStream, return a stream of strings following the FizzBuzz rules.
     *
     * Any number divisible by 3 should be replaced by Fizz.
     * Any number divisible by 5 should be replaced by Buzz.
     * Any number divisible by 15 should be replaced by FizzBuzz.
     * All other numbers as is.
     *
     * @param intStream source stream
     * @return FizzBuzzStream
     */
    static Stream<String> toFizzBuzzStream(IntStream intStream) {
    	
    	List<Integer> numbers = new ArrayList<>();
		numbers = intStream.parallel().boxed().collect(Collectors.toList());
		if(numbers.isEmpty())
		{ 
			throw new IllegalStateException ("List is empty = " +numbers);
		}
		
			int min = numbers.get(0);
			int max = Collections.max(numbers);
		
		if (min < 0) {
			throw new IllegalArgumentException("min is negative: min = " + min);
		}
		if (min > max) {
			throw new IllegalArgumentException("min > max: min = " + min + " / max = " + max);
		}
		return IntStream.rangeClosed(min, max).mapToObj(FizzBuzz::fizzBuzztest);
	}

	 static String fizzBuzztest(final int value) {

		String result = "";

		if (value % 3 == 0) {
			result += "Fizz";
		}
		if (value % 5 == 0) {
			result += "Buzz";
		}
		return result.length() > 0 ? result : Integer.toString(value);

	}
       
    

}
