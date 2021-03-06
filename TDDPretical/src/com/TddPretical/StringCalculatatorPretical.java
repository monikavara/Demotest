package com.TddPretical;

public class StringCalculatatorPretical {

	public static int add(String stringOfNumbers) {
		if (stringOfNumbers.isEmpty())
			return 0;		
		String[] numbers = stringOfNumbers.split(",");
		int sum = 0;
		for (String eachNumber : numbers) {
			sum += Integer.valueOf(eachNumber);
		}

		return sum;
	}
	
	
}
