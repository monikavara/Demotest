package com.TddPretical;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	
	public static int SupportDiffrentDelimeter(final String numbers) {
	    String delimiter = ",|n";
	    String numbersWithoutDelimiter = numbers;
	    if (numbers.startsWith("//")) {
	        int delimiterIndex = numbers.indexOf("//") + 2;
	        delimiter = numbers.substring(delimiterIndex, delimiterIndex + 1);
	        numbersWithoutDelimiter = numbers.substring(numbers.indexOf("n") + 1);
	    }
	    return add(numbersWithoutDelimiter, delimiter);
	}

	private static int add(final String numbers, final String delimiter) {
	    int returnValue = 0;
	    String[] numbersArray = numbers.split(delimiter);
	    for (String number : numbersArray) {
	        if (!number.trim().isEmpty()) {
	            returnValue += Integer.parseInt(number.trim());
	        }
	    }
	    return returnValue;
	}
	
	public static int negativeNumber(final String numbers) {
        int returnValue = 0;
        String[] numbersArray = numbers.split(",");
        List<Integer> negativeNumbers = new ArrayList<Integer>();
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                int numberInt = Integer.parseInt(number.trim());
                if (numberInt < 0) {
                    negativeNumbers.add(numberInt);
                }else if (numberInt <= 1000) {
                    returnValue += numberInt;
                }
                returnValue += numberInt;
            }
        }
        if (negativeNumbers.size() > 0) {
            throw new RuntimeException("Negatives not allowed: " + negativeNumbers.toString());
        }
        return returnValue;     
    }
}
