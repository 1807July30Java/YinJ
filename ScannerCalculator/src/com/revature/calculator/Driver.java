package com.revature.calculator;

import java.util.Scanner;
import java.util.function.BiFunction;

import com.revature.exception.IllegalOperatorException;

public class Driver {

	public static float parseInput(String input) {
		return 0;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an operator (+,-,*,/):");
		String op = input.nextLine();
		System.out.println("Enter a class (byte, short, int, long, float, double):");
		String className = "";
		while (!className.equals("byte") && !className.equals("short") 
				&& !className.equals("int") && !className.equals("long") 
				&& !className.equals("float") && !className.equals("double") ) {
			className = input.nextLine().toLowerCase();
		}
		String input1, input2;
		System.out.println("Enter the first operand");
		input1 = input.nextLine();
		System.out.println("Enter the second operand");
		input2 = input.nextLine();
		
		Number arg1=0, arg2 = 0;
		try { //I don't like this code duplication
			switch (className) {
				case "byte":
					arg1 = Byte.valueOf(input1);
					arg2 = Byte.valueOf(input2);
					break;
				case "short":
					arg1 = Short.valueOf(input1);
					arg2 = Short.valueOf(input2);
					break;
				case "int":
					arg1 = Integer.valueOf(input1);
					arg2 = Integer.valueOf(input2);
					break;
				case "long":
					arg1 = Long.valueOf(input1);
					arg2 = Long.valueOf(input2);
					break;
				case "float":
					arg1 = Float.valueOf(input1);
					arg2 = Float.valueOf(input2);
					break;
				case "double":
					arg1 = Double.valueOf(input1);
					arg2 = Double.valueOf(input2);
					break;
			}
			
		} catch (NumberFormatException e) {
			System.out.println("Unable to cast to requested type");
			throw e;
			
		}
		try {
			System.out.println(String.format("%s %s %s = %s", arg1.toString(),op,arg2.toString(), Calculator.calculate(op, arg1,arg2).toString()));
		}catch (ArithmeticException e) {
			System.out.println("Divide by zero");
		}catch (IllegalOperatorException e) {
			System.out.println("Unknown operator");
		}
		
		
	}

}
