package com.generics;

public class Genericsmain {

	public static void main(String[] args) {
		System.out.println("welcome to Generics Program");
		MaxInteger maxInt = new MaxInteger();
		System.out.println("Test case 1");
		maxInt.maxvalue(7, 5, 6);
		System.out.println("Test case 2");
		maxInt.maxvalue(5, 6, 4);
		System.out.println("Test case 3");
		maxInt.maxvalue(5, 6, 8);
	}
}
