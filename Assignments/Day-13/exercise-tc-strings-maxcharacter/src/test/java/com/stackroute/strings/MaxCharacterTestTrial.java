package com.stackroute.strings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class MaxCharacterTest 
{
	static MaxCharacter maxchar;
	
	@BeforeEach
	void displayBeforeEach()
	{
		System.out.println("------------BEFORE EACH----------");
	}
	
	@BeforeAll
	static void setUp()
	{
		maxchar = new MaxCharacter();
	}
	
	@AfterAll
	static void setDown()
	{
		System.out.println("Done running all the test cases.");
	}

	@ParameterizedTest
	@DisplayName("Maximum Alphabet Character Count Test")
	@CsvSource({
		"Java,a",
		"Hello,l",
		"Mississippis,s"
	})
	public void checkMaxCharacterCountforAlphabets(String name, char result)
	{
		assertEquals(result, maxchar.findMaxCharacterCount(name));
	}
	
	@ParameterizedTest
	@DisplayName("Maximum Digits Character Count Test")
	@CsvSource({
		"11010234,1",
		"243343243,3",
		"676766908,6"
	})
	public void checkMaxCharacterCountforSpecialCharacters(String name, char result)
	{
		assertEquals(result, maxchar.findMaxCharacterCount(name));
	}
	
	@ParameterizedTest
	@DisplayName("Maximum Special Character Count Test")
	@CsvSource({
		"#%$@@,@",
		"&*@**,*",
		"^^@--!-&%,-"
	})
	public void checkMaxCharacterCountforDigits(String name, char result)
	{
		assertEquals(result, maxchar.findMaxCharacterCount(name));
	}
}
