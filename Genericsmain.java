package com.generics;

public class Genericsmain {

	public static void main(String[] args) {
		System.out.println("welcome to Generics Program");
		Integer[] intArray = { 6, 8, 5, 7 };
		Float[] floatArray = { 6.3F, 7.2F, 3.4F, 5.2F };
		String[] stringArray = { "vipul", "ajay", "sam", "anusha" };
		MaxValue<Integer> maxValue = new MaxValue<>(intArray);
		maxValue.testMaximum();
		MaxValue<Float> maxValue1 = new MaxValue<>(floatArray);
		maxValue1.testMaximum();
		MaxValue<String> maxValue2 = new MaxValue<>(stringArray);
		maxValue2.testMaximum();
	}
}
