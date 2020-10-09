package com.capgi.testmaximum;

import java.util.ArrayList;
import java.util.Collections;

public class TestMaximum<T extends Comparable<T>> {

	ArrayList<T> list = new ArrayList<>();

	public TestMaximum(T... values) {
		for (T value : values)
			this.list.add(value);
	}

	public T maximum() {
		return maximum(list);
	}

	public static <T extends Comparable<T>> T maximum(ArrayList<T> list) {
		if (list.size() == 0)
			return null;
		else
			return Collections.max(list);
	}
}
