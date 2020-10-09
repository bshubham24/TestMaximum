package com.capgi.testmaximum;

public class TestMaximum<T extends Comparable<T>> {
	T a, b, c;

	public TestMaximum(T a, T b, T c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public T maximum() {
		return TestMaximum.maximum(a, b, c);
	}

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
		Integer aInt = 100, bInt = 50, cInt = 40;
		String aStr = "Eat", bStr = "Sleep", cStr = "Working";
		Float aFloat = 12.12345f, bFloat = 34.12543f, cFloat = 98.4598f;
		new TestMaximum(aInt, bInt, cInt).maximum();
		new TestMaximum(aStr, bStr, cStr).maximum();
		new TestMaximum(aFloat, bFloat, cFloat).maximum();

	}
}
