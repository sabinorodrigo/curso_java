package com.rsg.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsArrays {

	public static void main(String[] args) {
		
		List<Integer> pares = Arrays.asList( 2, 3, 4, 5, 6, 7, 8, 9 );
		
		pares.stream().filter(num -> num % 2 == 0 && num <= 10).forEach(num -> System.out.println(num));
	}
}
