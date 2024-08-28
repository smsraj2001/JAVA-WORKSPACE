package com.tvsmotor.day13.servicetest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import com.tvsmotor.day13.service.CalculatorService;

class CalculatorServiceTest 
{
	
	static CalculatorService calculatorService;
	
	@BeforeAll
	static void setUp()
	{
		calculatorService = new CalculatorService();
	}
	
	@AfterAll
	static void setDown()
	{
		System.out.println("Done with it...");
	}
	
	@BeforeEach
	void displayBeforeEach()
	{
		System.out.println("------------BEFORE EACH----------");
	}
	
	@AfterEach
	void displayAfterEach()
	{
		System.out.println("************AFTER EACH************");
	}
	
	@Test
	@DisplayName("Add Test")
	void addTest()
	{
		System.out.println("----------Add Test----------");
		/* Once the object declared in static method, 
		 * then no need to declare again and again in the subsequent methods.
		 */
//		CalculatorService calculatorService = new CalculatorService(); 
		assertEquals(4, calculatorService.add(2, 2));
	}
	
	@Test
	@DisplayName("Name Length Test")
	void nameTest()
	{
		System.out.println("----------Name Length Test----------");
//		CalculatorService calculatorService = new CalculatorService();
		assertEquals(9, calculatorService.countNameLength("Sutharsan"));
	}
	
	@Test
	@DisplayName("Eligible Test for True")
	void checkEligibilityTrueTest()
	{
		System.out.println("----------Eligible Test for True----------");
//		CalculatorService calculatorService = new CalculatorService();
		assertTrue(calculatorService.checkEligibility(19));
	}
	
	@Test
	@DisplayName("Eligible Test for False")
	@EnabledOnOs(value = OS.LINUX)
	void checkEligibilityFalseTest()
	{
		System.out.println("----------Eligible Test for False----------");
//		CalculatorService calculatorService = new CalculatorService();
		assertFalse(calculatorService.checkEligibility(8));
	}
	
	@Test
	@DisplayName("OS Test")
	@EnabledOnOs(value = OS.MAC)
	// @EnabledOnOs(value = OS.WINDOWS)
	void checkEligibilityFalseTestOnOS()
	{
		System.out.println("----------OS Test----------");
//		CalculatorService calculatorService = new CalculatorService();
		assertFalse(calculatorService.checkEligibility(8));
	}
}
