package com.TddPretical;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
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
		/*@Test
		public void OnlyOneNumberSuccessFaliure() {
			int result = StringCalculatatorPretical.add("2");
			assertEquals(1, result);
		}*/
		
		//Success
		@Test
		public void sumsTheTwoNumbersSccuess() {
			int result = StringCalculatatorPretical.add("1,2");
			assertEquals(3, result);
		}
		
		//Failure
		/*@Test
		public void sumsTheTwoNumbersFaliure() {
			int result = StringCalculatatorPretical.add("1,2");
			assertEquals(1, result);
		}*/
	
		
		@Test
		public void sumsAnUnknownAmountOfCommaSepreatedSuccess() {
			int result = StringCalculatatorPretical.add("1,2,3,4");
			assertEquals(1 + 2 + 3 + 4, result);
		}
		
		/*@Test
		public void sumsAnUnknownAmountOfCommaSepreatedFaliure() {
			int result = StringCalculatatorPretical.add("1,2,3,4");
			assertEquals(1 + 2 + 3 + 4+5, result);
		}*/
		
		//Success
		@Test
		public void canHandleNewLinesAsNumberDelimiterSuccess() {
			int result = StringCalculatatorPretical.addNew("1n2,3n4");
			assertEquals(1 + 2 + 3 + 4, result);
		}
			
		//Faliure 
		/*@Test
		public void canHandleNewLinesAsNumberDelimiterFaliure() {
			int result = StringCalculatatorPretical.addNew("1n2,3n4");
			assertEquals(1 + 2 + 3 + 4 +5, result);
		}*/
		
		//Success
		@Test
		public void SupportDiffrentDelimeterSuccess() {
			int result = StringCalculatatorPretical.SupportDiffrentDelimeter("//;n;;3;6;\n15");
			assertEquals(3+6+15, result);
		}
		
		//Faliure
		@Test
		public void SupportDiffrentDelimeterFaliure() {
			int result = StringCalculatatorPretical.SupportDiffrentDelimeter("//;n;;3;6;\n15");
			assertEquals(3+6+15+12, result);
		}
		
		@Test(expected = RuntimeException.class)
		public final void negativeNumber() {
			StringCalculatatorPretical.negativeNumber("3,-6,15,-18,40,20");
		}
		
		@Test
		public final void runTimeExceprtionGenerate() {
		    RuntimeException exception = null;
		    try {
		    	StringCalculatatorPretical.add("3,-6,15,-18,40,20");
		    } catch (RuntimeException e) {
		        exception = e;
		    }
		    Assert.assertNotNull(exception);
		    Assert.assertEquals("Negatives not allowed:", exception.getMessage());
		}
		
		
		
}
