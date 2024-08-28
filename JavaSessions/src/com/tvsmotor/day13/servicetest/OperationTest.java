package com.tvsmotor.day13.servicetest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.tvsmotor.day13.service.Operation;

class OperationTest 
{

	@ParameterizedTest
	@ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12})
	@DisplayName("Even Test")
	public void checkEvenTest(int number)
	{
		Operation operation = new Operation();
		assertTrue(operation.isEven(number));
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"malayalam", "tamil", "drawing", "level", "aba", "kilo"})
	@DisplayName("Palindrome Test")
	public void checkPalindromeTest(String word)
	{
		Operation operation = new Operation();
		assertTrue(operation.isPalindromeString(word));
	}
	
	
	@ParameterizedTest
	@CsvSource({
		"hi,HI",
		"hello,HELLO",
		"java,JAVA",
		"hel,Hel",
	})
	public void upperCaseTest(String name, String result)
	{
		Operation operation = new Operation();
		assertEquals(result, operation.convertToUpperCase(name));
		
	}

}
