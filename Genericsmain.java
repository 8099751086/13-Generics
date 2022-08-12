package com.generics;

public class Genericsmain {

	public static void main(String[] args) {
		System.out.println("welcome to Generics Program");
		MaxString maxString = new MaxString();
		System.out.println("Test case 1");
		maxString.maxvalue("Peach", "Apple", "Banana");
		System.out.println("Test case 2");
		maxString.maxvalue("Apple", "Zach", "Banana");
		System.out.println("Test case 3");
		maxString.maxvalue("Apple", "Banana", "Class");
	}
}
