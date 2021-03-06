package com.TddPretical;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalculatorTestPretical {

	//1.The method can take 0, 1 or 2 numbers, and will return their sum
	
		//Success
		
		@Test
		public void isZeroForAnEmptyStringSuccess() {
			int result = StringCalculatatorPretical.add("");
			assertEquals(0, result);
		}
		
		
		//Failure
		
		/*@Test
		public void isZeroForAnEmptyStringFailure() {
			int result = StringCalculatatorPretical.add("1");
			assertEquals(0, result);
		}*/
		
		
		//Success 
		@Test
		public void OnlyOneNumberSuccess() {
			int result = StringCalculatatorPretical.add("1");
			assertEquals(1, result);
		}
		
		//Failure
		@Test
		public void OnlyOneNumberSuccessFaliure() {
			int result = StringCalculatatorPretical.add("2");
			assertEquals(1, result);
		}
		
	
}
