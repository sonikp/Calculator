package com.example;

public class CalculatorImpl implements Calculator {

	@Override
	public int add(int i, int j) {
		long a = i;
		long b = j;
		
		long result = a + b;
		
		return checkAndReturn(result);
	}
	
	@Override
	public int subtract(int i, int j) {
		long a = i;
		long b = j;
		
		long result = a - b;
		
		return checkAndReturn(result);
	}

	private int checkAndReturn(long result) {
		if (result > Integer.MAX_VALUE)
		{
			throw new OverflowException();
		}
		
		if (result < Integer.MIN_VALUE)
		{
			throw new UnderflowException();
		}
		
		return (int) result;
	}
	


}
