package com.example.devopsdemo3;

import org.springframework.stereotype.Component;

@Component
public class BasicCalculation {
	private int a = 5;
	private int b = 10;
	private int c = 0;
	public int sum(int a, int b) {
		c = a + b;
		System.out.println("Sum is : " + c);
		return c;
	}
	
	public int subtraction(int a, int b) {
		c = b-a;
		System.out.println("Subtraction is : " + c);
		return c;
	}
	
	public int multiply(int a, int b) {
		c = b*a;
		System.out.println("Multiplication is : " + c);
		return c;
	}
	
	public int devide(int a, int b) {
		c = b/a;
		System.out.println("Division is : " + c);
		return c;
	}

}
