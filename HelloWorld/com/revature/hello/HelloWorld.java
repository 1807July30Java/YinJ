package com.revature.hello; //package declaration goes on the first line
/**
A package is just a namespace, and corresponds to a directory
**/

/**

	Class should be PascalCase
	One public class per file, and it must the same name as the file. 
	
**/
public class HelloWorld extends Foo{
	

	/**
		Main method is the point of entry into a Java program
		JRE looks for this signature. Static because we do not need an instance of our class.
		Methods should be lowerCamelCase
	**/
	public static void main(String[] args){
		System.out.println("Hello world");
		new Foo();
	}
}

class Foo extends Bar{
	static {
		System.out.println("Foo");
	}
}
class Bar{
	static {
		System.out.println("Bar");
	}
		
}