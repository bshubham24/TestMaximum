package com.capgi.testmaximum;

public class TestMaximum {
	public static Integer maximum(Integer a, Integer b, Integer c) {
		int max = a;
		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		return max;

	}

	public static String maximum(String a, String b, String c) {
		String max = a;
		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		return max;

	}

	public static Float maximum(Float a, Float b, Float c) {
		Float max = a;
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
