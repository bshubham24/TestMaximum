package com.capgi.testmaximum;

public class TestMaximum {

	public static <T extends Comparable<T>> T maximum(T a, T b, T c) {
		T max = a;
		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		return max;

	}

	public static void main(String[] args) {
		int maxInt = maximum(100, 59, 40);
		System.out.println(maxInt);
		String maxStr = maximum("Eat", "Sleep", "Working");
		System.out.println(maxStr);
		Float maxFloat = maximum(12.12345f, 34.12543f, 98.4598f);
		System.out.println(maxFloat);
	}
}
