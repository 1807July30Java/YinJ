package com.revature.calculator;

import java.util.function.BiFunction;

import com.revature.exception.IllegalOperatorException;

public class Calculator {
	
	
	//public static <T extends Number> T calculate(char op, T arg1, T arg2) {
	public static Number calculate(String op, Number arg1, Number arg2) throws ArithmeticException, IllegalOperatorException{
		Class clazz = arg1.getClass();
		
			switch (op) {
				case "+": return arg1.doubleValue() + arg2.doubleValue();
				case "-": return arg1.doubleValue() - arg2.doubleValue();
				case "*": return arg1.doubleValue() * arg2.doubleValue();
				case "/":
					try {
						return arg1.doubleValue() / arg2.doubleValue();
						
					}catch (ArithmeticException e) {
						throw(e);
					}
				default:
					throw new IllegalOperatorException(op);
					
			}
		
	}
}
