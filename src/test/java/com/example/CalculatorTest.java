package com.example;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calc;
	
	@Before	// method marked with 'before' tag will be run before the tests are run
	public void before()
	{
		calc = new CalculatorImpl();
	}

	@Test
	public void testAdd() {
		assertNotNull("calc is null", calc);
		assertEquals(101, calc.add(23, 78));
		
		try
		{
			calc.add(Integer.MAX_VALUE, 1);
			fail(OverflowException.class.getName() + " is expected");	// if it gets to this code, this is an alert to tell us that our test didn't work the way we expected
		}
		catch (OverflowException e)
		{
			
		}
		
		try
		{
			calc.add(Integer.MIN_VALUE, -1);
			fail(UnderflowException.class.getName() + " is expected");	// if it gets to this code, this is an alert to tell us that our test didn't work the way we expected
		}
		catch (UnderflowException e)
		{
		
		}	
	}
	
	@Test
	public void testSubtract() {
		assertNotNull("calc is null", calc);
		assertEquals(10, calc.subtract(20, 10));
		
		try
		{
			calc.subtract(Integer.MIN_VALUE, 1);
			fail(UnderflowException.class.getName() + " is expected");	// if it gets to this code, this is an alert to tell us that our test didn't work the way we expected
		}
		catch (UnderflowException e)
		{
			
		}
		
		try
		{
			calc.subtract(Integer.MAX_VALUE, -1);
			fail(OverflowException.class.getName() + " is expected");	// if it gets to this code, this is an alert to tell us that our test didn't work the way we expected
		}
		catch (OverflowException e)
		{
		
		}	
	}

}
