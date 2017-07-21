package com.mimi.lamda;

import java.util.Arrays;

public class LamdaDemo {

	public static void main(String[] args) {
		Calculate add = (a, b) -> a + b;
		Calculate diff = (a, b ) -> Math.abs(a - b);
		Calculate multiple = (a, b) -> a * b;
		
		System.out.println(add.calc(10, 5));
		System.out.println(diff.calc(11,  34));
		System.out.println(multiple.calc(2, 9));
		
		Arrays.asList("Red", "Green", "Blue", "Yellow")
		.stream()
		.sorted()
		.findFirst()
		.ifPresent(System.out::println);
		
		
		
	}

}
