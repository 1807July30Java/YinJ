package com.revature.exception;

public class IllegalOperatorException extends Exception{
	public IllegalOperatorException(String input) {
		super(String.format("%0$ is not a legal operator.",input));
	}
}
