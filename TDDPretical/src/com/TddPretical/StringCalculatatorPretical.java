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
	
	
	public static int addNew(String numbers) {
	    int returnValue = 0;
	    String[] numbersArray = numbers.split(",|n"); // Added |n to the split regex
	    for (String number : numbersArray) {
	        if (!number.trim().isEmpty()) {
	            returnValue += Integer.parseInt(number.trim());
	        }
	    }
	    return returnValue;
	}
	
}
